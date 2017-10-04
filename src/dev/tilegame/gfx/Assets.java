package dev.tilegame.gfx;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Any image, sound, piece of music.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Assets {

    public static BufferedImage
            dog,
            woodFloor, kitchenFloor, bathFloor, stoneFloor,
            wallLeft, wallCenter, wallRight, wallEnd,
            ceilingLeft, ceilingCenter, ceilingRight, ceilingEnd, ceilingDown,
            ceilingBCL, ceilingBCR, ceilingTCL, ceilingTCR, ceilingPDown, ceilingPLeft, ceilingPRight,
            outWallTL, outWallTC, outWallTR, outWallBL, outWallBC, outWallBR,
            plantTop, plantBot,
            kitTableTL, kitTableTR, kitTableBL, kitTableBR,
            chairLeft, chairRight,
            counterCenter, counterCorner, counterEnd,
            dogBowl, dogBone, box,
            fridgeTop, fridgeBot, stoveTop, stoveBot, sinkLTop, sinkLBot, sinkRTop, sinkRBot,
            phone, kitRug, clock, endTable,
            toiletTop, toiletBot, bathSinkTop, bathSinkBot, showerTop, showerBot,
            couchLeft, couchRight, tvTop, tvBot,
            shelfTL, shelfTR, shelfBL, shelfBR,
            deskTop, deskBot,
            bedTL, bedTR, bedCL, bedCR, bedBL, bedBR,
            diningTL, diningTR, diningBL, diningBR,
            rugTL, rugTC, rugTR, rugBL, rugBC, rugBR,
            grassLong, grassFlowers, grassRock, grassShort,
            doorTop, doorBot,
            path,
            pug;
    public static BufferedImage[] dogDown, dogLeft, dogRight, dogUp;


    private static final int WIDTH = 32, HEIGHT = 32;

    // load everything in game and loads only ONCE
    public static void init() {
        SpriteSheet dogSheet = new SpriteSheet(ImageLoader.loadImage("/textures/dog.png"));
        SpriteSheet houseSheet = new SpriteSheet(ImageLoader.loadImage("/textures/home2.png"));

        // ANIMAL ASSETS

        dog = dogSheet.crop(WIDTH, 0, WIDTH, HEIGHT);

        dogDown = new BufferedImage[4];
        dogDown[0] = dogSheet.crop(WIDTH, 0, WIDTH, HEIGHT);
        dogDown[1] = dogSheet.crop(0, 0, WIDTH, HEIGHT);
        dogDown[2] = dogSheet.crop(WIDTH, 0, WIDTH, HEIGHT);
        dogDown[3] = dogSheet.crop(WIDTH * 2, 0, WIDTH, HEIGHT);

        dogLeft = new BufferedImage[4];
        dogLeft[0] = dogSheet.crop(WIDTH, HEIGHT, WIDTH, HEIGHT);
        dogLeft[1] = dogSheet.crop(0, HEIGHT, WIDTH, HEIGHT);
        dogLeft[2] = dogSheet.crop(WIDTH, HEIGHT, WIDTH, HEIGHT);
        dogLeft[3] = dogSheet.crop(WIDTH * 2, HEIGHT, WIDTH, HEIGHT);

        dogRight = new BufferedImage[4];
        dogRight[0] = dogSheet.crop(WIDTH, HEIGHT * 2, WIDTH, HEIGHT);
        dogRight[1] = dogSheet.crop(0, HEIGHT * 2, WIDTH, HEIGHT);
        dogRight[2] = dogSheet.crop(WIDTH, HEIGHT * 2, WIDTH, HEIGHT);
        dogRight[3] = dogSheet.crop(WIDTH * 2, HEIGHT * 2, WIDTH, HEIGHT);

        dogUp = new BufferedImage[4];
        dogUp[0] = dogSheet.crop(WIDTH, HEIGHT * 3, WIDTH, HEIGHT);
        dogUp[1] = dogSheet.crop(0, HEIGHT * 3, WIDTH, HEIGHT);
        dogUp[2] = dogSheet.crop(WIDTH, HEIGHT * 3, WIDTH, HEIGHT);
        dogUp[3] = dogSheet.crop(WIDTH * 2, HEIGHT * 3, WIDTH, HEIGHT);

        // WORLD ASSETS

        woodFloor = houseSheet.crop(0, 0, WIDTH, HEIGHT);
        kitchenFloor = houseSheet.crop(WIDTH, 0, WIDTH, HEIGHT);
        bathFloor = houseSheet.crop(WIDTH * 2, 0, WIDTH, HEIGHT);
        stoneFloor = houseSheet.crop(WIDTH, HEIGHT * 2, WIDTH, HEIGHT);

        wallLeft = houseSheet.crop(WIDTH * 3, 0, WIDTH, HEIGHT);
        wallCenter = houseSheet.crop(WIDTH * 4, 0, WIDTH, HEIGHT);
        wallRight = houseSheet.crop(WIDTH * 5, 0, WIDTH, HEIGHT);
        wallEnd = houseSheet.crop(0, HEIGHT * 2, WIDTH, HEIGHT);

        ceilingLeft = houseSheet.crop(WIDTH * 6, 0, WIDTH, HEIGHT);
        ceilingCenter = houseSheet.crop(WIDTH * 7, 0, WIDTH, HEIGHT);
        ceilingRight = houseSheet.crop(WIDTH * 8, 0, WIDTH, HEIGHT);
        ceilingEnd = houseSheet.crop(0, HEIGHT, WIDTH, HEIGHT);
        ceilingDown = houseSheet.crop(WIDTH, HEIGHT, WIDTH, HEIGHT);
        ceilingBCL = houseSheet.crop(WIDTH * 2, HEIGHT, WIDTH, HEIGHT);
        ceilingBCR = houseSheet.crop(WIDTH * 3, HEIGHT, WIDTH, HEIGHT);
        ceilingTCL = houseSheet.crop(WIDTH * 6, HEIGHT * 3, WIDTH, HEIGHT);
        ceilingTCR = houseSheet.crop(WIDTH * 7, HEIGHT * 3, WIDTH, HEIGHT);
        ceilingPDown = houseSheet.crop(WIDTH * 8, HEIGHT * 6, WIDTH, HEIGHT);
        ceilingPLeft = houseSheet.crop(WIDTH * 9, HEIGHT * 5, WIDTH, HEIGHT);
        ceilingPRight = houseSheet.crop(WIDTH * 9, HEIGHT * 6, WIDTH, HEIGHT);

        outWallTL = houseSheet.crop(WIDTH * 10, HEIGHT * 5, WIDTH, HEIGHT);
        outWallTC = houseSheet.crop(WIDTH * 11, HEIGHT * 5, WIDTH, HEIGHT);
        outWallTR = houseSheet.crop(WIDTH * 12, HEIGHT * 5, WIDTH, HEIGHT);
        outWallBL = houseSheet.crop(WIDTH * 10, HEIGHT * 6, WIDTH, HEIGHT);
        outWallBC = houseSheet.crop(WIDTH * 11, HEIGHT * 6, WIDTH, HEIGHT);
        outWallBR = houseSheet.crop(WIDTH * 12, HEIGHT * 6, WIDTH, HEIGHT);

        plantTop = houseSheet.crop(WIDTH * 9, 0, WIDTH, HEIGHT);
        plantBot = houseSheet.crop(WIDTH * 9, HEIGHT, WIDTH, HEIGHT);

        kitTableTL = houseSheet.crop(WIDTH * 10, 0, WIDTH, HEIGHT);
        kitTableTR = houseSheet.crop(WIDTH * 11, 0, WIDTH, HEIGHT);
        kitTableBL = houseSheet.crop(WIDTH * 10, HEIGHT, WIDTH, HEIGHT);
        kitTableBR = houseSheet.crop(WIDTH * 11, HEIGHT, WIDTH, HEIGHT);

        chairLeft = houseSheet.crop(WIDTH * 12, HEIGHT, WIDTH, HEIGHT);
        chairRight = houseSheet.crop(WIDTH * 12, 0, WIDTH, HEIGHT);

        counterCenter = houseSheet.crop(WIDTH * 2, HEIGHT * 2, WIDTH, HEIGHT);
        counterCorner = houseSheet.crop(WIDTH * 3, HEIGHT * 2, WIDTH, HEIGHT);
        counterEnd = houseSheet.crop(WIDTH * 4, HEIGHT * 2, WIDTH, HEIGHT);

        dogBowl = houseSheet.crop(WIDTH * 4, HEIGHT, WIDTH, HEIGHT);
        dogBone = houseSheet.crop(WIDTH * 3, HEIGHT * 4, WIDTH, HEIGHT);
        box = houseSheet.crop(WIDTH * 4, HEIGHT * 4, WIDTH, HEIGHT);

        fridgeTop = houseSheet.crop(WIDTH * 5, HEIGHT, WIDTH, HEIGHT);
        fridgeBot = houseSheet.crop(WIDTH * 5, HEIGHT * 2, WIDTH, HEIGHT);
        stoveTop = houseSheet.crop(WIDTH * 6, HEIGHT, WIDTH, HEIGHT);
        stoveBot = houseSheet.crop(WIDTH * 6, HEIGHT * 2, WIDTH, HEIGHT);
        sinkLTop = houseSheet.crop(WIDTH * 7, HEIGHT, WIDTH, HEIGHT);
        sinkLBot = houseSheet.crop(WIDTH * 7, HEIGHT * 2, WIDTH, HEIGHT);
        sinkRTop = houseSheet.crop(WIDTH * 8, HEIGHT, WIDTH, HEIGHT);
        sinkRBot = houseSheet.crop(WIDTH * 8, HEIGHT * 2, WIDTH, HEIGHT);

        phone = houseSheet.crop(WIDTH * 9, HEIGHT * 2, WIDTH, HEIGHT);
        kitRug = houseSheet.crop(WIDTH * 6, HEIGHT * 4, WIDTH, HEIGHT);
        clock = houseSheet.crop(WIDTH * 7, HEIGHT * 4, WIDTH, HEIGHT);
        endTable = houseSheet.crop(WIDTH * 10, HEIGHT * 4, WIDTH, HEIGHT);

        toiletTop = houseSheet.crop(0, HEIGHT * 3, WIDTH, HEIGHT);
        toiletBot = houseSheet.crop(0, HEIGHT * 4, WIDTH, HEIGHT);
        bathSinkTop = houseSheet.crop(WIDTH, HEIGHT * 3, WIDTH, HEIGHT);
        bathSinkBot = houseSheet.crop(WIDTH, HEIGHT * 4, WIDTH, HEIGHT);
        showerTop = houseSheet.crop(WIDTH * 2, HEIGHT * 3, WIDTH, HEIGHT);
        showerBot = houseSheet.crop(WIDTH * 2, HEIGHT * 4, WIDTH, HEIGHT);

        couchLeft = houseSheet.crop(WIDTH * 3, HEIGHT * 3, WIDTH, HEIGHT);
        couchRight = houseSheet.crop(WIDTH * 4, HEIGHT * 3, WIDTH, HEIGHT);
        tvTop = houseSheet.crop(WIDTH * 5, HEIGHT * 3, WIDTH, HEIGHT);
        tvBot = houseSheet.crop(WIDTH * 5, HEIGHT * 4, WIDTH, HEIGHT);

        shelfTL = houseSheet.crop(WIDTH * 8, HEIGHT * 3, WIDTH, HEIGHT);
        shelfTR = houseSheet.crop(WIDTH * 9, HEIGHT * 3, WIDTH, HEIGHT);
        shelfBL = houseSheet.crop(WIDTH * 8, HEIGHT * 4, WIDTH, HEIGHT);
        shelfBR = houseSheet.crop(WIDTH * 9, HEIGHT * 4, WIDTH, HEIGHT);

        deskTop = houseSheet.crop(WIDTH * 10, HEIGHT * 2, WIDTH, HEIGHT);
        deskBot = houseSheet.crop(WIDTH * 10, HEIGHT * 3, WIDTH, HEIGHT);

        bedTL = houseSheet.crop(WIDTH * 11, HEIGHT * 2, WIDTH, HEIGHT);
        bedTR = houseSheet.crop(WIDTH * 12, HEIGHT * 2, WIDTH, HEIGHT);
        bedCL = houseSheet.crop(WIDTH * 11, HEIGHT * 3, WIDTH, HEIGHT);
        bedCR = houseSheet.crop(WIDTH * 12, HEIGHT * 3, WIDTH, HEIGHT);
        bedBL = houseSheet.crop(WIDTH * 11, HEIGHT * 4, WIDTH, HEIGHT);
        bedBR = houseSheet.crop(WIDTH * 12, HEIGHT * 4, WIDTH, HEIGHT);

        diningTL = houseSheet.crop(0, HEIGHT * 5, WIDTH, HEIGHT);
        diningTR = houseSheet.crop(WIDTH, HEIGHT * 5, WIDTH, HEIGHT);
        diningBL = houseSheet.crop(0, HEIGHT * 6, WIDTH, HEIGHT);
        diningBR = houseSheet.crop(WIDTH, HEIGHT * 6, WIDTH, HEIGHT);

        rugTL = houseSheet.crop(WIDTH * 2, HEIGHT * 5, WIDTH, HEIGHT);
        rugTC = houseSheet.crop(WIDTH * 3, HEIGHT * 5, WIDTH, HEIGHT);
        rugTR = houseSheet.crop(WIDTH * 4, HEIGHT * 5, WIDTH, HEIGHT);
        rugBL = houseSheet.crop(WIDTH * 2, HEIGHT * 6, WIDTH, HEIGHT);
        rugBC = houseSheet.crop(WIDTH * 3, HEIGHT * 6, WIDTH, HEIGHT);
        rugBR = houseSheet.crop(WIDTH * 4, HEIGHT * 6, WIDTH, HEIGHT);

        grassLong = houseSheet.crop(WIDTH * 5, HEIGHT * 5, WIDTH, HEIGHT);
        grassFlowers = houseSheet.crop(WIDTH * 6, HEIGHT * 5, WIDTH, HEIGHT);
        grassRock = houseSheet.crop(WIDTH * 5, HEIGHT * 6, WIDTH, HEIGHT);
        grassShort = houseSheet.crop(WIDTH * 6, HEIGHT * 6, WIDTH, HEIGHT);

        doorTop = houseSheet.crop(WIDTH * 7, HEIGHT * 5, WIDTH, HEIGHT);
        doorBot = houseSheet.crop(WIDTH * 7, HEIGHT * 6, WIDTH, HEIGHT);

        path = houseSheet.crop(WIDTH * 8, HEIGHT * 5, WIDTH, HEIGHT);
    }
}
