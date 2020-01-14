package javaoop.ArmyOOP.Composite;

import javaoop.ArmyOOP.Soldier;
/**
 * Army
 */
public class Army extends CompositeSoldier{
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

    public int getNumberofWoundeds() {
        return 5;
    }


    public int getNumberofInfantrymen() {
        return 100;
    }

    public int getNumberofHorsemen() {
        return 50;
    }
}