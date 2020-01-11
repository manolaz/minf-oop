package javaoop.ArmyOOP;

/**
 * AbstractSoldier
 */
public class AbstractSoldier implements Soldier {
    
    private int health;
    // private int strenght = 0;

    AbstractSoldier(int health) {
        this.health = health;
    }

    public boolean defend(int damage) {
        if (damage > this.health) {
            return false;
        } else {
            int alive = this.health - damage;
            return alive > 0;
        }
    }
}