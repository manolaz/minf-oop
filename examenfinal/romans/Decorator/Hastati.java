package examenfinal.romans.Decorator;

import examenfinal.romans.Equipment.*;
import examenfinal.romans.*;
/**
 * Hastati
 */
public class Hastati extends DecoratorSoldier{

    public Hastati(int life) {
		super(createHastati(life));
	}

    private static Soldier createHastati(int life) {
        Soldier temp1 = new DecoratorSoldier(new Infantrymen(life));
        ((DecoratorSoldier) temp1).addEquipment(new MediumShield());
        Soldier temp2 = new DecoratorSoldier(temp1);
        ((DecoratorSoldier) temp2).addEquipment(new MediumArmor());
        Soldier result = new DecoratorSoldier(temp2);
        ((DecoratorSoldier) result).addEquipment(new Sword());
        return result;
    }

    @Override
    public String toString() {
        return "Hastati";
    }
}