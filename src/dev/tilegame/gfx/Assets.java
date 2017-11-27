package dev.tilegame.gfx;

import java.awt.image.BufferedImage;

/**
 * Any game image.
 * @author kaseystowell
 * @author allisonbolen
 * @version 09.24.2017
 */
public class Assets {

    // All images that are rendered on screen.
    private static BufferedImage
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
            mainMenuBot, mainMenuTopReg, mainMenuTopTravel, menuInventory, menuTravel, pauseMenu,
            happiness, hygene, hunger, health, menuButton,
            baconTreat, chewToy, dogBiscuit, chewBone, dogFoodPremium, dogFoodStandard, stuffedAnimal, tennisBall;

    // All animated images rendered on screen.
    private static BufferedImage[] dogDown, dogLeft, dogRight, dogUp, hearts, emotions, titleImg;
    // Tile size.
    private static final int WIDTH = 32, HEIGHT = 32;

    /**
     * Loads all images in the game and loads only once.
     */
    public static void init() {
        // Sprite sheets that can be cropped into individual tiles.
        SpriteSheet dogSheet = new SpriteSheet(ImageLoader.loadImage("/textures/dog.png"));
        SpriteSheet houseSheet = new SpriteSheet(ImageLoader.loadImage("/textures/home.png"));
        SpriteSheet heartSheet = new SpriteSheet(ImageLoader.loadImage("/textures/hearts.png"));
        SpriteSheet wordSheet = new SpriteSheet(ImageLoader.loadImage("/textures/wordssheet.png"));
        SpriteSheet emotionSheet = new SpriteSheet(ImageLoader.loadImage("/textures/emotions.png"));
        SpriteSheet mainMenuTopSheet = new SpriteSheet(ImageLoader.loadImage("/textures/mainmenutop.png"));
        SpriteSheet titleSheet = new SpriteSheet(ImageLoader.loadImage("/textures/titlepic.png"));
        SpriteSheet itemSheet = new SpriteSheet(ImageLoader.loadImage("/textures/items.png"));

        // STATS ASSETS

        // Stat hearts.
        hearts = new BufferedImage[7];
        hearts[6] = heartSheet.crop(0, 0, 126, 35);
        hearts[5] = heartSheet.crop(0, 35, 126, 35);
        hearts[4] = heartSheet.crop(0, 70, 126, 35);
        hearts[3] = heartSheet.crop(0, 105, 126, 35);
        hearts[2] = heartSheet.crop(0, 140, 126, 35);
        hearts[1] = heartSheet.crop(0, 175, 126, 35);
        hearts[0] = heartSheet.crop(0, 210, 126, 35);

        // Stat emotions.
        emotions = new BufferedImage[7];
        emotions[6] = emotionSheet.crop(0, 0, 64, 64);
        emotions[5] = emotionSheet.crop(0, 64, 64, 64);
        emotions[4] = emotionSheet.crop(0, 128, 64, 64);
        emotions[3] = emotionSheet.crop(0, 192, 64, 64);
        emotions[2] = emotionSheet.crop(0, 256, 64, 64);
        emotions[1] = emotionSheet.crop(0, 320, 64, 64);
        emotions[0] = emotionSheet.crop(0, 384, 64, 64);

        // Stat text.
        hunger = wordSheet.crop(0, 0, 119, 11);
        hygene = wordSheet.crop(0, 11, 119, 11);
        health = wordSheet.crop(0, 22, 119, 11);
        happiness = wordSheet.crop(0, 33, 119, 11);

        // MENU ASSETS

        mainMenuBot = ImageLoader.loadImage("/textures/mainmenubot.png");
        mainMenuTopTravel = mainMenuTopSheet.crop(0, 0, 360, 75);
        mainMenuTopReg = mainMenuTopSheet.crop(0, 75, 360, 75);
        menuInventory = ImageLoader.loadImage("/textures/menuinventory.png");
        menuTravel = ImageLoader.loadImage("/textures/menutravel.png");
        pauseMenu = ImageLoader.loadImage("/textures/pausemenu.png");
        menuButton = ImageLoader.loadImage("/textures/menubutton.png");

        // TITLE SCREEN

        titleImg = new BufferedImage[3];
        titleImg[0] = titleSheet.crop(0, 0, 360, 640);
        titleImg[1] = titleSheet.crop(360, 0, 360, 640);
        titleImg[2] = titleSheet.crop(720, 0, 360, 640);

        // ITEMS
        baconTreat = itemSheet.crop(0, 0, 64, 64);
        chewToy = itemSheet.crop(64, 0, 64, 64);
        dogBiscuit = itemSheet.crop(128, 0, 64, 64);
        chewBone = itemSheet.crop(192, 0, 64, 64);
        dogFoodPremium = itemSheet.crop(0, 64, 64, 64);
        dogFoodStandard = itemSheet.crop(64, 64, 64, 64);
        stuffedAnimal = itemSheet.crop(128, 64, 64, 64);
        tennisBall = itemSheet.crop(192, 64, 64, 64);

        // ANIMAL ANIMATION ASSETS

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

    // ANIMATION GETTERS


    /**
     * @return title screen animation images.
     */
    public static BufferedImage[] getTitleImg() {
        return titleImg;
    }

    /**
     * @return walking down animation images.
     */
    public static BufferedImage[] getDogDown() {
        BufferedImage[] buff = dogDown;
        return buff;
    }

    /**
     * @return walking left animation images.
     */
    public static BufferedImage[] getDogLeft() {
        BufferedImage[] buff = dogLeft;
        return buff;
    }

    /**
     * @return walking right animation images.
     */
    public static BufferedImage[] getDogRight() {
        BufferedImage[] buff = dogRight;
        return buff;
    }

    /**
     * @return walking up animation images.
     */
    public static BufferedImage[] getDogUp() {
        BufferedImage[] buff = dogUp;
        return buff;
    }

    // TILE GETTERS

    /**
     * @return regular dog tile.
     */
    public static BufferedImage getDog() {
        return dog;
    }

    /**
     * @return wood floor tile.
     */
    public static BufferedImage getWoodFloor() {
        return woodFloor;
    }

    /**
     * @return kitchen floor tile.
     */
    public static BufferedImage getKitchenFloor() {
        return kitchenFloor;
    }

    /**
     * @return bathroom floor tile.
     */
    public static BufferedImage getBathFloor() {
        return bathFloor;
    }

    /**
     * @return stone floor tile.
     */
    public static BufferedImage getStoneFloor() {
        return stoneFloor;
    }

    /**
     * @return wall left tile.
     */
    public static BufferedImage getWallLeft() {
        return wallLeft;
    }

    /**
     * @return wall center tile.
     */
    public static BufferedImage getWallCenter() {
        return wallCenter;
    }

    /**
     * @return wall right tile.
     */
    public static BufferedImage getWallRight() {
        return wallRight;
    }

    /**
     * @return wall end tile.
     */
    public static BufferedImage getWallEnd() {
        return wallEnd;
    }

    /**
     * @return ceiling left tile.
     */
    public static BufferedImage getCeilingLeft() {
        return ceilingLeft;
    }

    /**
     * @return ceiling center tile.
     */
    public static BufferedImage getCeilingCenter() {
        return ceilingCenter;
    }

    /**
     * @return ceiling right tile
     */
    public static BufferedImage getCeilingRight() {
        return ceilingRight;
    }

    /**
     * @return ceiling end tile.
     */
    public static BufferedImage getCeilingEnd() {
        return ceilingEnd;
    }

    /**
     * @return ceiling down tile.
     */
    public static BufferedImage getCeilingDown() {
        return ceilingDown;
    }

    /**
     * @return ceiling bottom center left tile.
     */
    public static BufferedImage getCeilingBCL() {
        return ceilingBCL;
    }

    /**
     * @return ceiling bottom center right tile.
     */
    public static BufferedImage getCeilingBCR() {
        return ceilingBCR;
    }

    /**
     * @return ceiling top center left tile.
     */
    public static BufferedImage getCeilingTCL() {
        return ceilingTCL;
    }

    /**
     * @return ceiling top center right tile.
     */
    public static BufferedImage getCeilingTCR() {
        return ceilingTCR;
    }

    /**
     * @return ceiling pointing down tile.
     */
    public static BufferedImage getCeilingPDown() {
        return ceilingPDown;
    }

    /**
     * @return ceiling pointing left tile.
     */
    public static BufferedImage getCeilingPLeft() {
        return ceilingPLeft;
    }

    /**
     * @return ceiling poitning right tile.
     */
    public static BufferedImage getCeilingPRight() {
        return ceilingPRight;
    }

    /**
     * @return outer wall top left tile.
     */
    public static BufferedImage getOutWallTL() {
        return outWallTL;
    }

    /**
     * @return outer wall top center tile.
     */
    public static BufferedImage getOutWallTC() {
        return outWallTC;
    }

    /**
     * @return outer wall top right tile.
     */
    public static BufferedImage getOutWallTR() {
        return outWallTR;
    }

    /**
     * @return outer wall bottom left tile.
     */
    public static BufferedImage getOutWallBL() {
        return outWallBL;
    }

    /**
     * @return outer wall bottom center tile.
     */
    public static BufferedImage getOutWallBC() {
        return outWallBC;
    }

    /**
     * @return outer wall bottom right tile.
     */
    public static BufferedImage getOutWallBR() {
        return outWallBR;
    }

    /**
     * @return plant top tile.
     */
    public static BufferedImage getPlantTop() {
        return plantTop;
    }

    /**
     * @return plant bottom tile.
     */
    public static BufferedImage getPlantBot() {
        return plantBot;
    }

    /**
     * @return kitchen table top left tile.
     */
    public static BufferedImage getKitTableTL() {
        return kitTableTL;
    }

    /**
     * @return kitchen table top right tile.
     */
    public static BufferedImage getKitTableTR() {
        return kitTableTR;
    }

    /**
     * @return kitchen table bottom left tile.
     */
    public static BufferedImage getKitTableBL() {
        return kitTableBL;
    }

    /**
     * @return kitchen table bottom right tile.
     */
    public static BufferedImage getKitTableBR() {
        return kitTableBR;
    }

    /**
     * @return chair left facing tile.
     */
    public static BufferedImage getChairLeft() {
        return chairLeft;
    }

    /**
     * @return chair right facing tile.
     */
    public static BufferedImage getChairRight() {
        return chairRight;
    }

    /**
     * @return counter center tile.
     */
    public static BufferedImage getCounterCenter() {
        return counterCenter;
    }

    /**
     * @return counter corner tile.
     */
    public static BufferedImage getCounterCorner() {
        return counterCorner;
    }

    /**
     * @return counter end tile.
     */
    public static BufferedImage getCounterEnd() {
        return counterEnd;
    }

    /**
     * @return dog bowl tile.
     */
    public static BufferedImage getDogBowl() {
        return dogBowl;
    }

    /**
     * @return dog bone tile.
     */
    public static BufferedImage getDogBone() {
        return dogBone;
    }

    /**
     * @return box tile.
     */
    public static BufferedImage getBox() {
        return box;
    }

    /**
     * @return fridge top tile.
     */
    public static BufferedImage getFridgeTop() {
        return fridgeTop;
    }

    /**
     * @return fridge bottom tile.
     */
    public static BufferedImage getFridgeBot() {
        return fridgeBot;
    }

    /**
     * @return stove top tile.
     */
    public static BufferedImage getStoveTop() {
        return stoveTop;
    }

    /**
     * @return stove bottom tile.
     */
    public static BufferedImage getStoveBot() {
        return stoveBot;
    }

    /**
     * @return sink left top tile.
     */
    public static BufferedImage getSinkLTop() {
        return sinkLTop;
    }

    /**
     * @return sink left bottom tile.
     */
    public static BufferedImage getSinkLBot() {
        return sinkLBot;
    }

    /**
     * @return sink right top tile.
     */
    public static BufferedImage getSinkRTop() {
        return sinkRTop;
    }

    /**
     * @return sink right bottom tile.
     */
    public static BufferedImage getSinkRBot() {
        return sinkRBot;
    }

    /**
     * @return phone tile.
     */
    public static BufferedImage getPhone() {
        return phone;
    }

    /**
     * @return kitchen rug tile.
     */
    public static BufferedImage getKitRug() {
        return kitRug;
    }

    /**
     * @return clock tile.
     */
    public static BufferedImage getClock() {
        return clock;
    }

    /**
     * @return end table tile.
     */
    public static BufferedImage getEndTable() {
        return endTable;
    }

    /**
     * @return toilet top tile.
     */
    public static BufferedImage getToiletTop() {
        return toiletTop;
    }

    /**
     * @return toilet bottom tile.
     */
    public static BufferedImage getToiletBot() {
        return toiletBot;
    }

    /**
     * @return bathroom sink top tile.
     */
    public static BufferedImage getBathSinkTop() {
        return bathSinkTop;
    }

    /**
     * @return bathroom sink bottom tile.
     */
    public static BufferedImage getBathSinkBot() {
        return bathSinkBot;
    }

    /**
     * @return shower top tile.
     */
    public static BufferedImage getShowerTop() {
        return showerTop;
    }

    /**
     * @return shower bottom tile.
     */
    public static BufferedImage getShowerBot() {
        return showerBot;
    }

    /**
     * @return couch left tile.
     */
    public static BufferedImage getCouchLeft() {
        return couchLeft;
    }

    /**
     * @return couch right tile.
     */
    public static BufferedImage getCouchRight() {
        return couchRight;
    }

    /**
     * @return tv top tile.
     */
    public static BufferedImage getTvTop() {
        return tvTop;
    }

    /**
     * @return tv bottom tile.
     */
    public static BufferedImage getTvBot() {
        return tvBot;
    }

    /**
     * @return shelf top left tile.
     */
    public static BufferedImage getShelfTL() {
        return shelfTL;
    }

    /**
     * @return shelf top right tile.
     */
    public static BufferedImage getShelfTR() {
        return shelfTR;
    }

    /**
     * @return shelf bottom left tile.
     */
    public static BufferedImage getShelfBL() {
        return shelfBL;
    }

    /**
     * @return shelf bottom right tile.
     */
    public static BufferedImage getShelfBR() {
        return shelfBR;
    }

    /**
     * @return desk top tile.
     */
    public static BufferedImage getDeskTop() {
        return deskTop;
    }

    /**
     * @return desk bottom tile.
     */
    public static BufferedImage getDeskBot() {
        return deskBot;
    }

    /**
     * @return bed top left tile.
     */
    public static BufferedImage getBedTL() {
        return bedTL;
    }

    /**
     * @return bed top right tile.
     */
    public static BufferedImage getBedTR() {
        return bedTR;
    }

    /**
     * @return bed center left tile.
     */
    public static BufferedImage getBedCL() {
        return bedCL;
    }

    /**
     * @return bed center right tile.
     */
    public static BufferedImage getBedCR() {
        return bedCR;
    }

    /**
     * @return bed bottom left tile.
     */
    public static BufferedImage getBedBL() {
        return bedBL;
    }

    /**
     * @return bed bottom right tile.
     */
    public static BufferedImage getBedBR() {
        return bedBR;
    }

    /**
     * @return dining table top left tile.
     */
    public static BufferedImage getDiningTL() {
        return diningTL;
    }

    /**
     * @return dining table top right tile.
     */
    public static BufferedImage getDiningTR() {
        return diningTR;
    }

    /**
     * @return dining table bottom left tile.
     */
    public static BufferedImage getDiningBL() {
        return diningBL;
    }

    /**
     * @return dining table bottom right tile.
     */
    public static BufferedImage getDiningBR() {
        return diningBR;
    }

    /**
     * @return rug top left tile.
     */
    public static BufferedImage getRugTL() {
        return rugTL;
    }

    /**
     * @return rug top center tile.
     */
    public static BufferedImage getRugTC() {
        return rugTC;
    }

    /**
     * @return rug top right tile.
     */
    public static BufferedImage getRugTR() {
        return rugTR;
    }

    /**
     * @return rug bottom left tile.
     */
    public static BufferedImage getRugBL() {
        return rugBL;
    }

    /**
     * @return rug bottom center tile.
     */
    public static BufferedImage getRugBC() {
        return rugBC;
    }

    /**
     * @return rug bottom right tile.
     */
    public static BufferedImage getRugBR() {
        return rugBR;
    }

    /**
     * @return long grass tile.
     */
    public static BufferedImage getGrassLong() {
        return grassLong;
    }

    /**
     * @return grass with flowers tile.
     */
    public static BufferedImage getGrassFlowers() {
        return grassFlowers;
    }

    /**
     * @return grass with rock tile.
     */
    public static BufferedImage getGrassRock() {
        return grassRock;
    }

    /**
     * @return short grass tile.
     */
    public static BufferedImage getGrassShort() {
        return grassShort;
    }

    /**
     * @return front door top tile.
     */
    public static BufferedImage getDoorTop() {
        return doorTop;
    }

    /**
     * @return front door bottom tile.
     */
    public static BufferedImage getDoorBot() {
        return doorBot;
    }

    /**
     * @return path tile.
     */
    public static BufferedImage getPath() {
        return path;
    }

    /**
     * @return main menu bottom.
     */
    public static BufferedImage getMainMenuBot() {
        return mainMenuBot;
    }

    /**
     * @return main menu home top.
     */
    public static BufferedImage getMainMenuTopReg() {
        return mainMenuTopReg;
    }

    /**
     * @return main menu travel top.
     */
    public static BufferedImage getMainMenuTopTravel() {
        return mainMenuTopTravel;
    }

    /**
     * @return inventory screen.
     */
    public static BufferedImage getMenuInventory() {
        return menuInventory;
    }

    /**
     * @return travel screen.
     */
    public static BufferedImage getMenuTravel() {
        return menuTravel;
    }

    /**
     * @return pause screen.
     */
    public static BufferedImage getPauseMenu() {
        return pauseMenu;
    }

    /**
     * @return happiness text.
     */
    public static BufferedImage getHappiness() {
        return happiness;
    }

    /**
     * @return hygene text.
     */
    public static BufferedImage getHygene() {
        return hygene;
    }

    /**
     * @return hunger text.
     */
    public static BufferedImage getHunger() {
        return hunger;
    }

    /**
     * @return health text.
     */
    public static BufferedImage getHealth() {
        return health;
    }

    /**
     * @return menu button.
     */
    public static BufferedImage getMenuButton() {
        return menuButton;
    }

    /**
     * @return heart image array.
     */
    public static BufferedImage[] getHearts() {
        return hearts;
    }

    /**
     * @return emotion image array.
     */
    public static BufferedImage[] getEmotions() {
        return emotions;
    }

    /**
     * @return bacon treat image.
     */
    public static BufferedImage getBaconTreat() {
        return baconTreat;
    }

    /**
     * @return chew toy image.
     */
    public static BufferedImage getChewToy() {
        return chewToy;
    }

    /**
     * @return dog biscuit image.
     */
    public static BufferedImage getDogBiscuit() {
        return dogBiscuit;
    }

    /**
     * @return chew bone image.
     */
    public static BufferedImage getChewBone() {
        return chewBone;
    }

    /**
     * @return premium dog food image.
     */
    public static BufferedImage getDogFoodPremium() {
        return dogFoodPremium;
    }

    /**
     * @return standard dog food image.
     */
    public static BufferedImage getDogFoodStandard() {
        return dogFoodStandard;
    }

    /**
     * @return stuffed animal image.
     */
    public static BufferedImage getStuffedAnimal() {
        return stuffedAnimal;
    }

    /**
     * @return tennis ball image.
     */
    public static BufferedImage getTennisBall() {
        return tennisBall;
    }
}
