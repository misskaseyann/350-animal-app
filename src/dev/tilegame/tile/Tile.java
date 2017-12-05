package dev.tilegame.tile;

import dev.tilegame.tile.bathroom.*;
import dev.tilegame.tile.bedroom.*;
import dev.tilegame.tile.decor.*;
import dev.tilegame.tile.dining.*;
import dev.tilegame.tile.housing.*;
import dev.tilegame.tile.kitchen.*;
import dev.tilegame.tile.livingroom.*;
import dev.tilegame.tile.outdoor.*;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Tile class.
 * @author kaseystowell
 * @author allisonbolen
 * @author brendannahed
 * @version 09.24.2017
 */
public class  Tile {

    //STATIC STUFF HERE
    /**
     * getTiles returns the tile list.
     * @return tiles1 which is a copy of
     * the tile list.
     * */
    public static Tile[] getTiles() {
        Tile[] tiles1 = tiles;
        return tiles1;
    }

    /**
     * The initial tiles list.
     * */
    private static Tile[] tiles = new Tile[256];

     /**
     * The method that returns the wood floor tile.
      * @return woodFloorTile, which is
      * the wood floor tile image.
     * */
    public static Tile getWoodFloorTile() {
        return woodFloorTile;
    }

     /**
     * The method that returns the wood floor tile.
      * @return kitchenFloorTile, which is
      * the kitchen floor tile image.
     * */
    public static Tile getKitchenFloorTile() {
        return kitchenFloorTile;
    }

     /**
     * The method that returns the wood floor tile.
      * @return bathFloorTile, which is the
      * bathroom floor tile image.
     * */
    public static Tile getBathFloorTile() {
        return bathFloorTile;
    }

     /**
     * The method that returns the stone tile.
      * @return stoneFloorTile, which is the
      * stone floor tile image.
     * */
    public static Tile getStoneFloorTile() {
        return stoneFloorTile;
    }

     /**
     * The method that returns the wall left tile.
      * @return wallLeftTile, which is the
      * wall left tile image.
     * */
    public static Tile getWallLeftTile() {
        return wallLeftTile;
    }

     /**
     * The method that returns the wall center tile.
      * @return wallCenterTIle, which is the wall
      * center tile image.
     * */
    public static Tile getWallCenterTile() {
        return wallCenterTile;
    }

     /**
     * The method that returns the wall right tile.
      * @return wallRightTile, which is the wall
      * center tile image.
     * */
    public static Tile getWallRightTile() {
        return wallRightTile;
    }

     /**
     * The method that returns the wall end tile.
      * @return wallEndTile, which is the wall
      * end tile image.
     * */
    public static Tile getWallEndTile() {
        return wallEndTile;
    }

     /**
     * The method that returns the ceiling left tile.
      * @return ceilingLeftTile, which is the ceiling
      * left tile image.
     * */
    public static Tile getCeilingLeftTile() {
        return ceilingLeftTile;
    }

     /**
      * The method that returns the ceiling center tile.
      * @return ceilingCenterTile, which is the ceiling
      * center tile image.
      * */
    public static Tile getCeilingCenterTile() {
        return ceilingCenterTile;
    }

     /**
      * The method that returns the ceiling right tile.
      * @return ceilingRightTile, which is the ceiling
      * right tile image.
     * */
    public static Tile getCeilingRightTile() {
        return ceilingRightTile;
    }

     /**
     * The method that returns the ceiling end tile.
      * @return ceilingEndTile, which is the ceiling
      * end tile image.
     * */
    public static Tile getCeilingEndTile() {
        return ceilingEndTile;
    }

     /**
     * The method that returns the ceiling down tile.
      * @return ceilingDownTile, which is the ceiling
      * down tile image.
     * */
    public static Tile getCeilingDownTile() {
        return ceilingDownTile;
    }

     /**
     * The method that returns the ceiling BCL tile.
      * @return ceilingBCLTile, which is the ceiling
      * BCL tile image.
     * */
    public static Tile getCeilingBCLTile() {
        return ceilingBCLTile;
    }

     /**
     * The method that returns the ceiling BCR tile.
      * @return ceilingBCRTile, which is the ceiling
      * BCR tile image.
     * */
    public static Tile getCeilingBCRTile() {
        return ceilingBCRTile;
    }

     /**
     * The method that returns the ceiling TCL tile.
      * @return ceilingTCLTile, which is the ceiling
      * TCL tile image.
     * */
    public static Tile getCeilingTCLTile() {
        return ceilingTCLTile;
    }

     /**
     * The method that returns the ceiling TCR tile.
      * @return ceilingTCRTile, which is the ceiling
      * TCR tile image.
     * */
    public static Tile getCeilingTCRTile() {
        return ceilingTCRTile;
    }

     /**
     * The method that returns the ceiling PDown tile.
      * @return ceilingPDownTile, which is the ceiling
      * PDown tile image.
     * */
    public static Tile getCeilingPDownTile() {
        return ceilingPDownTile;
    }

     /**
     * The method that returns the ceiling PRight tile.
      * @return ceilingPRightTile, which is the ceiling
      * PRight tile image.
     * */
    public static Tile getCeilingPRightTile() {
        return ceilingPRightTile;
    }

     /**
     * The method that returns the ceiling PLeft tile.
      * @return ceilingPLeftTile, which is the ceiling
      * PLeft tile image.
     * */
    public static Tile getCeilingPLeftTile() {
        return ceilingPLeftTile;
    }

     /**
     * The method that returns the out wall TL tile.
      * @return outWallTLTile, which is the out wall
      * TL tile image.
     * */
    public static Tile getOutWallTLTile() {
        return outWallTLTile;
    }

     /**
     * The method that returns the out wall TC tile.
      * @return outWallTCTile, which is the out wall
      * TC tile image.
     * */
    public static Tile getOutWallTCTile() {
        return outWallTCTile;
    }

     /**
     * The method that returns the out wall TR tile.
      * @return outWallTRTile, which is the out wall
      * TR tile image.
     * */
    public static Tile getOutWallTRTile() {
        return outWallTRTile;
    }

     /**
     * The method that returns the out wall BL tile.
      * @return outWallBLTile, which is the out wall
      * BL tile image.
     * */
    public static Tile getOutWallBLTile() {
        return outWallBLTile;
    }

     /**
     * The method that returns the out wall BC tile.
      * @return outWallBCTile, which is the out wall
      * BC tile image.
     * */
    public static Tile getOutWallBCTile() {
        return outWallBCTile;
    }

     /**
     * The method that returns the out wall BR tile.
      * @return outWallBRTile, which is the out wall
      * BR tile image.
     * */
    public static Tile getOutWallBRTile() {
        return outWallBRTile;
    }

     /**
     * The method that returns the plant top file.
      * @return plantTopTile, which is the plant top
      * tile image.
     * */
    public static Tile getPlantTopTile() {
        return plantTopTile;
    }

     /**
     * The method that returns the plant bottom file.
      * @return plantBotTile, which is the plant bottom
      * tile image.
     * */
    public static Tile getPlantBotTile() {
        return plantBotTile;
    }

     /**
     * The method that returns the Kitchen table
      * TL tile.
      * @return kitTableTLTile, which is the Kitchen Table
      * TL tile image.
     * */
    public static Tile getKitTableTLTile() {
        return kitTableTLTile;
    }

     /**
     * The method that returns the Kitchen table
      * TR tile.
      * @return kitTableTRTile, which is the Kitchen Table
      * TR tile image.
     * */
    public static Tile getKitTableTRTile() {
        return kitTableTRTile;
    }

     /**
     * fThe method that returns the Kitchen table
      * BL tile.
      * @return kitTableBLTile, which is the Kitchen Table
      * BL tile image.
     * */
    public static Tile getKitTableBLTile() {
        return kitTableBLTile;
    }

     /**
     * The method that returns the Kitchen table
      * BR tile.
      * @return kitTableBRTile, which is the Kitchen Table
      * BR tile image.
     * */
    public static Tile getKitTableBRTile() {
        return kitTableBRTile;
    }

     /**
     * The method that returns the chair left tile.
      * @return chairLeftTile, which is the chair left
      * tile image.
     * */
    public static Tile getChairLeftTile() {
        return chairLeftTile;
    }

     /**
     * The method that returns the chair right tile.
      * @return chairRightTile, which is the chair right
      * tile image.
     * */
    public static Tile getChairRightTile() {
        return chairRightTile;
    }

     /**
     * The method that returns the counter center tile.
      * @return counterCenterTile, which is the counter
      * center tile image.
     * */
    public static Tile getCounterCenterTile() {
        return counterCenterTile;
    }

     /**
     * The method that returns the counter corner tile.
      * @return counterCornerTile, which is the counter
      * corner tile image.
     * */
    public static Tile getCounterCornerTile() {
        return counterCornerTile;
    }

     /**
     * The method that returns the counter end tile.
      * @return counterEndTile, which is the counter
      * end tile image.
     * */
    public static Tile getCounterEndTile() {
        return counterEndTile;
    }

     /**
     * The method that returns the dog bowl tile.
      * @return dogBowlTile, which is the counter
      * bowl tile image.
     * */
    public static Tile getDogBowlTile() {
        return dogBowlTile;
    }

     /**
     * The method that returns the dog bone tile.
      * @return dogBoneTile, which is the counter
      * bone tile image.
     * */
    public static Tile getDogBoneTile() {
        return dogBoneTile;
    }

     /**
     * The method that returns the box tile.
      * @return boxTile, which is the box
      * tile image.
     * */
    public static Tile getBoxTile() {
        return boxTile;
    }

     /**
     *  The method that returns the fridge top tile.
      * @return fridgeTopTile, which is the fridge top
      * tile image.
     * */
    public static Tile getFridgeTopTile() {
        return fridgeTopTile;
    }

     /**
     * The method that returns the fridge bottom tile.
      * @return fridgeBOtTile, which is the fridge bottom
      * tile image.
     * */
    public static Tile getFridgeBotTile() {
        return fridgeBotTile;
    }

     /**
     *  The method that returns the stove top tile.
      * @return stoveTopTile, which is the stove top
      * tile image.
     * */
    public static Tile getStoveTopTile() {
        return stoveTopTile;
    }

     /**
     * The method that returns the stove bottom tile.
      * @return stoveBotTile, which is the stove bottom
      * tile image.
     * */
    public static Tile getStoveBotTile() {
        return stoveBotTile;
    }

     /**
     * The method that returns the sink left top tile.
      * @return sinkLTopTile, which is the sink left top
      * tile image.
     * */
    public static Tile getSinkLTopTile() {
        return sinkLTopTile;
    }

     /**
     * The method that returns the sink left bottom tile.
      * @return sinkLBotTile, which is the sink left bottom
      * tile image.
     * */
    public static Tile getSinkLBotTile() {
        return sinkLBotTile;
    }

     /**
     * The method that returns the sink right top tile.
      * @return sinkRTopTile, which is the sink right top
      * tile image.
     * */
    public static Tile getSinkRTopTile() {
        return sinkRTopTile;
    }

     /**
     * The method that returns the sink right bottom tile.
      * @return sinkRBotTile, which is the sink right bottom
      * tile image.
     * */
    public static Tile getSinkRBotTile() {
        return sinkRBotTile;
    }

     /**
     * The method that returns the phone tile.
      * @return phoneTile, which is the phone
      * tile image.
     * */
    public static Tile getPhoneTile() {
        return phoneTile;
    }

     /**
     * The method that returns the kitchen rug  tile.
      * @return kitRugTile, which is the kitchen rug
      * tile image.
     * */
    public static Tile getKitRugTile() {
        return kitRugTile;
    }

     /**
     * The method that returns the clock tile.
      * @return clockTile, which is the clock
      * tile image.
     * */
    public static Tile getClockTile() {
        return clockTile;
    }

     /**
     * The method that returns the end table tile.
      * @return endTableTile, which is the end table
      * tile image.
     * */
    public static Tile getEndTableTile() {
        return endTableTile;
    }

     /**
     *The method that returns the toilet top tile.
      * @return toiletTopTile, which is the toilet top
      * tile image.
     * */
    public static Tile getToiletTopTile() {
        return toiletTopTile;
    }

     /**
     * The method that returns the toilet bottom tile.
      * @return toiletBotTile, which is the toilet bottom
      * tile image.
     * */
    public static Tile getToiletBotTile() {
        return toiletBotTile;
    }

     /**
     * The method that returns the bathroom sink top tile.
      * @return bathSinkTopTile, which is the bathroom sink top
      * tile image.
     * */
    public static Tile getBathSinkTopTile() {
        return bathSinkTopTile;
    }

     /**
     * The method that returns the bathroom sink bottom tile.
      * @return bathSinkBotTile, which is the bathroom sink bottom
      * tile image.
     * */
    public static Tile getBathSinkBotTile() {
        return bathSinkBotTile;
    }

     /**
     * The method that returns the shower top tile.
      * @return showerTopTile, which is the shower top
      * tile image.
     * */
    public static Tile getShowerTopTile() {
        return showerTopTile;
    }

     /**
     * The method that returns the shower bottom tile.
      * @return showerBotTile, which is the shower bottom
      * tile image.
     * */
    public static Tile getShowerBotTile() {
        return showerBotTile;
    }

     /**
     * The method that returns the couch left tile.
      * @return couchLeftTile, which is the couch left tile
      * tile image.
     * */
    public static Tile getCouchLeftTile() {
        return couchLeftTile; }

     /**
     * The method that returns the couch right tile.
      * @return couchRightTile, which is the couch right tile
      * tile image.
     * */
    public static Tile getCouchRightTile() {
        return couchRightTile;
    }

     /**
     * The method that returns the Tv top tile.
      * @return tvTopTile, which is the Tv top tile
      * tile image.
     * */
    public static Tile getTvTopTile() {
        return tvTopTile;
    }

     /**
     * The method that returns the Tv bottom tile.
      * @return tvBotTile, which is the Tv bottom tile
      * tile image.
     * */
    public static Tile getTvBotTile() {
        return tvBotTile;
    }

     /**
     * The method that returns the shelf top left tile.
      * @return shelfTLTile, which is the shelf top left
      * tile image.
     * */
    public static Tile getShelfTLTile() {
        return shelfTLTile;
    }

     /**
     * The method that returns the shelf top right tile.
      * @return shelfTRTile, which is the shelf top right
      * tile image.
     * */
    public static Tile getShelfTRTile() {
        return shelfTRTile;
    }

     /**
     * The method that returns the shelf bottom left tile.
      * @return shelfBLTile, which is the shelf bottom left
      * tile image.
     * */
    public static Tile getShelfBLTile() {
        return shelfBLTile;
    }

     /**
     * The method that returns the shelf bottom right tile.
      * @return shelfBRTile, which is the shelf bottom right
      * tile image.
     * */
    public static Tile getShelfBRTile() {
        return shelfBRTile;
    }

     /**
     * The method that returns the Desk top tile.
      * @return deskTopTile, which is the desk top
      * tile image.
     * */
    public static Tile getDeskTopTile() {
        return deskTopTile;
    }

     /**
     * The method that returns the Desk bottom tile.
      * @return deskBotTile, which is the desk bottom
      * tile image.
     * */
    public static Tile getDeskBotTile() {
        return deskBotTile;
    }

     /**
     * The method that returns the bed top left tile.
      * @return bedTLTile, which is the bed top left
      * tile image.
     * */
    public static Tile getBedTLTile() {
        return bedTLTile;
    }

     /**
     * The method that returns the bed top right tile.
      * @return bedTRTile, which is the bed top right
      * tile image.
     * */
    public static Tile getBedTRTile() {
        return bedTRTile;
    }

     /**
     * The method that returns the bed center left tile.
      * @return bedCLTile, which is the bed center left
      * tile image.
     * */
    public static Tile getBedCLTile() {
        return bedCLTile;
    }

     /**
     * The method that returns the bed center right tile.
      * @return bedCRTile, which is the bed center right
      * tile image.
     * */
    public static Tile getBedCRTile() {
        return bedCRTile;
    }

     /**
     * The method that returns the bed bottom left tile.
      * @return bedBLTile, which is the bed bottom left
      * tile image.
     * */
    public static Tile getBedBLTile() {
        return bedBLTile;
    }

     /**
     * The method that returns the bed bottom right tile.
      * @return bedBRTile, which is the bed bottom right
      * tile image.
     * */
    public static Tile getBedBRTile() {
        return bedBRTile;
    }

     /**
     * The method that returns the dining top left tile.
      * @return diningTLTile, which is the dining top left
      * tile image.
     * */
    public static Tile getDiningTLTile() {
        return diningTLTile;
    }

     /**
     * The method that returns the dining top right tile.
      * @return diningTRTile, which is the dining top right
      * tile image.
     * */
    public static Tile getDiningTRTile() {
        return diningTRTile;
    }

     /**
     * The method that returns the dining bottom left tile.
      * @return diningBLTile, which is the dining bottom left
      * tile image.
     * */
    public static Tile getDiningBLTile() {
        return diningBLTile;
    }

     /**
     * The method that returns the dining bottom right tile.
      * @return diningBRTile, which is the dining bottom right
      * tile image.
     * */
    public static Tile getDiningBRTile() {
        return diningBRTile;
    }

     /**
     * The method that returns the rug top left tile.
      * @return rugTLTile, which is the rug top left
      * tile image.
     * */
    public static Tile getRugTLTile() {
        return rugTLTile;
    }

     /**
     * The method that returns the rug top center tile.
      * @return rugTCTile, which is the rug top center
      * tile image.
     * */
    public static Tile getRugTCTile() {
        return rugTCTile;
    }

     /**
     * The method that returns the rug top right tile.
      * @return rugTRTile, which is the rug top right
      * tile image.
     * */
    public static Tile getRugTRTile() {
        return rugTRTile;
    }

     /**
     * The method that returns the rug bottom left tile.
      * @return rugBLTile, which is the rug bottom left
      * tile image.
     * */
    public static Tile getRugBLTile() {
        return rugBLTile;
    }

     /**
     * The method that returns the rug bottom center tile.
      * @return rugBCTile, which is the rug bottom center
      * tile image.
     * */
    public static Tile getRugBCTile() {
        return rugBCTile;
    }

     /**
     * The method that returns the rug bottom right tile.
      * @return rugBRTile, which is the rug bottom right
      * tile image.
     * */
    public static Tile getRugBRTile() {
        return rugBRTile;
    }

     /**
     * The method that returns the grass long tile.
      * @return grassLongTile, which is the grass long
      * tile image.
     * */
    public static Tile getGrassLongTile() {
        return grassLongTile;
    }

     /**
     * The method that returns the grass flowers tile.
      * @return grassFlowersTile, which is the grass flowers
      * tile image.
     * */
    public static Tile getGrassFlowersTile() {
        return grassFlowersTile;
    }

     /**
     * The method that returns the grass rock tile.
      * @return grassRockTile, which is the grass rock
      * tile image.
     * */
    public static Tile getGrassRockTile() {
        return grassRockTile;
    }

     /**
     * The method that returns the grass short tile.
      * @return grassShortTile, which is the grass short
      * tile image.
     * */
    public static Tile getMiniGameGrassShortTile() {
        return miniGameGrassShortTile;
    }

    /**
     * The method that returns the grass short tile.
     * @return grassShortTile, which is the grass short
     * tile image.
     * */
    public static Tile getGrassShortTile() {
        return grassShortTile;
    }

     /**
     * The method that returns the door top tile.
      * @return doorTopTile, which is the door top
      * tile image.
     * */
    public static Tile getDoorTopTile() {
        return doorTopTile;
    }

     /**
     * The method that returns the door bottom tile.
      * @return doorBotTile, which is the door bottom
      * tile image.
     * */
    public static Tile getDoorBotTile() {
        return doorBotTile;
    }

     /**
     * The method that returns the path tile.
      * @return pathTile, which is the path
      * tile image.
     * */
    public static Tile getPathTile() {
        return pathTile;
    }

    /**
     * Here is create a WoodFloorTile object and it's id is set.
     **/
    public static final Tile  woodFloorTile = new WoodFloorTile(10);
    /**
     * Here is create a kitchenFloorTile object and it's id is set.
     * */
    public static final Tile kitchenFloorTile = new KitchenFloorTile(11);
    /**
     * Here is create a bathFloorTile object and it's id is set.
     * */
    public static final Tile bathFloorTile = new BathFloorTile(12);
    /**
     * Here is create a stoneFloorTile object and it's id is set.
     * */
    public static final Tile stoneFloorTile = new StoneFloorTile(13);

    /**
     *  Here is create a wallLeftTile object and it's id is set.
     * */
    public static final Tile wallLeftTile = new WallLeftTile(14);
    /**
     *  Here is create a wallCenterTile object and it's id is set.
     * */
    public static final Tile wallCenterTile = new WallCenterTile(15);
    /**
     *  Here is create a wallRightTile object and it's id is set.
     * */
    public static final Tile wallRightTile = new WallRightTile(16);
    /**
     *  Here is create a wallEndTile object and it's id is set.
     * */
    public static final Tile wallEndTile = new WallEndTile(17);

    /**
     *  Here is create a ceilingLeftTile object and it's id is set.
     * */
    public static final Tile ceilingLeftTile = new CeilingLeftTile(18);
    /**
     *  Here is create a ceilingCenterTile object and it's id is set.
     * */
    public static final Tile ceilingCenterTile = new CeilingCenterTile(19);

    /**
     *  Here is create a ceilingRightTile object and it's id is set.
     * */
    public static final Tile ceilingRightTile = new CeilingRightTile(20);
    /**
     *  Here is create a ceilingEndTile object and it's id is set.
     * */
    public static final Tile ceilingEndTile = new CeilingEndTile(21);
    /**
     *  Here is create a ceilingDownTile object and it's id is set.
     * */
    public static final Tile ceilingDownTile = new CeilingDownTile(22);
    /**
     *  Here is create a ceilingBCLTile object and it's id is set.
     * */
    public static final Tile ceilingBCLTile = new CeilingBCLTile(23);
    /**
     *  Here is create a ceilingBCRTile object and it's id is set.
     * */
    public static final Tile ceilingBCRTile = new CeilingBCRTile(24);
    /**
     *  Here is create a ceilingTCLTile object and it's id is set.
     * */
    public static final Tile ceilingTCLTile = new CeilingTCLTile(25);
    /**
     *  Here is create a ceilingTCRTile object and it's id is set.
     * */
    public static final Tile ceilingTCRTile = new CeilingTCRTile(26);
    /**
     *  Here is create a ceilingPDownTile object and it's id is set.
     * */
    public static final Tile ceilingPDownTile = new CeilingPDownTile(92);
    /**
     *  Here is create a ceilingPRightTile object and it's id is set.
     * */
    public static final Tile ceilingPRightTile = new CeilingPRightTile(93);
    /**
     *  Here is create a ceilingPLeftTile object and it's id is set.
     * */
    public static final Tile ceilingPLeftTile = new CeilingPLeftTile(94);

    /**
     *  Here is create a outWallTLTile object and it's id is set.
     * */
    public static final Tile outWallTLTile = new OutWallTLTile(01);
    /**
     *  Here is create a outWallTCTile object and it's id is set.
     * */
    public static final Tile outWallTCTile = new OutWallTCTile(02);
    /**
     *  Here is create a outWallTRTile object and it's id is set.
     * */
    public static final Tile outWallTRTile = new OutWallTRTile(03);
    /**
     *  Here is create a outWallBLTile object and it's id is set.
     * */
    public static final Tile outWallBLTile = new OutWallBLTile(04);
    /**
     * Here is create a outWallBCTile object and it's id is set.
     * */
    public static final Tile outWallBCTile = new OutWallBCTile(05);
    /**
     *Here is create a outWallBRTile object and it's id is set.
     * */
    public static final Tile outWallBRTile = new OutWallBRTile(06);

    /**
     * Here is create a plantTopTile object and it's id is set.
     * */
    public static final Tile plantTopTile = new PlantTopTile(27);
    /**
     * Here is create a plantBotTile object and it's id is set.
     * */
    public static final Tile plantBotTile = new PlantBotTile(28);

    /**
     * Here is create a kitTableTLTile object and it's id is set.
     * */
    public static final Tile kitTableTLTile = new KitTableTLTile(29);
    /**
     * Here is create a kitTableTRTile object and it's id is set.
     * */
    public static final Tile kitTableTRTile = new KitTableTRTile(30);
    /**
     * Here is create a kitTableBLTile object and it's id is set.
     * */
    public static final Tile kitTableBLTile = new KitTableBLTile(31);
    /**
     * Here is create a kitTableBRTile object and it's id is set.
     * */
    public static final Tile kitTableBRTile = new KitTableBRTile(32);

    /**
     * Here is create a chairLeftTile object and it's id is set.
     * */
    public static final Tile chairLeftTile = new ChairLeftTile(33);
    /**
     * Here is create a chairRightTile object and it's id is set.
     * */
    public static final Tile chairRightTile = new ChairRightTile(34);

    /**
     * Here is create a counterCenterTile object and it's id is set.
     * */
    public static final Tile counterCenterTile = new CounterCenterTile(35);
    /**
     *Here is create a counterCornerTile object and it's id is set.
     * */
    public static final Tile counterCornerTile = new CounterCornerTile(36);
    /**
     * Here is create a counterEndTile object and it's id is set.
     * */
    public static final Tile counterEndTile = new CounterEndTile(37);

    /**
     * Here is create a dogBowlTile object and it's id is set.
     * */
    public static final Tile dogBowlTile = new DogBowlTile(38);
    /**
     * Here is create a dogBoneTile object and it's id is set.
     * */
    public static final Tile dogBoneTile = new DogBoneTile(39);
    /**
     * Here is create a boxTile object and it's id is set.
     * */
    public static final Tile boxTile = new BoxTile(40);

    /**
     * Here is create a fridgeTopTile object and it's id is set.
     * */
    public static final Tile fridgeTopTile = new FridgeTopTile(41);
    /**
     * Here is create a fridgeBotTile object and it's id is set.
     * */
    public static final Tile fridgeBotTile = new FridgeBotTile(42);
    /**
     * Here is create a stoveTopTile object and it's id is set.
     * */
    public static final Tile stoveTopTile = new StoveTopTile(43);
    /**
     * Here is create a stoveBotTile object and it's id is set.
     * */
    public static final Tile stoveBotTile = new StoveBotTile(44);
    /**
     * Here is create a sinkLTopTile object and it's id is set.
     * */
    public static final Tile sinkLTopTile = new SinkLTopTile(45);
    /**
     * Here is create a sinkLBotTile object and it's id is set.
     * */
    public static final Tile sinkLBotTile = new SinkLBotTile(46);
    /**
     * Here is create a sinkRTopTile object and it's id is set.
     * */
    public static final Tile sinkRTopTile = new SinkRTopTile(47);
    /**
     * Here is create a sinkRBotTile object and it's id is set.
     * */
    public static final Tile sinkRBotTile = new SinkRBotTile(48);

    /**
     * Here is create a phoneTile object and it's id is set.
     * */
    public static final Tile phoneTile = new PhoneTile(49);
    /**
     * Here is create a kitRugTile object and it's id is set.
     * */
    public static final Tile kitRugTile = new KitRugTile(50);
    /**
     * Here is create a clockTile object and it's id is set.
     * */
    public static final Tile clockTile = new ClockTile(51);
    /**
     * Here is create a endTableTile object and it's id is set.
     * */
    public static final Tile endTableTile = new EndTableTile(52);

    /**
     * Here is create a toiletTopTile object and it's id is set.
     * */
    public static final Tile toiletTopTile = new ToiletTopTile(53);
    /**
     * Here is create a toiletBotTile object and it's id is set.
     * */
    public static final Tile toiletBotTile = new ToiletBotTile(54);
    /**
     * Here is create a bathSinkTopTile object and it's id is set.
     * */
    public static final Tile bathSinkTopTile = new BathSinkTopTile(55);
    /**
     * Here is create a bathSinkBotTile object and it's id is set.
     * */
    public static final Tile bathSinkBotTile = new BathSinkBotTile(56);
    /**
     * Here is create a showerTopTile object and it's id is set.
     * */
    public static final Tile showerTopTile = new ShowerTopTile(57);
    /**
     * Here is create a showerBotTile object and it's id is set.
     * */
    public static final Tile showerBotTile = new ShowerBotTile(58);

    /**
     * Here is create a couchLeftTile object and it's id is set.
     * */
    public static final Tile couchLeftTile = new CouchLeftTile(59);
    /**
     * Here is create a couchRightTile object and it's id is set.
     * */
    public static final Tile couchRightTile = new CouchRightTile(60);
    /**
     * Here is create a tvTopTile object and it's id is set.
     * */
    public static final Tile tvTopTile = new TVTopTile(61);
    /**
     * Here is create a tvBotTile object and it's id is set.
     * */
    public static final Tile tvBotTile = new TVBotTile(62);

    /**
     * Here is create a shelfTLTile object and it's id is set.
     * */
    public static final Tile shelfTLTile = new ShelfTLTile(63);
    /**
     * Here is create a shelfTRTile object and it's id is set.
     * */
    public static final Tile shelfTRTile = new ShelfTRTile(64);
    /**
     * Here is create a shelfBLTile object and it's id is set.
     * */
    public static final Tile shelfBLTile = new ShelfBLTile(65);
    /**
     * Here is create a shelfBRTile object and it's id is set.
     * */
    public static final Tile shelfBRTile = new ShelfBRTile(66);

    /**
     * Here is create a deskTopTile object and it's id is set.
     * */
    public static final Tile deskTopTile = new DeskTopTile(67);
    /**
     * Here is create a deskBotTile object and it's id is set.
     * */
    public static final Tile deskBotTile = new DeskBotTile(68);

    /**
     * Here is create a bedTLTile object and it's id is set.
     * */
    public static final Tile bedTLTile = new BedTLTile(69);
    /**
     * Here is create a bedTRTile object and it's id is set.
     * */
     public static final Tile bedTRTile = new BedTRTile(70);

     /**
     * Here is create a bedCLTile object and it's id is set.
     * */
     public static final Tile bedCLTile = new BedCLTile(90);
    /**
     * Here is create a bedCRTile object and it's id is set.
     * */
    public static final Tile bedCRTile = new BedCRTile(91);
    /**
     * Here is create a bedBLTile object and it's id is set.
     * */
    public static final Tile bedBLTile = new BedBLTile(71);
    /**
     * Here is create a bedBRTile object and it's id is set.
     * */
    public static final Tile bedBRTile = new BedBRTile(72);

    /**
     * Here is create a diningTLTile object and it's id is set.
     * */
    public static final Tile diningTLTile = new DiningTLTile(73);
    /**
     * Here is create a diningTRTile object and it's id is set.
     * */
    public static final Tile diningTRTile = new DiningTRTile(74);
    /**
     * Here is create a diningBLTile object and it's id is set.
     * */
    public static final Tile diningBLTile = new DiningBLTile(75);
    /**
     * Here is create a diningBRTile object and it's id is set.
     * */
    public static final Tile diningBRTile = new DiningBRTile(76);

    /**
     * Here is create a rugTLTile object and it's id is set.
     * */
    public static final Tile rugTLTile = new RugTLTile(77);
    /**
     * Here is create a rugTCTile object and it's id is set.
     * */
    public static final Tile rugTCTile = new RugTCTile(78);
    /**
     * Here is create a rugTRTile object and it's id is set.
     * */
    public static final Tile rugTRTile = new RugTRTile(79);
    /**
     * Here is create a rugBLTile object and it's id is set.
     * */
    public static final Tile rugBLTile = new RugBLTile(80);
    /**
     * Here is create a rugBCTile object and it's id is set.
     * */
    public static final Tile rugBCTile = new RugBCTile(81);
    /**
     * Here is create a rugBRTile object and it's id is set.
     * */
    public static final Tile rugBRTile = new RugBRTile(82);

    /**
     * Here is create a grassLongTile object and it's id is set.
     * */

    public static final Tile grassLongTile = new GrassLongTile(83);
    /**
     * Here is create a grassFlowersTile object and it's id is set.
     * */

    public static final Tile grassFlowersTile = new GrassFlowersTile(84);
    /**
     * Here is create a grassRockTile object and it's id is set.
     * */
    public static final Tile grassRockTile = new GrassRockTile(85);
    /**
     * Here is create a grassShortTile object and it's id is set.
     * */
    public static final Tile grassShortTile = new GrassShortTile(86);



    /**
     * Here is create a doorTopTile object and it's id is set.
     * */

    public static final Tile doorTopTile = new DoorTopTile(87);
    /**
     * Here is create a doorBotTile object and it's id is set.
     * */
    public static final Tile doorBotTile = new DoorBotTile(88);


    /**
     * Here is create a pathTile object and it's id is set.
     * */
    public static final Tile pathTile = new PathTile(89);

    /**
     * Here is create a grassShortTile object and it's id is set.
     * This Tile ends the mini game.
     * */
    public static final Tile miniGameGrassShortTile = new MiniGameGrassShortTile(95);

    //CLASS

    /**
     * filler.
     * */
    public static final int TILEWIDTH = 32, TILEHEIGHT = 32;

    /**
     * Texture image.
     */
    protected final BufferedImage texture;

    /**
     * ID of the tile.
     */
    protected final int id;

    /**
     * Tile creates a tile object using a BufferedImage and an int id.
     * @param inId integer id.
     * @param inTexture BufferedImage object.
     * */

    public Tile(BufferedImage inTexture, int inId) {
        this.texture = inTexture;
        this.id = inId;
        tiles[inId] = this;
    }

    /**
     * filler.
     * */
    public void tick() {

    }

    /**
     * Render draws the image into the game.
     * @param g graphics of the image.
     * @param x int of the x value to render the image.
     * @param y int of the y value to render the image.
     * */

    public void render(final Graphics g, final int x, final int y) {
        g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
    }

    /**
     * Boolean of tile objects to check if a tile is solid.
     * @return false if the object is not solid and the pet can
     * walk over the tile.
     * */
    public boolean isSolid() {
        return false;
    }

    /**
     * Get id returns the id a tile.
     * @return the int id of the tile.
     * */
    public int getId() {
        return id;
    }
}
