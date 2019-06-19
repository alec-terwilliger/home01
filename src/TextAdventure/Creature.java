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
public class Creature {

    private String creatureName, creatureDescription, defeatedText;
    private Item itemToDestroy;

    public Creature(String creatureName, String creatureDescription,
            String defeatedText, Item itemToDestroy) {
        this.creatureName = creatureName;
        this.creatureDescription = creatureDescription;
        this.defeatedText = defeatedText;
        this.itemToDestroy = itemToDestroy;
    }

    public String getName() {
        return (creatureName);
    }

    public String getDescription() {
        return (creatureDescription);
    }

    public String getDefeatedText() {
        return (defeatedText);
    }

    public Item getItemToDestroy() {
        return (itemToDestroy);
    }

    public void setItemToDestroy(Item item) {
        itemToDestroy = item;
    }

}
