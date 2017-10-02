package dev.tilegame.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * @author kaseystowell
 * @version 10.02.2017
 */
public class MouseManager implements MouseListener, MouseMotionListener {

    private boolean leftPress, rightPress;
    private int mouseX, mouseY;

    public MouseManager() {

    }

    // GETTERS SETTERS

    public boolean getLeftPress() {
        return leftPress;
    }

    public boolean getRightPress() {
        return rightPress;
    }

    public int getMouseX() {
        return mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    // Verify mouse button held down.
    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1)
            leftPress = true;
        else if(e.getButton() == MouseEvent.BUTTON3)
            rightPress = true;
    }

    // Verify mouse button released.
    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1)
            leftPress = false;
        else if(e.getButton() == MouseEvent.BUTTON3)
            rightPress = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    // Get position of mouse on scrren.
    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
    }
}
