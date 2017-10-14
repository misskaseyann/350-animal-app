package dev.tilegame.stats;

import dev.tilegame.entities.animals.Animal;
import dev.tilegame.gfx.Assets;

import java.awt.image.BufferedImage;

/**
 * @author kaseystowell
 * @version 10.10.2017
 */
public class StatsManager {

    private Animal pet;

    public StatsManager(Animal pet) {
        this.pet = pet;
    }

    //health
    public BufferedImage healthBar() {
        switch (pet.getHealth()) {
            case 6:
                return Assets.getHearts()[6];
            case 5:
                return Assets.getHearts()[5];
            case 4:
                return Assets.getHearts()[4];
            case 3:
                return Assets.getHearts()[3];
            case 2:
                return Assets.getHearts()[2];
            case 1:
                return Assets.getHearts()[1];
            default:
                return Assets.getHearts()[0];
        }
    }

    //hunger
    public BufferedImage hungerBar() {
        switch (pet.getHunger()) {
            case 6:
                return Assets.getHearts()[6];
            case 5:
                return Assets.getHearts()[5];
            case 4:
                return Assets.getHearts()[4];
            case 3:
                return Assets.getHearts()[3];
            case 2:
                return Assets.getHearts()[2];
            case 1:
                return Assets.getHearts()[1];
            default:
                return Assets.getHearts()[0];
        }
    }

    //happiness
    public BufferedImage happyBar() {
        switch (pet.getHappiness()) {
            case 6:
                return Assets.getHearts()[6];
            case 5:
                return Assets.getHearts()[5];
            case 4:
                return Assets.getHearts()[4];
            case 3:
                return Assets.getHearts()[3];
            case 2:
                return Assets.getHearts()[2];
            case 1:
                return Assets.getHearts()[1];
            default:
                return Assets.getHearts()[0];
        }
    }

    //cleanliness
    public BufferedImage cleanBar() {
        switch (pet.getCleanliness()) {
            case 6:
                return Assets.getHearts()[6];
            case 5:
                return Assets.getHearts()[5];
            case 4:
                return Assets.getHearts()[4];
            case 3:
                return Assets.getHearts()[3];
            case 2:
                return Assets.getHearts()[2];
            case 1:
                return Assets.getHearts()[1];
            default:
                return Assets.getHearts()[0];
        }
    }

    public BufferedImage emojiBox() {
        switch (pet.getHealth()) {
            case 6:
                return Assets.getEmotions()[6];
            case 5:
                return Assets.getEmotions()[5];
            case 4:
                return Assets.getEmotions()[4];
            case 3:
                return Assets.getEmotions()[3];
            case 2:
                return Assets.getEmotions()[2];
            case 1:
                return Assets.getEmotions()[1];
            default:
                return Assets.getEmotions()[0];
        }
    }

}
