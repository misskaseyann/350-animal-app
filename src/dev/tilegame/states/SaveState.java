package dev.tilegame.states;

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

/**
 * Save state.
 *
 * @author allisonbolen
 * @version 11.11.2017
 */
public class SaveState extends State {
    /** pet to save the stats of. */
    Pet pet;
    /** ßPlayer to save the inventory and money from. */
    Player player;

    /**
     * SaveState constructor.
     *
     * @param manager game class manager
     */
    public SaveState(final Manager manager) {
        super(manager);
        player = manager.getPlayer();
        pet = manager.getPet();
    }

    /**
     * Waits for mouse clicks.
     */
    @Override
    public void tick() {
        String itemlist;
        StringBuffer buf = new StringBuffer();
        if (player.getInventory().getItemList().size() > 0) {
            for (Item item : player.getInventory().getItemList()) {
                buf.append(item.getName() + ",");
            }
            itemlist = buf.toString();
        } else {
            itemlist = "NA";
        }
        //String name = "hellow is it me youre looking for ";
        String name = JOptionPane.showInputDialog("Enter a name for your file.");

        if (name != null) {
            name = name.replaceAll("\\s+", "");
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "You need to include a name if you would like to save a game");
                State.setState(State.getLastState());
            } else {
                File file = new File("../350-animal-app/savedData/" + name + ".txt");
                try {
                    PrintWriter writer = new PrintWriter(file, "UTF-8");
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
        } else {
            State.setState(State.getLastState());
        }
    }

    /**
     * @param g graphics object.
     */
    @Override
    public void render(final Graphics g) {

    }

    /**
     * @return current world.
     */
    @Override
    public World getWorld() {
        return null;
    }

    /**
     * @return save state string.
     */
    public String toString() {
        return "Save State";
    }

}
