package dev.tilegame.gfx;

import java.awt.image.BufferedImage;

/**
 * Any image, sound, piece of music.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Assets {

    public static BufferedImage
            dog,
            floorWood, floorTile, floorBathTile, floorDoor,
            ceilingLRReg, ceilingLeft, ceilingRight, ceilingUDReg, ceilingDown, ceilingCRight, ceilingCLeft,
            wallReg, wallLeft, wallRight, wallUD,
            counterReg, counterTurn, counterEnd,
            bowl, fridge1, fridge2, stove, kitchenSink,
            plant1, phone, couch1, couch2, bone, box, tv,
            toilet, bathroomSink, shower,
            empty;

    private static final int WIDTH = 32, HEIGHT = 32;

    // load everything in game and loads only ONCE
    public static void init() {
        SpriteSheet dogSheet = new SpriteSheet(ImageLoader.loadImage("/textures/dog.png"));
        SpriteSheet houseSheet = new SpriteSheet(ImageLoader.loadImage("/textures/home2.png"));

        dog = dogSheet.crop(WIDTH,0,WIDTH,HEIGHT);

        floorWood = houseSheet.crop(0,0,WIDTH,HEIGHT);
        floorTile = houseSheet.crop(WIDTH,0,WIDTH,HEIGHT);
        floorBathTile = houseSheet.crop(WIDTH * 2,0,WIDTH,HEIGHT);
        floorDoor = houseSheet.crop(WIDTH,HEIGHT * 2,WIDTH,HEIGHT);

        ceilingLRReg = houseSheet.crop(WIDTH * 7,0,WIDTH,HEIGHT);
        ceilingLeft = houseSheet.crop(WIDTH * 6,0,WIDTH,HEIGHT);
        ceilingRight = houseSheet.crop(WIDTH * 8,0,WIDTH,HEIGHT);
        ceilingUDReg = houseSheet.crop(WIDTH,HEIGHT,WIDTH,HEIGHT);
        ceilingDown = houseSheet.crop(0,HEIGHT,WIDTH,HEIGHT);
        ceilingCLeft = houseSheet.crop(WIDTH * 3, HEIGHT,WIDTH,HEIGHT);
        ceilingCRight = houseSheet.crop(WIDTH * 2,HEIGHT,WIDTH,HEIGHT);

        counterReg = houseSheet.crop(WIDTH * 2,HEIGHT * 2,WIDTH,HEIGHT);
        counterTurn = houseSheet.crop(WIDTH * 3,HEIGHT * 2,WIDTH,HEIGHT);
        counterEnd = houseSheet.crop(WIDTH * 4,HEIGHT * 2,WIDTH,HEIGHT);

        wallReg = houseSheet.crop(WIDTH * 4,0,WIDTH,HEIGHT);
        wallLeft = houseSheet.crop(WIDTH * 3,0,WIDTH,HEIGHT);
        wallRight = houseSheet.crop(WIDTH * 5,0,WIDTH,HEIGHT);
        wallUD = houseSheet.crop(0,HEIGHT * 2,WIDTH,HEIGHT);

        bowl = houseSheet.crop(WIDTH * 4,HEIGHT,WIDTH,HEIGHT);
        bone = houseSheet.crop(WIDTH*3,HEIGHT*4,WIDTH,HEIGHT);
        couch1 = houseSheet.crop(WIDTH * 3,HEIGHT * 3,WIDTH,HEIGHT);
        couch2 = houseSheet.crop(WIDTH * 4, HEIGHT * 3,WIDTH,HEIGHT);
        fridge1 = houseSheet.crop(WIDTH*5,HEIGHT,WIDTH,HEIGHT);
        fridge2 = houseSheet.crop(WIDTH*5,HEIGHT*2,WIDTH,HEIGHT);

        empty = houseSheet.crop(0,HEIGHT * 5,WIDTH,HEIGHT);
    }
}
