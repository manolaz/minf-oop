package examenfinal.romans.Decorator;

import examenfinal.romans.Equipment.*;
import examenfinal.romans.*;
/**
 * Velites
 */
public class Velites extends DecoratorSoldier{

    public Velites(int life) {
		super(createVelites(life));
	}

    private static Soldier createVelites(int life) {
        Soldier temp1 = new DecoratorSoldier(new Infantrymen(life));
        ((DecoratorSoldier) temp1).addEquipment(new HandAxe());
        Soldier result = new DecoratorSoldier(temp1);
        return result;
    }

    @Override
    public String toString() {
        return "Velites";
    }
}