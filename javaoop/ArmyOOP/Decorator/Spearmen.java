package javaoop.ArmyOOP.Decorator;

import javaoop.ArmyOOP.Equipment.*;
import javaoop.ArmyOOP.*;
/**
 * Spearmen
 */
public class Spearmen extends DecoratorSoldier{


	public Spearmen(Soldier soldier) {
        super(soldier);
    }

    public Spearmen(int life) {
        super(createSpearmen(life));
    }

    private static Soldier createSpearmen(int life) {
        Soldier temp1 = new DecoratorSoldier(new Infantrymen(life));
        ((DecoratorSoldier) temp1).addEquipment(new MediumShield());
        Soldier temp2 = new DecoratorSoldier(temp1);
        ((DecoratorSoldier) temp1).addEquipment(new LightArmor());
        Soldier result = new DecoratorSoldier(temp2);
        ((DecoratorSoldier) result).addEquipment(new Pike());
        return result;
    }

    @Override
    public String toString() {
        return "Spearmen";
    }

    public void getName() {
        System.out.println("Spearmen Soldier");
    };
    
}