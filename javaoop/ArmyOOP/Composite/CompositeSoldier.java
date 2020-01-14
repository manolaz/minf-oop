package javaoop.ArmyOOP.Composite;

import javaoop.ArmyOOP.Soldier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * CompositeSoldier
 */
public abstract class CompositeSoldier implements Soldier{    
    protected List<Soldier> listSoldier;

    public CompositeSoldier() {
        listSoldier = new ArrayList<Soldier>();
    }

    // (d) Count the number of soldier with the life less than 10 (can be moved to the hospital).
    public void addSoldier(Soldier s) {
        listSoldier.add(s);
    }


    @Override
    public int hit() {
        int totalHit = 0;
        for (Soldier s : listSoldier) {
            if (s != null)
                totalHit += s.hit();
        }
        return totalHit;
    }

    @Override
    public boolean defend(int force) {
        int damage = (int) Math.ceil(force / listSoldier.size());
        boolean checkDefend = false;
        Iterator<Soldier> iter = listSoldier.iterator();

        while (iter.hasNext()) {
            Soldier s = iter.next();
            if (s.defend(damage))
                checkDefend = true;
            else
                iter.remove();
        }

        // for (Soldier s: listSoldier) {
        // if (s.defend(damage))
        // checkDefend = true;
        // else
        // listSoldier.remove(s);
        // }

        return checkDefend;
    }


    public int getNumberofWoundeds() {
        return 5;
    }

    public int getNumberofInfantrymen() {
        return 100;
    }

    public int getNumberofHorsemen() {
        return 50;
    }

    @Override
    public boolean isAlive() {
        // TODO Auto-generated method stub
        return false;
    }

}