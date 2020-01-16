package examenfinal.romans.Decorator;

import examenfinal.romans.Equipment.*;
import examenfinal.romans.*;
/**
 * Triarii
 */
public class Triarii extends DecoratorSoldier{

    public Triarii(int life) {
		super(createTriarii(life));
	}

    private static Soldier createTriarii(int life) {
        Soldier temp1 = new DecoratorSoldier(new Infantrymen(life));
        ((DecoratorSoldier) temp1).addEquipment(new LightArmor());
        Soldier temp2 = new DecoratorSoldier(temp1);
        ((DecoratorSoldier) temp2).addEquipment(new HandAxe());
        Soldier result = new DecoratorSoldier(temp2);
        return result;
    }

    @Override
    public String toString() {
        return "Triarii";
    }
}