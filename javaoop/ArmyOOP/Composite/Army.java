package javaoop.ArmyOOP.Composite;

import javaoop.ArmyOOP.Soldier;
import javaoop.ArmyOOP.Observer.*;
/**
 * Army
 */
public class Army extends CompositeSoldier implements MObserver{
    String name;
    Army(String new_name) {
        this.name = new_name;
    }

    public void addSoldier(Soldier sol) {
        // this.sol = a;
    }
    
    @Override
    public void getName() {
        // TODO Auto-generated method stub
        System.out.println("Composite Soldier");
    }
}