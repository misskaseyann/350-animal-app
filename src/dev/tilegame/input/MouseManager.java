package dev.tilegame.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Listens for mouse clicks and mouse movement.
 *
 * @author kaseystowell
 * @version 10.02.2017
 */
public class MouseManager implements MouseListener, MouseMotionListener {
    /**
     * clicking a button.
     */
    private boolean leftPress, rightPress;
    /**
     * location of click.
     */
    private int mouseX, mouseY;

    /**
     * MouseManager constructor.
     */
    public MouseManager() {
        // do nothing
    }

    /**
     * @param e mouse event.
     */
    @Override
    public void mouseClicked(final MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            leftPress = true;
        } else if (e.getButton() == MouseEvent.BUTTON3) {
            rightPress = true;
        }
    }

    /**
     * Verify if mouse button is being pressed.
     *
     * @param e mouse event.
     */
    @Override
    public void mousePressed(final MouseEvent e) {
        // do nothing
    }

    /**
     * Verify if mouse button is being released.
     *
     * @param e mouse event.
     */
    @Override
    public void mouseReleased(final MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            leftPress = false;
        } else if (e.getButton() == MouseEvent.BUTTON3) {
            rightPress = false;
        }
    }

    /**
     * @param e mouse event.
     */
    @Override
    public void mouseEntered(final MouseEvent e) {
        // do nothing
    }

    /**
     * @param e mouse event.
     */
    @Override
    public void mouseExited(final MouseEvent e) {
        // do nothing
    }

    /**
     * @param e mouse event.
     */
    @Override
    public void mouseDragged(final MouseEvent e) {
        // do nothing
    }

    /**
     * Get position of mouse on the screen.
     *
     * @param e mouse event.
     */
    @Override
    public void mouseMoved(final MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
    }

    // MOUSE GETTERS

    /**
     * @return true if left mouse click.
     */
    public boolean getLeftPress() {
        return leftPress;
    }
    /**left press.
     * @param inLeftPress */
    public void setLeftPress(final boolean inLeftPress) {
        this.leftPress = inLeftPress;
    }

    /**
     * @return true if right mouse click.
     */
    public boolean getRightPress() {
        return rightPress;
    }

    /**
     * @return x value of mouse on screen in pixels.
     */
    public int getMouseX() {
        return mouseX;
    }

    /**
     * @return y value of mouse on screen in pixels.
     */
    public int getMouseY() {
        return mouseY;
    }

}
