package dev.tilegame.entities.animals;

import dev.tilegame.Game;
import dev.tilegame.gfx.Assets;
import dev.tilegame.input.KeyManager;
import dev.tilegame.states.GameState;
import dev.tilegame.tile.Tile;
import dev.tilegame.utils.Utils;

import java.awt.*;
import java.util.ArrayList;


/**
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Pet extends Animal {

    public Pet(Game game, float x, float y) {
        super(game, x, y);
    }

    @Override
    public void tick() {
        getInput();
        game.getGameCamera().centerOnEntity(this);
    }

    private void getInput() {
        if (game.getKeyManager().up && noCollide(game.getKeyManager())) // temp
            y -= 32; // temp

        if (game.getKeyManager().down && noCollide(game.getKeyManager()) ) // temp
            y += 32; // temp

        if (game.getKeyManager().left && noCollide(game.getKeyManager())) // temp
            x -= 32; // temp

        if (game.getKeyManager().right && noCollide(game.getKeyManager()))// temp
            x += 32; // temp


    }


    public boolean noCollide(KeyManager key){
        if(key.up){
            int gridx = super.gridLocX();
            int gridy = super.gridLocY()-1;
            int[][] tiles = this.game.getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }
        if(key.down){
            int gridx = super.gridLocX();
            int gridy = super.gridLocY()+1;
            int[][] tiles = this.game.getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }
        if(key.left){
            int gridx = super.gridLocX()-1;
            int gridy = super.gridLocY();
            int[][] tiles = this.game.getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }
        if(key.right){
            int gridx = super.gridLocX()+1;
            int gridy = super.gridLocY();
            int[][] tiles = this.game.getGameState().getWorld().getTiles();
            if(Tile.tiles[tiles[gridx][gridy]].isSolid()){
                return false;
            }
            return true;
        }

        return false;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.dog, (int) (x - game.getGameCamera().getxOffset()),
                (int) (y - game.getGameCamera().getyOffset()), null);
    }
}
