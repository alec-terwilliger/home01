/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextAdventure;

/**
 *
 * @author alec.terwilliger
 */
public class Exit {

    // instance variable

    private String exitName, exitDescription, exitTransition;
    private Room destination;
    private Item requiredItem;
    private boolean creatureBlocks;

    // Constructor method

    public Exit(String exitName, String exitDescription, String exitTransition, Room destination, Item requiredItem, boolean creatureBlocks) {
        this.exitName = exitName;
        this.exitDescription = exitDescription;
        this.exitTransition = exitTransition;
        this.destination = destination;
        this.requiredItem = requiredItem;
        this.creatureBlocks = creatureBlocks;
    }

    // accessor methods

    public String getName() {
        return (exitName);
    }

    public String getDescription() {
        return (exitDescription);
    }

    public String getTransition() {
        return (exitTransition);
    }

    public Room getDestination() {
        return (destination);
    }

    public Item getRequiredItem() {
        return (requiredItem);
    }

    public boolean getCreatureBlocks() {
        return (creatureBlocks);
    }

    // mutator methods
    public void setDestination(Room destination) {
        this.destination = destination;
    }

    public void setRequiredItem(Item item) {
        this.requiredItem = item;
    }

    public void setCreatureBlocks(boolean value) {
        this.creatureBlocks = value;
    }

}
