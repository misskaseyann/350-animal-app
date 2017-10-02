package dev.tilegame.tile.bedroom;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class DeskBotTile extends Tile {
    public DeskBotTile(int id) {
        super(Assets.deskBot, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
