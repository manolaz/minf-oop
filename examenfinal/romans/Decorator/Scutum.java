package examenfinal.romans.Decorator;

import examenfinal.romans.Equipment.*;
import examenfinal.romans.*;
/*
 * Scutum
 */
public class Scutum extends DecoratorSoldier{

    public Scutum(int life) {
		super(createScutum(life));
	}

    private static Soldier createScutum(int life) {
        Soldier temp1 = new DecoratorSoldier(new Infantrymen(life));
        ((DecoratorSoldier) temp1).addEquipment(new ThickShield());
        Soldier temp2 = new DecoratorSoldier(temp1);
        ((DecoratorSoldier) temp1).addEquipment(new MediumArmor());
        Soldier result = new DecoratorSoldier(temp2);
        ((DecoratorSoldier) result).addEquipment(new Sword());
        return result;
    }

    @Override
    public String toString() {
        return "Scutum";
    }
}