package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
import dev.tilegame.worlds.World;

import javax.swing.*;
import java.awt.*;
import java.io.*;

/**
 * Pause/main menu for the game.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class MenuState extends State {

    /**
     * MenuState constructor.
     * @param manager game class manager
     */
    public MenuState(Manager manager) {
        super(manager);
    }

    /**
     * Checks for button presses.
     */
    @Override
    public void tick() {
        // Did the mouse left click?
        if (manager.getMouseManager().getLeftPress()) {
            // Set x and y coordinates.
            int x = manager.getMouseManager().getMouseX();
            int y = manager.getMouseManager().getMouseY();
            // Save Button
            if ((x > 70 && x < 292) && (y > 204 && y < 268)) {
                // TODO implement saving the game
                //buggy
                String name = JOptionPane.showInputDialog("Enter a name for your file");
                if(name == "" || name == null /* or any amount of spaces*/){
                    JOptionPane.showMessageDialog(null, "You need to include a name if you would like to save a game");
                    //buggy
                }
                File file = new File("../350-animal-app/savedData/"+name+".txt");

                try {
                    PrintWriter writer = new PrintWriter("../350-animal-app/savedData/"+name+".txt");

//                    writer.println("Xloc: "+ State.getCurrentState().manager.getPet().gridLocX());
//                    writer.println("Yloc: "+ State.getCurrentState().manager.getPet().gridLocY());
                    writer.println("State: "+ "the room of save or always load from home? applies to above stats");
                    writer.println("Items: ");
                    writer.println("Money: ");
                    writer.println("Health: ");
                    writer.println("Happiness: ");
                    writer.println("Hygene: ");
                    writer.println("Hunger: ");

                    writer.close();
                } catch(IOException ie) {
                    ie.printStackTrace();
                }
            }
            // Load Button
            if ((x > 70 && x < 292) && (y > 297 && y < 340)) {
//                BufferedReader br = new BufferedReader(
//                        new InputStreamReader(new FileInputStream(fileName)));
//                try {
//                    String line;
//                    while ((line = br.readLine()) != null) {
//                        // process line
//                    }
//                } finally {
//                    br.close();
//                }
            }
            // Back Button
            if ((x > 70 && x < 292) && (y > 392 && y < 456)) {
                State.setState(State.getLastState());
            }
        }
    }

    /**
     * Render main menu screen.
     * @param g graphics object.
     */
    @Override
    public void render(Graphics g) {
        // TODO make menu prettier and add exit to title button
        g.drawImage(Assets.getPauseMenu(), 0, 0, null);
    }

    /**
     * @return null/no world in this state
     */
    public World getWorld(){ return null; }
}
