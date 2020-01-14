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

        return checkDefend;
    }


    public int getNumberofWoundeds() {
        return 5;
    }

    public int getNumberofInfantrymen() {
        int countTotal = 0;
        for (Soldier soldier : listSoldier) {
            if (soldier.toString() != "Horsemen") {
                countTotal += 1;
            }
        }
        return countTotal;
    }

    public int getNumberofHorsemen() {
        int countTotal = 0;
        for (Soldier soldier : listSoldier) {
            if (soldier.toString() == "Horsemen") {
                countTotal += 1;
            }
        }
        return countTotal;
    }

    @Override
    public boolean isAlive() {
        for (Soldier s : listSoldier) {
            if (s.isAlive())
                return true;
        }
        return false;
    }

    public List<Soldier> getListSoldiers() {
        return this.listSoldier;
    }

}