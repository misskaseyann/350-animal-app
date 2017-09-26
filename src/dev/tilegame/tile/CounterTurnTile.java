package dev.tilegame.tile;

import dev.tilegame.gfx.Assets;

/**
 * @author kaseystowell
 * @version 09.25.2017
 */
public class CounterTurnTile extends Tile {

    public CounterTurnTile(int id) {
        super(Assets.counterTurn, id);
    }

    @Override
    public boolean isSolid() {
        return true;
    }
}
