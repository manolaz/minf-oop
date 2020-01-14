package javaoop.ArmyOOP.Decorator;

import javaoop.ArmyOOP.Equipment.*;
import javaoop.ArmyOOP.*;

/**
 * Swordmen
 */
public class Swordmen extends DecoratorSoldier {

    public Swordmen(int life) {
        super(createSwordmen(life));
    }

    private static Soldier createSwordmen(int life) {
        Soldier temp1 = new DecoratorSoldier(new Infantrymen(life));
        ((DecoratorSoldier) temp1).addEquipment(new MediumShield());
        Soldier temp2 = new DecoratorSoldier(temp1);
        ((DecoratorSoldier) temp1).addEquipment(new MediumArmor());
        Soldier result = new DecoratorSoldier(temp2);
        ((DecoratorSoldier) result).addEquipment(new Sword());
        return result;
    }

    @Override
    public String toString() {
        return "Swordmen";
    }
}