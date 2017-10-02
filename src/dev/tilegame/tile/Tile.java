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

    public static Tile[] tiles = new Tile[256];

    public static Tile woodFloorTile = new WoodFloorTile(10);
    public static Tile kitchenFloorTile = new KitchenFloorTile(11);
    public static Tile bathFloorTile = new BathFloorTile(12);
    public static Tile stoneFloorTile = new StoneFloorTile(13);

    public static Tile wallLeftTile = new WallLeftTile(14);
    public static Tile wallCenterTile = new WallCenterTile(15);
    public static Tile wallRightTile = new WallRightTile(16);
    public static Tile wallEndTile = new WallEndTile(17);

    public static Tile ceilingLeftTile = new CeilingLeftTile(18);
    public static Tile ceilingCenterTile = new CeilingCenterTile(19);
    public static Tile ceilingRightTile = new CeilingRightTile(20);
    public static Tile ceilingEndTile = new CeilingEndTile(21);
    public static Tile ceilingDownTile = new CeilingDownTile(22);
    public static Tile ceilingBCLTile = new CeilingBCLTile(23);
    public static Tile ceilingBCRTile = new CeilingBCRTile(24);
    public static Tile ceilingTCLTile = new CeilingTCLTile(25);
    public static Tile ceilingTCRTile = new CeilingTCRTile(26);
    public static Tile ceilingPDownTile = new CeilingPDownTile(92);
    public static Tile ceilingPRightTile = new CeilingPRightTile(93);
    public static Tile ceilingPLeftTile = new CeilingPLeftTile(94);

    public static Tile outWallTLTile = new OutWallTLTile(01);
    public static Tile outWallTCTile = new OutWallTCTile(02);
    public static Tile outWallTRTile = new OutWallTRTile(03);
    public static Tile outWallBLTile = new OutWallBLTile(04);
    public static Tile outWallBCTile = new OutWallBCTile(05);
    public static Tile outWallBRTile = new OutWallBRTile(06);

    public static Tile plantTopTile = new PlantTopTile(27);
    public static Tile plantBotTile = new PlantBotTile(28);

    public static Tile kitTableTLTile = new KitTableTLTile(29);
    public static Tile kitTableTRTile = new KitTableTRTile(30);
    public static Tile kitTableBLTile = new KitTableBLTile(31);
    public static Tile kitTableBRTile = new KitTableBRTile(32);

    public static Tile chairLeftTile = new ChairLeftTile(33);
    public static Tile chairRightTile = new ChairRightTile(34);

    public static Tile counterCenterTile = new CounterCenterTile(35);
    public static Tile counterCornerTile = new CounterCornerTile(36);
    public static Tile counterEndTile = new CounterEndTile(37);

    public static Tile dogBowlTile = new DogBowlTile(38);
    public static Tile dogBoneTile = new DogBoneTile(39);
    public static Tile boxTile = new BoxTile(40);

    public static Tile fridgeTopTile = new FridgeTopTile(41);
    public static Tile fridgeBotTile = new FridgeBotTile(42);
    public static Tile stoveTopTile = new StoveTopTile(43);
    public static Tile stoveBotTile = new StoveBotTile(44);
    public static Tile sinkLTopTile = new SinkLTopTile(45);
    public static Tile sinkLBotTile = new SinkLBotTile(46);
    public static Tile sinkRTopTile = new SinkRTopTile(47);
    public static Tile sinkRBotTile = new SinkRBotTile(48);

    public static Tile phoneTile = new PhoneTile(49);
    public static Tile kitRugTile = new KitRugTile(50);
    public static Tile clockTile = new ClockTile(51);
    public static Tile endTableTile = new EndTableTile(52);

    public static Tile toiletTopTile = new ToiletTopTile(53);
    public static Tile toiletBotTile = new ToiletBotTile(54);
    public static Tile bathSinkTopTile = new BathSinkTopTile(55);
    public static Tile bathSinkBotTile = new BathSinkBotTile(56);
    public static Tile showerTopTile = new ShowerTopTile(57);
    public static Tile showerBotTile = new ShowerBotTile(58);

    public static Tile couchLeftTile = new CouchLeftTile(59);
    public static Tile couchRightTile = new CouchRightTile(60);
    public static Tile tvTopTile = new TVTopTile(61);
    public static Tile tvBotTile = new TVBotTile(62);

    public static Tile shelfTLTile = new ShelfTLTile(63);
    public static Tile shelfTRTile = new ShelfTRTile(64);
    public static Tile shelfBLTile = new ShelfBLTile(65);
    public static Tile shelfBRTile = new ShelfBRTile(66);

    public static Tile deskTopTile = new DeskTopTile(67);
    public static Tile deskBotTile = new DeskBotTile(68);

    public static Tile bedTLTile = new BedTLTile(69);
    public static Tile bedTRTile = new BedTRTile(70);
    public static Tile bedCLTile = new BedCLTile(90);
    public static Tile bedCRTile = new BedCRTile(91);
    public static Tile bedBLTile = new BedBLTile(71);
    public static Tile bedBRTile = new BedBRTile(72);

    public static Tile diningTLTile = new DiningTLTile(73);
    public static Tile diningTRTile = new DiningTRTile(74);
    public static Tile diningBLTile = new DiningBLTile(75);
    public static Tile diningBRTile = new DiningBRTile(76);

    public static Tile rugTLTile = new RugTLTile(77);
    public static Tile rugTCTile = new RugTCTile(78);
    public static Tile rugTRTile = new RugTRTile(79);
    public static Tile rugBLTile = new RugBLTile(80);
    public static Tile rugBCTile = new RugBCTile(81);
    public static Tile rugBRTile = new RugBRTile(82);

    public static Tile grassLongTile = new GrassLongTile(83);
    public static Tile grassFlowersTile = new GrassFlowersTile(84);
    public static Tile grassRockTile = new GrassRockTile(85);
    public static Tile grassShortTile = new GrassShortTile(86);

    public static Tile doorTopTile = new DoorTopTile(87);
    public static Tile doorBotTile = new DoorBotTile(88);

    public static Tile pathTile = new PathTile(89);

    //CLASS

    public static final int TILEWIDTH = 32, TILEHEIGHT = 32;

    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id) {
        this.texture = texture;
        this.id = id;

        tiles[id] = this;
    }

    public void tick() {

    }

    public void render(Graphics g, int x, int y) {
        g.drawImage(texture,x,y,TILEWIDTH,TILEHEIGHT,null);
    }

    public boolean isSolid() {
        return false;
    }

    public int getId() {
        return id;
    }
}
