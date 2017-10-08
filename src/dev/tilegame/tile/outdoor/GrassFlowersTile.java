package dev.tilegame.tile.outdoor;

import dev.tilegame.gfx.Assets;
import dev.tilegame.tile.Tile;

/**
 * @author kaseystowell
 * @version 10.01.2017
 */
public class GrassFlowersTile extends Tile {
    /**
     * filler.
     * @param id filler
     * */
    public GrassFlowersTile(final int id) {
        super(Assets.getGrassFlowers(), id);
    }
}
