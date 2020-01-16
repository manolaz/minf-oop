package examenfinal.romans.Decorator;

// import examenfinal.romans.Horsemen;
import examenfinal.romans.*;
import examenfinal.romans.Equipment.*;
/**
 * Lancearii
 */
public class Lancearii extends DecoratorSoldier{

    public Lancearii(int life) {
		super(createLancearii(life));
	}

    private static Soldier createScutum(int life) {
        Soldier temp1 = new DecoratorSoldier(new Horsemen(life));
        ((DecoratorSoldier) temp1).addEquipment(new LightShield());
        Soldier temp2 = new DecoratorSoldier(temp1);
        ((DecoratorSoldier) temp1).addEquipment(new LightArmor());
        Soldier result = new DecoratorSoldier(temp2);
        ((DecoratorSoldier) result).addEquipment(new Sword());
        return result;
    }

    @Override
    public String toString() {
        return "Lancearii";
    }
}