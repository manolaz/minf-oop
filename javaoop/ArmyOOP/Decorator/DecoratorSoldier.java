package javaoop.ArmyOOP.Decorator;

import javaoop.ArmyOOP.Soldier;
import javaoop.ArmyOOP.Equipment.Equipment;

/**
 * DecoratorSoldier
 */
public class DecoratorSoldier implements Soldier {

    private Equipment equip;
    
    private final int NUMBER_EQUIPEMENT = 5;

    private Soldier soldier;
    public DecoratorSoldier() {
        super();
    }
    public DecoratorSoldier(Soldier sol) {
        this.soldier = sol;
    }

    public boolean defend(int amor, int damage, int health) {
        return (damage - amor) > health;
    }

    public int getNumberEquipment() {
        int noEquip = (soldier instanceof DecoratorSoldier) ? ((DecoratorSoldier) soldier).getNumberEquipment() : 0;
        return this.equip.getDefend();
    }

    public void addEquipment(Equipment eq) {
        int currEquipment = 0;
        // int noEquip = (soldier instanceof DecoratorSoldier) ? ((DecoratorSoldier) soldier).getNumberEquipment() : 0;
        // return this.equip.getDefend();
    }

    @Override
    public boolean defend() {
        // TODO Auto-generated method stub
        return false;
    }
    
    // public void getDefend(Equipment e) {
    //     this.equip.getDefend() += e.getDefend();
    // }

    // public void getAttack(Equipment e) {
    //     this.damage += e.damage;
    // }


    
}