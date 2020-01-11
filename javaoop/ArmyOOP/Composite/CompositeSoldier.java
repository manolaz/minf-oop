package javaoop.ArmyOOP.Composite;

import javaoop.ArmyOOP.Soldier;
import java.util.List;

/**
 * CompositeSoldier
 */
public abstract class CompositeSoldier implements Soldier{

    List<Soldier> listSodier = new List<Soldier>;

    // public boolean defend(int amor, int damage, int health) {
    //     return (damage - amor) > health;
    // }

    public boolean defend(int hits) {
        int damage = (int) Math.ceil(force / listSodier.size());
        if (damage > this.health) {
            return false;
        } else {
            int alive = this.health - damage;
            return alive > 0;
        }

        

        while (iter.hasNext()) {
            
        }
    }
}