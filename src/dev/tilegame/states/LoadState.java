package dev.tilegame.states;

import dev.tilegame.Game;
import dev.tilegame.Manager;
import dev.tilegame.entities.animals.Pet;
import dev.tilegame.gfx.Assets;
import dev.tilegame.player.Player;
import dev.tilegame.worlds.World;

import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Pause/main menu for the game.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class LoadState extends State {
    Game game ;
    Pet pet ;
    Player player;
    /**
     * MenuState constructor.
     * @param manager game class manager
     */
    public LoadState(Manager manager) {
        super(manager);
        game = manager.getGame();
        player = manager.getPlayer();
        pet = manager.getPet();
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
        int xspawn = Integer.parseInt(info[0].substring(info[0].indexOf(':')+1));
        int yspawn = Integer.parseInt(info[1].substring(info[1].indexOf(':')+1));
        String items = info[2].substring(info[2].indexOf(':')+1);
        int money = Integer.parseInt(info[3].substring(info[3].indexOf(':')+1));
        int health = Integer.parseInt(info[4].substring(info[4].indexOf(':')+1));
        int happy = Integer.parseInt(info[5].substring(info[5].indexOf(':')+1));
        int clean = Integer.parseInt(info[6].substring(info[6].indexOf(':')+1));
        int hunger = Integer.parseInt(info[7].substring(info[7].indexOf(':')+1));
        System.out.println(xspawn+ " "+yspawn+" "+items+" "+money+" "+ health + " " + happy + " " + clean + " " + hunger);
        State.setState(State.getLastState());
    }

    /**
     * Render main menu screen.
     * @param g graphics object.
     */
    @Override
    public void render(Graphics g)  {
        // TODO make menu prettier and add exit to title button
    }

    /**
     * @return null/no world in this state
     */
    public World getWorld(){ return null; }
}
