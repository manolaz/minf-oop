package javaoop.ArmyOOP.Decorator;

import javaoop.ArmyOOP.Soldier;
import javaoop.ArmyOOP.Equipment.Equipment;

/**
 * DecoratorSoldier
 */
public class DecoratorSoldier implements Soldier {
    
    private final int NUMBER_EQUIPEMENT = 5;
    private Soldier soldier;
    private Equipment equipment;
    public DecoratorSoldier() {
        super();
    }

    public DecoratorSoldier(Soldier soldier) {
        this.soldier = soldier;
    }

    public void addEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Equipment getEquipment() {
        return this.equipment;
    }

    @Override
    public int hit() {
        if (equipment != null)
            return soldier.hit() + equipment.getAttack();
        else
            return soldier.hit();
    }

    @Override
    public boolean defend(int force) {
        if (equipment != null)
            return soldier.defend(force - equipment.getDefend());
        return soldier.defend(force);
    }

    @Override
    public void getName() {
        System.out.println("Decorator Soldier");
    }
    
    @Override
    public boolean isAlive() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean accept() {
        // TODO Auto-generated method stub
        return false;
    }
}