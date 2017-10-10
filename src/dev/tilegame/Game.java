package dev.tilegame;

import dev.tilegame.display.Display;
import dev.tilegame.gfx.Assets;
import dev.tilegame.gfx.GameCamera;
import dev.tilegame.input.KeyManager;
import dev.tilegame.input.MouseManager;
import dev.tilegame.states.GameState;
import dev.tilegame.states.MenuState;
import dev.tilegame.states.State;
import dev.tilegame.states.TitleState;
import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Starts, runs, and closes everything.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Game implements Runnable {
    /**
     *
     */
    private Display display;
    /**
     *
     */
    private int width, height;
    /**
     *
     */
    private String title;
    /**
     *
     */
    private boolean running = false;
    /**
     *
     */
    private Thread thread;
    /**
     *
     */
    private BufferStrategy bs;
    /**
     *
     */
    private Graphics g;

    //States
    /**
     *
     */
    private State gameState, menuState, titleState;

    //Input
    /**
     *
     */
    private KeyManager keyManager;
    private MouseManager mouseManager;

    //Camera
    private GameCamera gameCamera;

    // Manager
    private Manager manager;


    public Game(String title, int width, int height) {
        this.width = width;
        this.height = height;
        this.title = title;
        keyManager = new KeyManager();
        mouseManager = new MouseManager();
    }

    // initialize display
    private void init() {
        display = new Display(title, width, height);
        display.getFrame().addKeyListener(keyManager);

        // set canvas and frame for mouselistener
        display.getFrame().addMouseListener(mouseManager);
        display.getFrame().addMouseMotionListener(mouseManager);
        display.getCanvas().addMouseListener(mouseManager);
        display.getCanvas().addMouseMotionListener(mouseManager);

        Assets.init(); // create all game assets

        gameCamera = new GameCamera(this,0,0);
        manager = new Manager(this);

        gameState = new GameState(manager);
        menuState = new MenuState(manager);
        titleState = new TitleState(manager);
        State.setState(titleState);
    }

    private void tick() {
        keyManager.tick();

        if(State.getCurrentState() != null)
            State.getCurrentState().tick();
    }

    private void render() {
        // tells computer how to draw to screen
        // initializes our buffer strategy to the canvas buffer strategy
        // we are drawing on 'hidden screen' before we display
        bs = display.getCanvas().getBufferStrategy();
        if (bs == null) {
            display.getCanvas().createBufferStrategy(3); // max buffers we need
            return;
        }

        g = bs.getDrawGraphics(); // our magical paintbrush
        // Clear Screen
        g.clearRect(0,0,width,height);
        // DRAW HERE!

        if(State.getCurrentState() != null)
            State.getCurrentState().render(g);

        // END DRAWING!

        bs.show();
        g.dispose(); // elimate graphics object properly
    }

    // game loop
    public void run() {
        init();

        double fps = 60.0;
        double timePerTick = 1000000000 / fps;  // one second in nanoseconds divided by fps
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();
        long timer = 0;
        int ticks = 0;

        while (running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick; // time past since call / max time allowed // delta says when we can run tick and render
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

        stop();
    }

    public KeyManager getKeyManager() {
        return keyManager;
    }

    public MouseManager getMouseManager() {
        return mouseManager;
    }

    public GameCamera getGameCamera() {
        return gameCamera;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // starting thread directly
    public synchronized void start() {
        if (running) // if already running, dont repeat
            return;
        running = true;
        thread = new Thread(this); // run game class on the thread
        thread.start(); // starts run method
    }

    // stopping thread directly
    public synchronized void stop() {
        if(!running) // if already not running, dont repeat
            return;
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public State getMenuState() {
        return menuState;
    }

    public State getTitleState() {
        return titleState;
    }

    public State getGameState() {
        return gameState;
    }

}
