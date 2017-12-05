package dev.tilegame;

/**
 * Launches the game.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Launcher {

    /**
     * Main function and game launcher.
     * @param args string arguments.
     */
    public static void main(final String[] args)  {
        Game game = new Game("Petgotchi", 360, 640);
        game.start();
    }
}

