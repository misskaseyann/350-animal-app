package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
import dev.tilegame.player.Player;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * @author kaseystowell
 * @version 12.02.2017
 */
public class VetState extends State {
    /**player holds the user's Player.*/
    private Player player;

    /**
     * StoreState constructor.
     *
     * @param manager game class manager.
     */
    public VetState(final Manager manager) {
        super(manager);
        this.player = manager.getPlayer();
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
            // Buy
            if ((x > 188 && x < 344) && (y > 583 && y < 622)) {
                if (player.getMoney() >= 50) {
                    player.setMoney(player.getMoney() - 50);
                    manager.getPet().setHealth(6);
                    manager.getPet().setHunger(6);
                    manager.getPet().setHappiness(6);
                    manager.getPet().setCleanliness(6);
                    System.out.println("Healed pet.");
                }
            }
            // Cancel
            if ((x > 16 && x < 172) && (y > 583 && y < 622)) {
                State.setState(State.getLastState());
            }
            manager.getMouseManager().setLeftPress(false);
        }
    }

    /**
     * render creates the graphics for the VetState.
     * @param g graphics object.
     */
    @Override
    public void render(final Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        if ((player.getMoney() < 50)) {
            g.drawImage(Assets.getVetCancel(), 0, 0, null);
        } else {
            g.drawImage(Assets.getVetMenu(), 0, 0, null);
        }
        g.setFont(manager.getFont());
        String money = "Your Money: $" + Integer.toString(player.getMoney());
        g.drawString(money, (328 - fm.stringWidth(money)) / 2, 500);
        String cost = "Vet Visit Cost: $50";
        g.drawString(cost, (315 - fm.stringWidth(cost)) / 2, 525);
        String description = "The vet will heal your pet completely."
                + "\nAll hearts will be maxed out!";
        int y = 515 + fm.getAscent();
        for (String line : description.split("\n")) {
            g.drawString(line, ((265 - fm.stringWidth(line)) / 2),
                    y += g.getFontMetrics().getHeight());
        }
    }

    /**
     * No world to return.
     * @return null.
     */
    @Override
    public World getWorld() {
        return null;
    }
}
