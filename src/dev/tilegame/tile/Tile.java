package dev.tilegame.tile;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Tile {

    //STATIC STUFF HERE

    public static Tile[] tiles = new Tile[256];
    public static Tile regCeilingTile = new RegCeilingTile(0);
    public static Tile wallTile = new WallTile(1);
    public static Tile woodFloorTile = new WoodFloorTile(2);
    public static Tile kitchenFloorTile = new KitchenFloorTile(3);
    public static Tile bowlTile = new BowlTile(4);
    public static Tile counterEndTile = new CounterEndTile(5);
    public static Tile counterTurnTile = new CounterTurnTile(6);
    public static Tile counterRegTile = new CounterRegTile(7);
    public static Tile boneTile = new BoneTile(8);

    //CLASS

    public static final int TILEWIDTH = 32, TILEHEIGHT = 32;

    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id) {
        this.texture = texture;
        this.id = id;

        tiles[id] = this;
    }

    public void tick() {

    }

    public void render(Graphics g, int x, int y) {
        g.drawImage(texture,x,y,TILEWIDTH,TILEHEIGHT,null);
    }

    public boolean isSolid() {
        return false;
    }

    public int getId() {
        return id;
    }
}
