package dev.tilegame.entities;

import dev.tilegame.Game;
import java.awt.*;
import java.util.ArrayList;
import dev.tilegame.utils.Utils;
/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public abstract class Entity {

    protected Game game;
    protected float x, y;

    public Entity(Game game, float x, float y) {
        this.game = game;
        this.x = x;
        this.y = y;
    }


    public int[] gridLoc(){
        int[] xAndY = {Math.round(x/32), Math.round(y/32)};
        return xAndY;
    };

    public abstract void tick();

    public abstract void render(Graphics g);

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }


}
