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
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Tile {

    //STATIC STUFF HERE
    /**
     * filler
     * */
    public static Tile[] getTiles() {
        return tiles;
    }

    /**
     * filler
     * */
    private static Tile[] tiles = new Tile[256];

     /**
     * filler
     * */
    public static Tile getWoodFloorTile() {
        return woodFloorTile;
    }

     /**
     * filler
     * */
    public static Tile getKitchenFloorTile() {
        return kitchenFloorTile;
    }

     /**
     * filler
     * */
    public static Tile getBathFloorTile() {
        return bathFloorTile;
    }

     /**
     * filler
     * */
    public static Tile getStoneFloorTile() {
        return stoneFloorTile;
    }

     /**
     * filler
     * */
    public static Tile getWallLeftTile() {
        return wallLeftTile;
    }

     /**
     * filler
     * */
    public static Tile getWallCenterTile() {
        return wallCenterTile;
    }

     /**
     * filler
     * */
    public static Tile getWallRightTile() {
        return wallRightTile;
    }

     /**
     * filler
     * */
    public static Tile getWallEndTile() {
        return wallEndTile;
    }

     /**
     * filler
     * */
    public static Tile getCeilingLeftTile() {
        return ceilingLeftTile;
    }

     /**
     * filler
     * */
    public static Tile getCeilingCenterTile() {
        return ceilingCenterTile;
    }

     /**
     * filler
     * */
    public static Tile getCeilingRightTile() {
        return ceilingRightTile;
    }

     /**
     * filler
     * */
    public static Tile getCeilingEndTile() {
        return ceilingEndTile;
    }

     /**
     * filler
     * */
    public static Tile getCeilingDownTile() {
        return ceilingDownTile;
    }

     /**
     * filler
     * */
    public static Tile getCeilingBCLTile() {
        return ceilingBCLTile;
    }

     /**
     * filler
     * */
    public static Tile getCeilingBCRTile() {
        return ceilingBCRTile;
    }

     /**
     * filler
     * */
    public static Tile getCeilingTCLTile() {
        return ceilingTCLTile;
    }

     /**
     * filler
     * */
    public static Tile getCeilingTCRTile() {
        return ceilingTCRTile;
    }

     /**
     * filler
     * */
    public static Tile getCeilingPDownTile() {
        return ceilingPDownTile;
    }

     /**
     * filler
     * */
    public static Tile getCeilingPRightTile() {
        return ceilingPRightTile;
    }

     /**
     * filler
     * */
    public static Tile getCeilingPLeftTile() {
        return ceilingPLeftTile;
    }

     /**
     * filler
     * */
    public static Tile getOutWallTLTile() {
        return outWallTLTile;
    }

     /**
     * filler
     * */
    public static Tile getOutWallTCTile() {
        return outWallTCTile;
    }

     /**
     * filler
     * */
    public static Tile getOutWallTRTile() {
        return outWallTRTile;
    }

     /**
     * filler
     * */
    public static Tile getOutWallBLTile() {
        return outWallBLTile;
    }

     /**
     * filler
     * */
    public static Tile getOutWallBCTile() {
        return outWallBCTile;
    }

     /**
     * filler
     * */
    public static Tile getOutWallBRTile() {
        return outWallBRTile;
    }

     /**
     * filler
     * */
    public static Tile getPlantTopTile() {
        return plantTopTile;
    }

     /**
     * filler
     * */
    public static Tile getPlantBotTile() {
        return plantBotTile;
    }

     /**
     * filler
     * */
    public static Tile getKitTableTLTile() {
        return kitTableTLTile;
    }

     /**
     * filler
     * */
    public static Tile getKitTableTRTile() {
        return kitTableTRTile;
    }

     /**
     * filler
     * */
    public static Tile getKitTableBLTile() {
        return kitTableBLTile;
    }

     /**
     * filler
     * */
    public static Tile getKitTableBRTile() {
        return kitTableBRTile;
    }

     /**
     * filler
     * */
    public static Tile getChairLeftTile() {
        return chairLeftTile;
    }

     /**
     * filler
     * */
    public static Tile getChairRightTile() {
        return chairRightTile;
    }

     /**
     * filler
     * */
    public static Tile getCounterCenterTile() {
        return counterCenterTile;
    }

     /**
     * filler
     * */
    public static Tile getCounterCornerTile() {
        return counterCornerTile;
    }

     /**
     * filler
     * */
    public static Tile getCounterEndTile() {
        return counterEndTile;
    }

     /**
     * filler
     * */
    public static Tile getDogBowlTile() {
        return dogBowlTile;
    }

     /**
     * filler
     * */
    public static Tile getDogBoneTile() {
        return dogBoneTile;
    }

     /**
     * filler
     * */
    public static Tile getBoxTile() {
        return boxTile;
    }

     /**
     * filler
     * */
    public static Tile getFridgeTopTile() {
        return fridgeTopTile;
    }

     /**
     * filler
     * */
    public static Tile getFridgeBotTile() {
        return fridgeBotTile;
    }

     /**
     * filler
     * */
    public static Tile getStoveTopTile() {
        return stoveTopTile;
    }

     /**
     * filler
     * */
    public static Tile getStoveBotTile() {
        return stoveBotTile;
    }

     /**
     * filler
     * */
    public static Tile getSinkLTopTile() {
        return sinkLTopTile;
    }

     /**
     * filler
     * */
    public static Tile getSinkLBotTile() {
        return sinkLBotTile;
    }

     /**
     * filler
     * */
    public static Tile getSinkRTopTile() {
        return sinkRTopTile;
    }

     /**
     * filler
     * */
    public static Tile getSinkRBotTile() {
        return sinkRBotTile;
    }

     /**
     * filler
     * */
    public static Tile getPhoneTile() {
        return phoneTile;
    }

     /**
     * filler
     * */
    public static Tile getKitRugTile() {
        return kitRugTile;
    }

     /**
     * filler
     * */
    public static Tile getClockTile() {
        return clockTile;
    }

     /**
     * filler
     * */
    public static Tile getEndTableTile() {
        return endTableTile;
    }

     /**
     * filler
     * */
    public static Tile getToiletTopTile() {
        return toiletTopTile;
    }

     /**
     * filler
     * */
    public static Tile getToiletBotTile() {
        return toiletBotTile;
    }

     /**
     * filler
     * */
    public static Tile getBathSinkTopTile() {
        return bathSinkTopTile;
    }

     /**
     * filler
     * */
    public static Tile getBathSinkBotTile() {
        return bathSinkBotTile;
    }

     /**
     * filler
     * */
    public static Tile getShowerTopTile() {
        return showerTopTile;
    }

     /**
     * filler
     * */
    public static Tile getShowerBotTile() {
        return showerBotTile;
    }

     /**
     * filler
     * */
    public static Tile getCouchLeftTile() {
        return couchLeftTile;
    }

     /**
     * filler
     * */
    public static Tile getCouchRightTile() {
        return couchRightTile;
    }

     /**
     * filler
     * */
    public static Tile getTvTopTile() {
        return tvTopTile;
    }

     /**
     * filler
     * */
    public static Tile getTvBotTile() {
        return tvBotTile;
    }

     /**
     * filler
     * */
    public static Tile getShelfTLTile() {
        return shelfTLTile;
    }

     /**
     * filler
     * */
    public static Tile getShelfTRTile() {
        return shelfTRTile;
    }

     /**
     * filler
     * */
    public static Tile getShelfBLTile() {
        return shelfBLTile;
    }

     /**
     * filler
     * */
    public static Tile getShelfBRTile() {
        return shelfBRTile;
    }

     /**
     * filler
     * */
    public static Tile getDeskTopTile() {
        return deskTopTile;
    }

     /**
     * filler
     * */
    public static Tile getDeskBotTile() {
        return deskBotTile;
    }

     /**
     * filler
     * */
    public static Tile getBedTLTile() {
        return bedTLTile;
    }

     /**
     * filler
     * */
    public static Tile getBedTRTile() {
        return bedTRTile;
    }

     /**
     * filler
     * */
    public static Tile getBedCLTile() {
        return bedCLTile;
    }

     /**
     * filler
     * */
    public static Tile getBedCRTile() {
        return bedCRTile;
    }

     /**
     * filler
     * */
    public static Tile getBedBLTile() {
        return bedBLTile;
    }

     /**
     * filler
     * */
    public static Tile getBedBRTile() {
        return bedBRTile;
    }

     /**
     * filler
     * */
    public static Tile getDiningTLTile() {
        return diningTLTile;
    }

     /**
     * filler
     * */
    public static Tile getDiningTRTile() {
        return diningTRTile;
    }

     /**
     * filler
     * */
    public static Tile getDiningBLTile() {
        return diningBLTile;
    }

     /**
     * filler
     * */
    public static Tile getDiningBRTile() {
        return diningBRTile;
    }

     /**
     * filler
     * */
    public static Tile getRugTLTile() {
        return rugTLTile;
    }

     /**
     * filler
     * */
    public static Tile getRugTCTile() {
        return rugTCTile;
    }

     /**
     * filler
     * */
    public static Tile getRugTRTile() {
        return rugTRTile;
    }

     /**
     * filler
     * */
    public static Tile getRugBLTile() {
        return rugBLTile;
    }

     /**
     * filler
     * */
    public static Tile getRugBCTile() {
        return rugBCTile;
    }

     /**
     * filler
     * */
    public static Tile getRugBRTile() {
        return rugBRTile;
    }

     /**
     * filler
     * */
    public static Tile getGrassLongTile() {
        return grassLongTile;
    }

     /**
     * filler
     * */
    public static Tile getGrassFlowersTile() {
        return grassFlowersTile;
    }

     /**
     * filler
     * */
    public static Tile getGrassRockTile() {
        return grassRockTile;
    }

     /**
     * filler
     * */
    public static Tile getGrassShortTile() {
        return grassShortTile;
    }

     /**
     * filler
     * */
    public static Tile getDoorTopTile() {
        return doorTopTile;
    }

     /**
     * filler
     * */
    public static Tile getDoorBotTile() {
        return doorBotTile;
    }

     /**
     * filler
     * */
    public static Tile getPathTile() {
        return pathTile;
    }

    /**
     * filler
     * */
    public final static Tile  woodFloorTile = new WoodFloorTile(10);
    /**
     * filler
     * */
    public final static  Tile kitchenFloorTile = new KitchenFloorTile(11);
    /**
     * filler
     * */
    public final static  Tile bathFloorTile = new BathFloorTile(12);
    /**
     * filler
     * */
    public final static  Tile stoneFloorTile = new StoneFloorTile(13);

    /**
     * filler
     * */
    public final static  Tile wallLeftTile = new WallLeftTile(14);
    /**
     * filler
     * */
    public final static  Tile wallCenterTile = new WallCenterTile(15);
    /**
     * filler
     * */
    public final static  Tile wallRightTile = new WallRightTile(16);
    /**
     * filler
     * */
    public final static  Tile wallEndTile = new WallEndTile(17);

    /**
     * filler
     * */
    public final static  Tile ceilingLeftTile = new CeilingLeftTile(18);
    /**
     * filler
     * */
    public final static  Tile ceilingCenterTile = new CeilingCenterTile(19);

    /**
     * filler
     * */
    public final static  Tile ceilingRightTile = new CeilingRightTile(20);
    /**
     * filler
     * */
    public final static  Tile ceilingEndTile = new CeilingEndTile(21);
    /**
     * filler
     * */
    public final static  Tile ceilingDownTile = new CeilingDownTile(22);
    /**
     * filler
     * */
    public final static  Tile ceilingBCLTile = new CeilingBCLTile(23);
    /**
     * filler
     * */
    public final static  Tile ceilingBCRTile = new CeilingBCRTile(24);
    /**
     * filler
     * */
    public final static  Tile ceilingTCLTile = new CeilingTCLTile(25);
    /**
     * filler
     * */
    public final static  Tile ceilingTCRTile = new CeilingTCRTile(26);
    /**
     * filler
     * */
    public final static  Tile ceilingPDownTile = new CeilingPDownTile(92);
    /**
     * filler
     * */
    public final static  Tile ceilingPRightTile = new CeilingPRightTile(93);
    /**
     * filler
     * */
    public final static  Tile ceilingPLeftTile = new CeilingPLeftTile(94);

    /**
     * filler
     * */
    public final static  Tile outWallTLTile = new OutWallTLTile(01);
    /**
     * filler
     * */
    public final static  Tile outWallTCTile = new OutWallTCTile(02);
    /**
     * filler
     * */
    public final static  Tile outWallTRTile = new OutWallTRTile(03);
    /**
     * filler
     * */
    public final static  Tile outWallBLTile = new OutWallBLTile(04);
    /**
     * filler
     * */
    public final static  Tile outWallBCTile = new OutWallBCTile(05);
    /**
     * filler
     * */
    public final static  Tile outWallBRTile = new OutWallBRTile(06);

    /**
     * filler
     * */
    public final static  Tile plantTopTile = new PlantTopTile(27);
    /**
     * filler
     * */
    public final static  Tile plantBotTile = new PlantBotTile(28);

    /**
     * filler
     * */
    public final static  Tile kitTableTLTile = new KitTableTLTile(29);
    /**
     * filler
     * */
    public final static  Tile kitTableTRTile = new KitTableTRTile(30);
    /**
     * filler
     * */
    public final static  Tile kitTableBLTile = new KitTableBLTile(31);
    /**
     * filler
     * */
    public final static  Tile kitTableBRTile = new KitTableBRTile(32);

    /**
     * filler
     * */
    public final static  Tile chairLeftTile = new ChairLeftTile(33);
    /**
     * filler
     * */
    public final static  Tile chairRightTile = new ChairRightTile(34);

    /**
     * filler
     * */
    public final static  Tile counterCenterTile = new CounterCenterTile(35);
    /**
     * filler
     * */
    public final static  Tile counterCornerTile = new CounterCornerTile(36);
    /**
     * filler
     * */
    public final static  Tile counterEndTile = new CounterEndTile(37);

    /**
     * filler
     * */
    public final static  Tile dogBowlTile = new DogBowlTile(38);
    /**
     * filler
     * */
    public final static  Tile dogBoneTile = new DogBoneTile(39);
    /**
     * filler
     * */
    public final static  Tile boxTile = new BoxTile(40);

    /**
     * filler
     * */
    public final static  Tile fridgeTopTile = new FridgeTopTile(41);
    /**
     * filler
     * */
    public final static  Tile fridgeBotTile = new FridgeBotTile(42);
    /**
     * filler
     * */
    public final static  Tile stoveTopTile = new StoveTopTile(43);
    /**
     * filler
     * */
    public final static  Tile stoveBotTile = new StoveBotTile(44);
    /**
     * filler
     * */
    public final static  Tile sinkLTopTile = new SinkLTopTile(45);
    /**
     * filler
     * */
    public final static  Tile sinkLBotTile = new SinkLBotTile(46);
    /**
     * filler
     * */
    public final static  Tile sinkRTopTile = new SinkRTopTile(47);
    /**
     * filler
     * */
    public final static  Tile sinkRBotTile = new SinkRBotTile(48);

    /**
     * filler
     * */
    public final static  Tile phoneTile = new PhoneTile(49);
    /**
     * filler
     * */
    public final static  Tile kitRugTile = new KitRugTile(50);
    /**
     * filler
     * */
    public final static  Tile clockTile = new ClockTile(51);
    /**
     * filler
     * */
    public final static  Tile endTableTile = new EndTableTile(52);

    /**
     * filler
     * */
    public final static  Tile toiletTopTile = new ToiletTopTile(53);
    /**
     * filler
     * */
    public final static  Tile toiletBotTile = new ToiletBotTile(54);
    /**
     * filler
     * */
    public final static  Tile bathSinkTopTile = new BathSinkTopTile(55);
    /**
     * filler
     * */
    public final static  Tile bathSinkBotTile = new BathSinkBotTile(56);
    /**
     * filler
     * */
    public final static  Tile showerTopTile = new ShowerTopTile(57);
    /**
     * filler
     * */
    public final static  Tile showerBotTile = new ShowerBotTile(58);

    /**
     * filler
     * */
    public final static  Tile couchLeftTile = new CouchLeftTile(59);
    /**
     * filler
     * */
    public final static  Tile couchRightTile = new CouchRightTile(60);
    /**
     * filler
     * */
    public final static  Tile tvTopTile = new TVTopTile(61);
    /**
     * filler
     * */
    public final static  Tile tvBotTile = new TVBotTile(62);

    /**
     * filler
     * */
    public final static  Tile shelfTLTile = new ShelfTLTile(63);
    /**
     * filler
     * */
    public final static  Tile shelfTRTile = new ShelfTRTile(64);
    /**
     * filler
     * */
    public final static  Tile shelfBLTile = new ShelfBLTile(65);
    /**
     * filler
     * */
    public final static  Tile shelfBRTile = new ShelfBRTile(66);

    /**
     * filler
     * */
    public final static  Tile deskTopTile = new DeskTopTile(67);
    /**
     * filler
     * */
    public final static  Tile deskBotTile = new DeskBotTile(68);

    /**
     * filler
     * */
    public final static  Tile bedTLTile = new BedTLTile(69);
    /**
     * filler
     * */
     public final static  Tile bedTRTile = new BedTRTile(70);

     /**
     * filler
     * */
     public final static  Tile bedCLTile = new BedCLTile(90);
    /**
     * filler
     * */
    public final static  Tile bedCRTile = new BedCRTile(91);
    /**
     * filler
     * */
    public final static  Tile bedBLTile = new BedBLTile(71);
    /**
     * filler
     * */
    public final static  Tile bedBRTile = new BedBRTile(72);

    /**
     * filler
     * */
    public final static  Tile diningTLTile = new DiningTLTile(73);
    /**
     * filler
     * */
    public final static  Tile diningTRTile = new DiningTRTile(74);
    /**
     * filler
     * */
    public final static  Tile diningBLTile = new DiningBLTile(75);
    /**
     * filler
     * */
    public final static  Tile diningBRTile = new DiningBRTile(76);

    /**
     * filler
     * */
    public final static  Tile rugTLTile = new RugTLTile(77);
    /**
     * filler
     * */
    public final static  Tile rugTCTile = new RugTCTile(78);
    /**
     * filler
     * */
    public final static  Tile rugTRTile = new RugTRTile(79);
    /**
     * filler
     * */
    public final static  Tile rugBLTile = new RugBLTile(80);
    /**
     * filler
     * */
    public final static  Tile rugBCTile = new RugBCTile(81);
    /**
     * filler
     * */
    public final static  Tile rugBRTile = new RugBRTile(82);

    /**
     * filler
     * */
    public final static  Tile grassLongTile = new GrassLongTile(83);
    /**
     * filler
     * */
    public final static  Tile grassFlowersTile = new GrassFlowersTile(84);
    /**
     * filler
     * */
    public final static  Tile grassRockTile = new GrassRockTile(85);
    /**
     * filler
     * */
    public final static  Tile grassShortTile = new GrassShortTile(86);

    /**
     * filler
     * */
    public final static  Tile doorTopTile = new DoorTopTile(87);
    /**
     * filler
     * */
    public final static  Tile doorBotTile = new DoorBotTile(88);

    /**
     * filler
     * */
    public final static  Tile pathTile = new PathTile(89);

    //CLASS

    /**
     * filler
     * */
    public final static int TILEWIDTH = 32, TILEHEIGHT = 32;

    protected BufferedImage texture;
    protected final int id;

    /**
     * filler
     * */
    public Tile(BufferedImage texture, int id) {
        this.texture = texture;
        this.id = id;

        tiles[id] = this;
    }

    /**
     * filler
     * */
    public void tick() {

    }

    /**
     * filler
     * */
    public void render(Graphics g, int x, int y) {
        g.drawImage(texture,x,y,TILEWIDTH,TILEHEIGHT,null);
    }

    /**
     * filler
     * */
    public boolean isSolid() {
        return false;
    }

    /**
     * filler
     * */
    public int getId() {
        return id;
    }
}
