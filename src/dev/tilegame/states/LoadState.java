package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.entities.animals.Pet;
import dev.tilegame.inventory.Inventory;
import dev.tilegame.inventory.items.*;
import dev.tilegame.player.Player;
import dev.tilegame.worlds.World;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

/**
 * Load state.
 *
 * @author allisonbolen
 * @version 11.10.2017
 */
public class LoadState extends State {
    /** the pet needs to be loaded to. */
    private Pet pet;
    /** the player needs to be loaded to. */
    private Player player;

    /**
     * MenuState constructor.
     *
     * @param manager game class manager
     */
    public LoadState(final Manager manager) {
        super(manager);
        player = manager.getPlayer();
        pet = manager.getPet();
        //statsManager = new StatsManager(pet);
    }

    /**
     * Checks for button presses.
     */
    @Override
    public void tick() {
        String content = null;
        String name = JOptionPane.showInputDialog("Enter a name for your file");
        if (name != null) {
            if (name == "") {
                JOptionPane.showMessageDialog(null, "You need to include a name if you would like to save a game");
                State.setState(State.getLastState());
            }
            try {
                content = new Scanner(new File("../350-animal-app/savedData/" + name + ".txt")).useDelimiter("\\Z").next();
                //parse content
                String[] info = content.split("\n");
                int xspawn = Integer.parseInt(info[0].substring(info[0].indexOf(':') + 1));
                int yspawn = Integer.parseInt(info[1].substring(info[1].indexOf(':') + 1));
                String items = info[2].substring(info[2].indexOf(':') + 1);
                String[] itemList = items.split(",");
                int money = Integer.parseInt(info[3].substring(info[3].indexOf(':') + 1));
                int health = Integer.parseInt(info[4].substring(info[4].indexOf(':') + 1));
                int happy = Integer.parseInt(info[5].substring(info[5].indexOf(':') + 1));
                int clean = Integer.parseInt(info[6].substring(info[6].indexOf(':') + 1));
                int hunger = Integer.parseInt(info[7].substring(info[7].indexOf(':') + 1));

                Inventory inven = new Inventory(manager);
                for (String i : itemList) {
                    if (i.equals("Bacon Treat")) {
                        BaconTreat bt = new BaconTreat();
                        inven.addItem(bt);
                    } else if (i.equals("Chew Toy")) {
                        ChewToy ct = new ChewToy();
                        inven.addItem(ct);
                    } else if (i.equals("Dog Biscuit")) {
                        DogBiscuit db = new DogBiscuit();
                        inven.addItem(db);
                    } else if (i.equals("Dog Bone")) {
                        DogBone dbo = new DogBone();
                        inven.addItem(dbo);
                    } else if (i.equals("Dog Food Premium")) {
                        DogFoodPremium dfp = new DogFoodPremium();
                        inven.addItem(dfp);
                    } else if (i.equals("Dog Food Standard")) {
                        DogFoodStandard dfs = new DogFoodStandard();
                        inven.addItem(dfs);
                    } else if (i.equals("Stuffed Animal")) {
                        StuffedAnimal sa = new StuffedAnimal();
                        inven.addItem(sa);
                    } else if (i.equals("Tennis Ball")) {
                        TennisBall tb = new TennisBall();
                        inven.addItem(tb);
                    }
                }
                //set inventory
                player.setInventory(inven);
                //set money
                player.setMoney(money);
                //set health
                pet.setHealth(health);
                //set happy
                pet.setHappiness(happy);
                //set clean
                pet.setCleanliness(clean);
                // set hunger
                pet.setHunger(hunger);
                //set pet and player to load to
                manager.setPet(pet);
                manager.setPlayer(player);

                //set game state == new
                State.setState(manager.getGame().getGameState());
            } catch (FileNotFoundException e) {
                //if hte file doesnt exist
                JOptionPane.showMessageDialog(null, "<html>The file <b>\"" + name + "\"</b> is non-existent. \n The directory \"/350-animal-app/savedData/\" is where the files are saved. \n Please make sure your spelled your file name correctly and that it is in the right directory.");
                System.out.println(State.getLastState());
                State.setState(State.getLastState());
            }
        } else {
            // if the player hit cancel or exit
            State.setState(State.getLastState());

        }


    }

    /**
     * Render main menu screen.
     *
     * @param g graphics object.
     */
    @Override
    public void render(final Graphics g) {
        // TODO make menu prettier and add exit to title button

    }

    /**
     * @return null/no world in this state
     */
    public World getWorld() {
        return null;
    }
}
