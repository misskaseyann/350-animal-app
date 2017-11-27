package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
import dev.tilegame.inventory.Item;
import dev.tilegame.inventory.items.*;
import dev.tilegame.sound.LoopLoader;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * @author kaseystowell
 * @version 11.26.2017
 */
public class StoreState extends State {

    private LoopLoader music;
    private Item selected;
    private State storeBuyState;
    private Manager manager;

    /**
     * StoreState constructor.
     * @param manager game class manager.
     */
    public StoreState(Manager manager) {
        super(manager);
        this.manager = manager;
    }

    /**
     * Checks for button presses.
     */
    @Override
    public void tick() {
        // Did the mouse left click?
        if (manager.getMouseManager().getLeftPress()) {
            // Set x and y coordinates.
            int x = manager.getMouseManager().getMouseX();
            int y = manager.getMouseManager().getMouseY();
            // Bacon Treat
            if ((x > 20 && x < 84) && (y > 375 && y < 440)) {
                storeBuyState = new StoreBuyState(manager, new BaconTreat());
                State.setState(storeBuyState);
            }
            // Chew Toy
            if ((x > 108 && x < 157) && (y > 375 && y < 440)) {
                storeBuyState = new StoreBuyState(manager, new ChewToy());
                State.setState(storeBuyState);
            }
            // Biscuit
            if ((x > 187 && x < 251) && (y > 375 && y < 440)) {
                storeBuyState = new StoreBuyState(manager, new DogBiscuit());
                State.setState(storeBuyState);
            }
            // Bone
            if ((x > 276 && x < 340) && (y > 375 && y < 440)) {
                storeBuyState = new StoreBuyState(manager, new DogBone());
                State.setState(storeBuyState);
            }
            // Premium Dog Food
            if ((x > 20 && x < 84) && (y > 464 && y < 528)) {
                storeBuyState = new StoreBuyState(manager, new DogFoodPremium());
                State.setState(storeBuyState);
            }
            // Standard Dog Food
            if ((x > 101 && x < 165) && (y > 464 && y < 528)) {
                storeBuyState = new StoreBuyState(manager, new DogFoodStandard());
                State.setState(storeBuyState);
            }
            // Stuffed Toy
            if ((x > 188 && x < 252) && (y > 464 && y < 528)) {
                storeBuyState = new StoreBuyState(manager, new StuffedAnimal());
                State.setState(storeBuyState);
            }
            // Tennis Ball
            if ((x > 276 && x < 340) && (y > 464 && y < 528)) {
                storeBuyState = new StoreBuyState(manager, new TennisBall());
                State.setState(storeBuyState);
            }
            // Back Button
            if ((x > 67 && x < 291) && (y > 560 && y < 624)) {
                State.setState(manager.getGame().getTravelState());
            }
            manager.getMouseManager().setLeftPress(false);
        }
    }

    /**
     * Renders the shop menu screen.
     * @param g graphics object.
     */
    @Override
    public void render(Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        g.drawImage(Assets.getShopMenu(), 0, 0, null);
        String money = "Your Money: $" + Integer.toString(manager.getPlayer().getMoney());
        g.setFont(manager.getFont());
        g.drawString(money, (328 - fm.stringWidth(money)) / 2, 343);
    }

    /**
     * @return null/no world in this state
     */
    public World getWorld(){ return null;}

}