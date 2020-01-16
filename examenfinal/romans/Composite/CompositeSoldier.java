package examenfinal.romans.Composite;

import examenfinal.romans.Soldier;
import examenfinal.romans.Observer.MObservable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import examenfinal.romans.Visitor.*;


/**
 * CompositeSoldier
 */
public class CompositeSoldier extends MObservable implements Soldier {

    protected List<Soldier> listSoldier;

    public CompositeSoldier() {
        listSoldier = new ArrayList<Soldier>();
    }

    public List<Soldier> getListSoldier() {
        return listSoldier;
    }

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
            else {
                iter.remove();
                // notifyObServers();
            }
        }
        return checkDefend;
    }

    @Override
    public boolean isAlive() {
        for (Soldier s : listSoldier)
            if (s.isAlive())
                return true;
        return false;
    }

    @Override
    public void accept(Visitor visit) {
        for (Soldier so : listSoldier) {
            visit.visit(so);
        }
    }

    @Override
    public int getLife() {
        // TODO Auto-generated method stub
        int totalLife = 0;
        for (Soldier s : listSoldier)
            totalLife += s.getLife();
        return totalLife;
    }

}