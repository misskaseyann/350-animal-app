package dev.tilegame.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Listens for key presses.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class KeyManager implements KeyListener {
    /** keys for the actions.*/
    private boolean[] keys;
    /**keys for the actions.*/
    private boolean enter, esc, up, down, left, right;

    /**
     * KeyManager constructor.
     * Creates an array of all the keys on the keyboard.
     */
    public KeyManager() {
        keys = new boolean[256];
    }

    /**
     * Updates key press on game tick.
     */
    public void tick() {
        enter = keys[KeyEvent.VK_ENTER];
        esc = keys[KeyEvent.VK_ESCAPE];
        up = keys[KeyEvent.VK_W]; // w, not up arrow
        down = keys[KeyEvent.VK_S]; // s, not down arrow
        left = keys[KeyEvent.VK_A]; // a, not left arrow
        right = keys[KeyEvent.VK_D]; // d, not right arrow
    }

    /**
     * @param e key event.
     */
    @Override
    public void keyTyped(final KeyEvent e) {
        // do nothing
    }

    /**
     * If a key is pressed, set to true.
     * @param e key event.
     */
    @Override
    public void keyPressed(final KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    /**
     * If a key is released, set to false.
     * @param e key event.
     */
    @Override
    public void keyReleased(final KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    // KEY GETTERS

    /**
     * @return true if enter key is being pressed.
     */
    public boolean isEnter() {
        return enter;
    }

    /**
     * @return true if esc key is being pressed.
     */
    public boolean isEsc() {
        return esc;
    }

    /**
     * @return true if w key is being pressed.
     */
    public boolean isUp() {
        return up;
    }

    /**
     * @return true if s key is being pressed.
     */
    public boolean isDown() {
        return down;
    }

    /**
     * @return true if a key is being pressed.
     */
    public boolean isLeft() {
        return left;
    }

    /**
     * @return true if d key is being pressed.
     */
    public boolean isRight() {
        return right;
    }

}
