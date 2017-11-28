package dev.tilegame.states;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.inventory.Item;
import dev.tilegame.player.Player;
import dev.tilegame.worlds.World;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


import dev.tilegame.entities.animals.Pet;

public class SaveState extends State {

    Game game ;
    Pet pet ;
    Player player;

    /**
     * SaveState constructor.
     *
     * @param manager game class manager
     */
    public SaveState(Manager manager) {
        super(manager);
        game = manager.getGame();
        player = manager.getPlayer();
        pet = manager.getPet();
    }

    @Override
    public void tick() {
        // Set x and y coordinates.
        int x = manager.getMouseManager().getMouseX();
        int y = manager.getMouseManager().getMouseY();
        String itemlist = "";
        if(player.getInventory().getItemList().size() > 0) {
            for (Item item : player.getInventory().getItemList()) {
                System.out.println(item.getName());
                itemlist += item.getName() + ",";
            }
        }
        else {itemlist = "NA";}
        //String name = "hellow is it me youre looking for ";
        String name = JOptionPane.showInputDialog("Enter a name for your file");
        //strip the spaces tho
        name = name.replaceAll("\\s+", "");
        if (name == "" || name == null /* or any amount of spaces*/) {
            JOptionPane.showMessageDialog(null, "You need to include a name if you would like to save a game");
            //buggy
        }
        File file = new File("../350-animal-app/savedData/" + name + ".txt");
        try {
            PrintWriter writer = new PrintWriter("../350-animal-app/savedData/" + name + ".txt");

            //writer.println("State: " + State.getLastState()); will always load to game state with the following data
            writer.println("Xloc:" + State.getCurrentState().manager.getPet().gridLocX());
            writer.println("Yloc:" + State.getCurrentState().manager.getPet().gridLocY());
            writer.println("Items:" + itemlist);
            writer.println("Money:" + player.getMoney());
            writer.println("Health:" + pet.getHealth());
            writer.println("Happiness:" + pet.getHappiness());
            writer.println("Hygene:" + pet.getCleanliness());
            writer.println("Hunger:" + pet.getHunger());

            writer.close();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
        JOptionPane.showMessageDialog(null, "<html>File <b>" + name + "</b> saved your current game! </html>");
        State.setState(State.getLastState());
    }

    @Override
    public void render(Graphics g) {

    }

    @Override
    public World getWorld() {
        return null;
    }

    public String toString() {
        return "Save State";
    }

}