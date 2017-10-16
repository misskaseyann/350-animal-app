package dev.tilegame.display;

import javax.swing.*;
import java.awt.*;

/**
 * Creates the window for the game.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Display {

    private JFrame frame;
    private Canvas canvas;
    private String title;
    private int width, height; // in terms of pixels

    /**
     * Display constructor that sets up width and height of the game.
     * @param title string title of game.
     * @param width int width of window.
     * @param height int height of window.
     */
    public Display(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
        createDisplay();
    }

    /**
     * Create JFrame and paintable canvas.
     */
    private void createDisplay() {
        // Frame properties.
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); // appear center of screen
        frame.setVisible(true);
        // Canvas properites.
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setFocusable(false);
        // Put pieces together.
        frame.add(canvas);
        frame.pack();
    }

    /**
     * @return canvas object.
     */
    public Canvas getCanvas() {
        return canvas;
    }

    /**
     * @return jframe object.
     */
    public JFrame getFrame() {
        return frame;
    }

}
