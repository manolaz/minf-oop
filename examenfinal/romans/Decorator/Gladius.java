package examenfinal.romans.Decorator;

import examenfinal.romans.Equipment.*;
// import javaoop.ArmyOOP.Equipment.Rifle;
import examenfinal.romans.*;
/**
 * Gladius
 */
public class Gladius extends DecoratorSoldier{

    public Gladius(int life) {
		super(createGladius(life));
	}

    private static Soldier createGladius(int life) {
        Soldier temp1 = new DecoratorSoldier(new Infantrymen(life));
        ((DecoratorSoldier) temp1).addEquipment(new Rifle());
        Soldier result = new DecoratorSoldier(temp1);
        return result;
    }

    @Override
    public String toString() {
        return "Gladius";
    }
}