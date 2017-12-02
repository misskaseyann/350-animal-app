package dev.tilegame.states;

import dev.tilegame.Manager;
import dev.tilegame.gfx.Assets;
import dev.tilegame.inventory.Item;
import dev.tilegame.player.Player;
import dev.tilegame.worlds.World;

import java.awt.*;

/**
 * @author kaseystowell
 * @version 11.26.2017
 */
public class StoreBuyState extends State {
    private Item item;
    private Player player;
    private boolean boughtItem;

    public StoreBuyState(Manager manager, Item item) {
        super(manager);
        this.item = item;
        this.player = manager.getPlayer();
        this.boughtItem = false;
    }

    @Override
    public void tick() {
        // Did the mouse left click?
        if (manager.getMouseManager().getLeftPress()) {
            // Set x and y coordinates.
            int x = manager.getMouseManager().getMouseX();
            int y = manager.getMouseManager().getMouseY();
            // Buy
            if ((x > 188 && x < 344) && (y > 583 && y < 622)) {
                if ((player.getMoney() >= item.getCost()) && (player.getInventory().getSize() < 12)) {
                    player.setMoney(player.getMoney() - item.getCost());
                    player.getInventory().addItem(item);
                    System.out.println("Added " + item.getName());
                    boughtItem = true;
                }
            }
            // Cancel
            if ((x > 16 && x < 172) && (y > 583 && y < 622)) {
                State.setState(manager.getGame().getStoreState());
            }
            manager.getMouseManager().setLeftPress(false);
        }
    }

    @Override
    public void render(Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        if ((player.getMoney() < 1) || (player.getInventory().getSize() > 11))
            g.drawImage(Assets.getShopCancel(), 0, 0, null);
        else
            g.drawImage(Assets.getShopBuy(), 0, 0, null);
        g.drawImage(item.getImg(), 148, 376, null);
        g.setFont(manager.getFont());
        String money = "Your Money: $" + Integer.toString(player.getMoney());
        g.drawString(money, (328 - fm.stringWidth(money)) / 2, 343);
        g.drawString(item.getName(), (328 - fm.stringWidth(item.getName())) / 2, 458);
        String cost = "Price: $" + Integer.toString(item.getCost());
        int y = 468 + fm.getAscent();
        g.drawString(cost, (328 - fm.stringWidth(cost)) / 2, y);
        for (String line : item.getDescription().split("\n"))
            g.drawString(line, ((270 - fm.stringWidth(line)) / 2), y += g.getFontMetrics().getHeight());
    }

    @Override
    public World getWorld() {
        return null;
    }
}
