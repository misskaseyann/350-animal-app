package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
import dev.tilegame.worlds.World;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class SaveState extends State {

    /**
     * MenuState constructor.
     *
     * @param manager game class manager
     */
    public SaveState(Manager manager) {
        super(manager);
    }

    @Override
    public void tick() {
        // Set x and y coordinates.
        int x = manager.getMouseManager().getMouseX();
        int y = manager.getMouseManager().getMouseY();


        //String name = "hellow is it me youre looking for ";
        String name = JOptionPane.showInputDialog("Enter a name for your file");
        if (name == "" || name == null /* or any amount of spaces*/) {
            JOptionPane.showMessageDialog(null, "You need to include a name if you would like to save a game");
            //buggy
        }
        //strip the spaces tho
        name = name.replaceAll("\\s+","");

        File file = new File("../350-animal-app/savedData/" + name + ".txt");

        try {
            PrintWriter writer = new PrintWriter("../350-animal-app/savedData/" + name + ".txt");

//          writer.println("Xloc: "+ State.getCurrentState().manager.getPet().gridLocX());
//          writer.println("Yloc: "+ State.getCurrentState().manager.getPet().gridLocY());
            writer.println("State: " + "the room of save or always load from home? applies to above stats");
            writer.println("Items: ");
            writer.println("Money: ");
            writer.println("Health: ");
            writer.println("Happiness: ");
            writer.println("Hygene: ");
            writer.println("Hunger: ");

            writer.close();
            JOptionPane.showMessageDialog(null, "File "+name+" saved your current game!");
            State.setState(State.getLastState());
        } catch (IOException ie) {
            ie.printStackTrace();
        }

    }

    @Override
    public void render(Graphics g) {

    }

    @Override
    public World getWorld() {
        return null;
    }
}
