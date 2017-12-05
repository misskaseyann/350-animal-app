package dev.tilegame;

import dev.tilegame.display.Display;
import dev.tilegame.gfx.Assets;
import dev.tilegame.gfx.GameCamera;
import dev.tilegame.input.KeyManager;
import dev.tilegame.input.MouseManager;
import dev.tilegame.player.Player;
import dev.tilegame.sound.LoopLoader;
import dev.tilegame.states.*;

import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Starts, runs, and closes everything.
 *
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Game implements Runnable {

    private Display display;
    private int width, height;
    private String title;
    private boolean running = false;
    private Thread thread;
    private BufferStrategy bs;
    private Graphics g;

    //States
    private State gameState, menuState, titleState, inventoryState, travelState, parkState, storeState,
            saveState, loadState, vetState;

    //Input
    private KeyManager keyManager;
    private MouseManager mouseManager;

    //Camera
    private GameCamera gameCamera;

    // Manager
    private Manager manager;

    //Player
    private Player player;

    private LoopLoader music;


    /**
     * Game constructor.
     * Initializes key and mouse listeners.
     *
     * @param title  title of game window.
     * @param width  width of game window.
     * @param height height of game window.
     */
    public Game(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
        keyManager = new KeyManager();
        mouseManager = new MouseManager();
    }

    /**
     * Initialize the display, create game states, set starting state to the title screen.
     */
    private void init() {
        // Create display and add keylistener.
        display = new Display(title, width, height);
        display.getFrame().addKeyListener(keyManager);
        // Create canvas set both it and the frame for mouselistener.
        display.getFrame().addMouseListener(mouseManager);
        display.getFrame().addMouseMotionListener(mouseManager);
        display.getCanvas().addMouseListener(mouseManager);
        display.getCanvas().addMouseMotionListener(mouseManager);
        // Create all game assets.
        Assets.init();
        // Set up game camera and class manager.
        gameCamera = new GameCamera(this, 0, 0);
        manager = new Manager(this);
        player = new Player(manager);
        manager.setPlayer(player);
        // music
        music = new LoopLoader();
        manager.setLoopLoader(music);
        // Create states of the game.
        gameState = new GameState(manager);
        menuState = new MenuState(manager);
        titleState = new TitleState(manager);
        inventoryState = new InventoryState(manager);
        travelState = new TravelState(manager);
        parkState = new ParkState(manager);
        storeState = new StoreState(manager);
        saveState = new SaveState(manager);
        loadState = new LoadState(manager);
        vetState = new VetState(manager);
        State.setState(titleState);
    }

    /**
     * Tick the game.
     */
    private void tick() {
        keyManager.tick();
        if (State.getCurrentState() != null)
            State.getCurrentState().tick();
    }

    /**
     * Tell the computer how to draw on the screen.
     */
    private void render() {
        // initializes our buffer strategy to the canvas buffer strategy
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            // three buffers so we can draw on a 'hidden screen' before we display.
            display.getCanvas().createBufferStrategy(3); // max buffers we need
            return;
        }
        // graphics paintbrush
        g = bs.getDrawGraphics();
        // clear screen
        g.clearRect(0, 0, width, height);
        // draw the state
        if (State.getCurrentState() != null)
            State.getCurrentState().render(g);
        // show what was drawn
        bs.show();
        // elimate graphics properly
        g.dispose();
    }

    /**
     * Game engine loop.
     */
    public void run() {
        init();
        synchronized(this) {
            double fps = 60.0;
            double timePerTick = 1000000000 / fps;  // one second in nanoseconds divided by fps
            double delta = 0;
            long now;
            long lastTime = System.nanoTime();
            long timer = 0;
            int ticks = 0;
            // delta says when we can run tick and render
            while (running) {
                now = System.nanoTime();
                // delta says when we can run tick and render
                delta += (now - lastTime) / timePerTick; // time past since call / max time allowed
                timer += now - lastTime;
                lastTime = now;
                if (delta >= 1) {
                    tick();
                    render();
                    ticks++;
                    delta--;
                }
                // if timer running for one second... see FPS
                if (timer >= 1000000000) {
                    System.out.println("Ticks and Frames: " + ticks);
                    ticks = 0;
                    timer = 0;
                }
            }
        }
        stop();
    }

    /**
     * Directly start thread.
     */
    public synchronized void start() {
        if (running) // if already running, dont repeat
            return;
        running = true;
        thread = new Thread(this); // run game class on the thread
        thread.start(); // starts run method
    }

    /**
     * Directly stop thread.
     */
    public synchronized void stop() {
        if (!running) // if already not running, dont repeat
            return;
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // GETTERS

    /**
     * @return key manager.
     */
    public KeyManager getKeyManager() {
        return keyManager;
    }

    /**
     * @return mouse manager.
     */
    public MouseManager getMouseManager() {
        return mouseManager;
    }

    /**
     * @return game camera.
     */
    public GameCamera getGameCamera() {
        return gameCamera;
    }

    /**
     * @return screen width.
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return screen height.
     */
    public int getHeight() {
        return height;
    }

    /**
     * @return menu state.
     */
    public State getMenuState() {
        return menuState;
    }

    /**
     * @return title state.
     */
    public State getTitleState() {
        return titleState;
    }

    /**
     * @return game state.
     */
    public State getGameState() {
        return gameState;
    }

    /**
     * @return inventory state.
     */
    public State getInventoryState() {
        return inventoryState;
    }

    /**
     * @return travel state.
     */
    public State getTravelState() {
        return travelState;
    }

    /**
     * @return park state.
     */
    public State getParkState() {
        return parkState;
    }

    /**
     * @return store state.
     */
    public State getStoreState() {
        return storeState;
    }

    /**
     * @return save state.
     */
    public State getSaveState() {
        return saveState;
    }

    /**
     * @return load state.
     */
    public State getLoadState() {
        return loadState;
    }

    /**
     * Set the games player.
     * @param player Player object.
     */
    public void setPlayer(Player player) { this.player = player; }

    /**
     * @return vet state.
     */
    public State getVetState() {
        return vetState;
    }
}
