package dev.tilegame.inventory;

import dev.tilegame.entities.animals.Pet;

import java.awt.image.BufferedImage;

/**
 * Basic Item abstract class.
 *
 * @author kaseystowell
 * @version 11.14.2017
 */
public abstract class Item {

    int cost;
    String name;
    String description;
    BufferedImage img;
    BufferedImage[] ani;

    /**
     * Constructor for the basic item.
     *
     * @param name string value for an item name.
     * @param cost integer representation for cost.
     * @param img Image object that can be drawn on canvas.
     * @param ani
     */
    public Item(String name, String description, int cost, BufferedImage img, BufferedImage[] ani) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.img = img;
        this.ani = new BufferedImage[ani.length];
        for (int i = 0; i < ani.length; i++)
            this.ani[i] = ani[i];
    }

    /** Getters and Setters **/

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    public BufferedImage[] getAni() {
        BufferedImage[] ani = new BufferedImage[this.ani.length];
        for (int i = 0; i < this.ani.length; i++)
            ani[i] = this.ani[i];
        return ani;
    }

    public void setAni(BufferedImage[] ani) {
        this.ani = new BufferedImage[ani.length];
        for (int i = 0; i < ani.length; i++)
            this.ani[i] = ani[i];
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /** Methods **/

    /**
     * Use the item with the pet.
     * @param pet pet entity in the game.
     */
    public void useItem(Pet pet){
        // do nothing
    }

}
