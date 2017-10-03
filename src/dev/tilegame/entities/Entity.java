package dev.tilegame.entities;

import dev.tilegame.Game;
import java.awt.*;
import java.util.ArrayList;
import dev.tilegame.Manager;
import dev.tilegame.input.KeyManager;
import dev.tilegame.tile.Tile;
import dev.tilegame.utils.Utils;
/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public abstract class Entity {

    protected Manager manager;
    protected float x, y;

    public Entity(Manager manager, float x, float y) {
        this.manager = manager;
        this.x = x;
        this.y = y;
    }


    public int gridLocX(){
        int X = Math.round(x/32);
        return X;
    };

    public int gridLocY(){
        int Y = Math.round(y/32);
        return Y;
    };

    public boolean noKeyCollide(KeyManager key){
        if(key.up){
            int gridx = gridLocX();
            int gridy = gridLocY()-1;
            int[][] tiles = this.manager.getGame().getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }
        if(key.down){
            int gridx = gridLocX();
            int gridy = gridLocY()+1;
            int[][] tiles = this.manager.getGame().getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }
        if(key.left){
            int gridx = gridLocX()-1;
            int gridy = gridLocY();
            int[][] tiles = this.manager.getGame().getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }
        if(key.right){
            int gridx = gridLocX()+1;
            int gridy = gridLocY();
            int[][] tiles = this.manager.getGame().getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }

        return false;
    }

    public boolean noCollide(int move){
        if(move == 5){ //Up to left
            int gridx = gridLocX()-1;
            int gridy = gridLocY()-1;
            int[][] tiles = this.manager.getGame().getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }
        if(move == 6){ //Up to right
            int gridx = gridLocX()+1;
            int gridy = gridLocY()-1;
            int[][] tiles = this.manager.getGame().getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }
        if(move == 7){ //Down to left
            int gridx = gridLocX()-1;
            int gridy = gridLocY()+1;
            int[][] tiles = this.manager.getGame().getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }
        if(move == 8){ //Down to right
            int gridx = gridLocX()+1;
            int gridy = gridLocY()+1;
            int[][] tiles = this.manager.getGame().getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }
        if(move == 1){ //Up
            int gridx = gridLocX();
            int gridy = gridLocY()-1;
            int[][] tiles = this.manager.getGame().getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }
        if(move == 2){ //Down
            int gridx = gridLocX();
            int gridy = gridLocY()+1;
            int[][] tiles = this.manager.getGame().getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }
        if(move == 3){ //Left
            int gridx = gridLocX()-1;
            int gridy = gridLocY();
            int[][] tiles = this.manager.getGame().getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }
        if(move == 4){ //Right
            int gridx = gridLocX()+1;
            int gridy = gridLocY();
            int[][] tiles = this.manager.getGame().getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }
        if(move == 0){ return true;}

        return false;
    }

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
