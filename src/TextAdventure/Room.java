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
public class Room {

    // instance variables
    private String roomName;
    private String roomDescription;
    private Exit exit1, exit2, exit3, exit4, secretExit;
    private Item item;
    private Creature creature;

    // constructor methods
    // 1 Exit
    public Room(String roomName, String roomDescription, Exit exit1) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.exit1 = exit1;
    }

    // 2 Exits
    public Room(String roomName, String roomDescription, Exit exit1,
            Exit exit2) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.exit1 = exit1;
        this.exit2 = exit2;
    }

    // 3 Exits
    public Room(String roomName, String roomDescription, Exit exit1,
            Exit exit2, Exit exit3) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.exit1 = exit1;
        this.exit2 = exit2;
        this.exit3 = exit3;
    }
    // 4 Exits

    /**
     *
     * @param roomName
     * @param roomDescription
     * @param exit1
     * @param exit2
     * @param exit3
     * @param exit4
     */
    public Room(String roomName, String roomDescription, Exit exit1,
            Exit exit2, Exit exit3, Exit exit4) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.exit1 = exit1;
        this.exit2 = exit2;
        this.exit3 = exit3;
        this.exit4 = exit4;
    }
    // 4 Exits 1 Item

    /**
     *
     * @param roomName
     * @param roomDescription
     * @param exit1
     * @param exit2
     * @param exit3
     * @param exit4
     * @param item
     */
    public Room(String roomName, String roomDescription, Exit exit1,
            Exit exit2, Exit exit3, Exit exit4, Item item) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.exit1 = exit1;
        this.exit2 = exit2;
        this.exit3 = exit3;
        this.exit4 = exit4;
        this.item = item;
    }
    // 3 Exits 1 Item

    /**
     *
     * @param roomName
     * @param roomDescription
     * @param exit1
     * @param exit2
     * @param exit3
     * @param item
     */
    public Room(String roomName, String roomDescription, Exit exit1,
            Exit exit2, Exit exit3, Item item) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.exit1 = exit1;
        this.exit2 = exit2;
        this.exit3 = exit3;
        this.item = item;
    }
    // 2 Exits 1 Item

    /**
     *
     * @param roomName
     * @param roomDescription
     * @param exit1
     * @param exit2
     * @param item
     */
    public Room(String roomName, String roomDescription, Exit exit1,
            Exit exit2, Item item) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.exit1 = exit1;
        this.exit2 = exit2;
        this.item = item;
    }
    // 1 Exit 1 Item

    /**
     *
     * @param roomName
     * @param roomDescription
     * @param exit1
     * @param item
     */
    public Room(String roomName, String roomDescription, Exit exit1, Item item) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.exit1 = exit1;
        this.item = item;
    }

    // 1 Exit 1 Creature 
    public Room(String roomName, String roomDescription, Exit exit1, Creature creature) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.exit1 = exit1;
        this.creature = creature;
    }

    // 2 Exits 1 Creature 
    public Room(String roomName, String roomDescription, Exit exit1, Exit exit2,
            Creature creature) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.exit1 = exit1;
        this.exit2 = exit2;
        this.creature = creature;
    }

    // 2 Exits 1 Creature 1 Item
    public Room(String roomName, String roomDescription, Exit exit1, Exit exit2,
            Creature creature, Item item) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.exit1 = exit1;
        this.exit2 = exit2;
        this.creature = creature;
        this.item = item;
    }

    // 1 Exit 1 Creature 1 Item
    public Room(String roomName, String roomDescription, Exit exit1, Creature creature,
            Item item) {
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.exit1 = exit1;
        this.creature = creature;
        this.item = item;
    }

    // Accessor Methods
    public Creature getCreature() {
        return creature;
    }

    public String getName() {
        return roomName;
    }

    public String getDescription() {
        return roomDescription;
    }

    public Exit getExit1() {
        return exit1;
    }

    public Exit getExit2() {
        return exit2;
    }

    public Exit getExit3() {
        return exit3;
    }

    public Exit getExit4() {
        return exit4;
    }

    public Exit getSecretExit() {
        return secretExit;
    }

    public Item getItem() {
        return item;
    }

    // Mutator Methods
    public void setName(String name) {
        this.roomName = name;
    }

    public void setDescription(String newDescription) {
        this.roomDescription = newDescription;
    }

    public void setExit1(Exit exit) {
        this.exit1 = exit;
    }

    public void setExit2(Exit exit) {
        this.exit2 = exit;
    }

    public void setExit3(Exit exit) {
        this.exit3 = exit;
    }

    public void setExit4(Exit exit) {
        this.exit4 = exit;
    }

    public void setSecretExit(Exit exit) {
        this.secretExit = exit;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

}
