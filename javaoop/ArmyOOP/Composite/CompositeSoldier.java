package javaoop.ArmyOOP.Composite;

import javaoop.ArmyOOP.Soldier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * CompositeSoldier
 */
public abstract class CompositeSoldier implements Soldier{

    protected List<Soldier> listSodiers = new ArrayList<Soldier>();

    public boolean defend(int hits) {
        int damage = (int) Math.ceil(hits / listSodiers.size());
        boolean checkDefend = false;
        Iterator<Soldier> iter = listSodiers.iterator();

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