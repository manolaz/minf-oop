package javaoop.ArmyOOP.Observer;

import java.util.List;
import java.util.Observable;

import javaoop.ArmyOOP.Soldier;
/**
 * MObservable
 */
public class MObservable extends Observable implements MObserver {
    
    private List<Soldier> troops;

    @Override
    public void update(MObservable obj, Object arg) {
        // TODO Auto-generated method stub

    }
    
    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        super.notifyObservers();
    }
}