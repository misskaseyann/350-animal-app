package dev.tilegame.tile.housing;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class KitchenFloorTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public KitchenFloorTile(final int id) {
        super(Assets.getKitchenFloor(), id);
    }
}
