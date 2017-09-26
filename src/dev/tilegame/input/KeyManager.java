package dev.tilegame.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class KeyManager implements KeyListener {

    private boolean[] keys;
    public boolean enter, esc, up, down, left, right;

    public KeyManager() {
        keys = new boolean[256];
    }

    // temp
    public void tick() {
        enter = keys[KeyEvent.VK_ENTER];
        esc = keys[KeyEvent.VK_ESCAPE];
        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_D];
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
        System.out.println("Key Pressed");
    }
}
