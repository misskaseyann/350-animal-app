package dev.tilegame.tile.livingroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class TVTopTile extends Tile {
    public TVTopTile(int id) {
        super(Assets.tvTop, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}