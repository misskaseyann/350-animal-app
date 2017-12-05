package dev.tilegame.display;

import javax.swing.*;
import java.awt.*;

/**
 * Creates the window for the game.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Display {
    /** jframe for display. */
    private JFrame frame;
    /** canvas for jframe. */
    private Canvas canvas;
    /** string title for jframe. */
    private String title;
    /** width and height. */
    private int width, height; // in terms of pixels

    /**
     * Display constructor that sets up width and height of the game.
     * @param inTitle string title of game.
     * @param inWidth int width of window.
     * @param inHeight int height of window.
     */
    public Display(final String inTitle, final int inWidth, final int inHeight) {
        this.title = inTitle;
        this.width = inWidth;
        this.height = inHeight;
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
