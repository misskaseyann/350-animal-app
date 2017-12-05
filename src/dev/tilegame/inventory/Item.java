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
    /**the cost of the item. */
    protected int cost;
    /**the name of the item. */
    protected String name;
    /** the item description. */
    protected String description;
    /** the images for the item. */
    protected BufferedImage img;
    /** buffered image animation. */
    protected BufferedImage[] ani;

    /**
     * Constructor for the basic item.
     *
     * @param inName string value for an item name.
     * @param inCost integer representation for cost.
     * @param inImg Image object that can be drawn on canvas.
     * @param inAni animation
     * @param inDescription item description
     */
    public Item(final String inName, final String inDescription, final int inCost, final BufferedImage inImg, final BufferedImage[] inAni) {
        this.name = inName;
        this.description = inDescription;
        this.cost = inCost;
        this.img = inImg;
        this.ani = inAni;
    }

    /** Getters and Setters. **/
    /** get cost of item.
     * @return cost */
    public int getCost() {
        return cost;
    }
    /** set cost.
     * @param inCost of item*/
    public void setCost(final int inCost) {
        this.cost = inCost;
    }
    /** get name of item.
     * @return name */
    public String getName() {
        return name;
    }
    /** set name.
     * @param inName of item*/
    public void setName(final String inName) {
        this.name = inName;
    }
    /** return the image.
     * @return img the image of the item */
    public BufferedImage getImg() {
        return img;
    }
    /** set image.
     * @param inImg the item image*/
    public void setImg(final BufferedImage inImg) {
        this.img = inImg;
    }
    /** getting the animation.
     * @return ani of the item */
    public BufferedImage[] getAni() {
        return ani;
    }
    /**set animation.
     * @param inAni the animation for the item*/
    public void setAni(final BufferedImage[] inAni) {
        this.ani = inAni;
    }
    /** the description of the item.
     * @return description of item */
    public String getDescription() {
        return description;
    }
    /**set description.
     * @param inDescription of item*/
    public void setDescription(final String inDescription) {
        this.description = inDescription;
    }

    /** Methods **/

    /**
     * Use the item with the pet.
     * @param pet pet entity in the game.
     */
    public void useItem(final Pet pet) {
        // do nothing
    }
}
