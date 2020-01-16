package examenfinal.romans.Decorator;

import examenfinal.romans.Equipment.*;
// import javaoop.ArmyOOP.Equipment.LightShield;
// import javaoop.ArmyOOP.Horsemen;
import examenfinal.romans.*;
/**
 * Sagittarii
 */
public class Sagittarii extends DecoratorSoldier{

    public Sagittarii(int life) {
		super(createSagittarii(life));
	}

    private static Soldier createSagittarii(int life) {
        Soldier temp1 = new DecoratorSoldier(new Horsemen(life));
        ((DecoratorSoldier) temp1).addEquipment(new LightShield());
        Soldier temp2 = new DecoratorSoldier(temp1);
        ((DecoratorSoldier) temp1).addEquipment(new MediumArmor());
        Soldier result = new DecoratorSoldier(temp2);
        ((DecoratorSoldier) result).addEquipment(new Bow());
        return result;
    }

    @Override
    public String toString() {
        return "Sagittarii";
    }
    
}