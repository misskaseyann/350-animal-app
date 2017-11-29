package dev.tilegame.states;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.entities.animals.Pet;
import dev.tilegame.inventory.Inventory;
import dev.tilegame.inventory.items.*;
import dev.tilegame.player.Player;
import dev.tilegame.stats.StatsManager;
import dev.tilegame.worlds.World;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

/**
 * Pause/main menu for the game.
 *
 * @author kaseystowell
 * @version 09.24.2017
 */
public class LoadState extends State {
    Game game;
    Pet pet;
    Player player;
    StatsManager statsManager;
    GameState gs;

    /**
     * MenuState constructor.
     *
     * @param manager game class manager
     */
    public LoadState(Manager manager) {
        super(manager);
        game = manager.getGame();
        player = manager.getPlayer();
        pet = manager.getPet();
        //statsManager = new StatsManager(pet);
    }

    /**
     * Checks for button presses.
     */
    @Override
    public void tick() {
        // Did the mouse left click?
        String name = "hellor";
        String content = null;
        try {
            content = new Scanner(new File("../350-animal-app/savedData/" + name + ".txt")).useDelimiter("\\Z").next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(content);
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
        System.out.println(xspawn + " " + yspawn + " " + items + " " + money + " " + health + " " + happy + " " + clean + " " + hunger);

        Inventory inven = new Inventory(manager);
        //set xspawn and yspawn
       // pet.setX(xspawn);
       // pet.setY(yspawn);
        //set items
        for (String i : itemList) {
            if (i.equals("Bacon Treat")) {
                BaconTreat bt = new BaconTreat();
                inven.addItem(bt);
            }
            else if (i.equals("Chew Toy")) {
                ChewToy ct = new ChewToy();
                inven.addItem(ct);
            }
            else if (i.equals("Dog Biscuit")) {
                DogBiscuit db = new DogBiscuit();
                inven.addItem(db);
            }
            else if (i.equals("Dog Bone")) {
                DogBone dbo = new DogBone();
                inven.addItem(dbo);
            }
            else if (i.equals("Dog Food Premium")) {
                DogFoodPremium dfp = new DogFoodPremium();
                inven.addItem(dfp);
            }
            else if (i.equals("Dog Food Standard")) {
                DogFoodStandard dfs = new DogFoodStandard();
                inven.addItem(dfs);
            }
            else if (i.equals("Stuffed Animal")) {
                StuffedAnimal sa = new StuffedAnimal();
                inven.addItem(sa);
            }
            else if (i.equals("Tennis Ball")) {
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

        manager.setPet(pet);
        manager.setPlayer(player);

        //set game state == new
        State.setState(manager.getGame().getGameState());

    }

    /**
     * Render main menu screen.
     *
     * @param g graphics object.
     */
    @Override
    public void render(Graphics g) {
        // TODO make menu prettier and add exit to title button
        JFrame load = new JFrame();
        final JFileChooser fc = new JFileChooser();

    }

    /**
     * @return null/no world in this state
     */
    public World getWorld() {
        return null;
    }
}
