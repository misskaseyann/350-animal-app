package dev.tilegame;

import dev.tilegame.display.Display;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Launcher {
    // start game
    public static void main(String[] args) {
        Game game = new Game("Test Game", 360, 640);
        game.start();
    }
}
