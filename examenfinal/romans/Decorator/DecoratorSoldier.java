package examenfinal.romans.Decorator;

import examenfinal.romans.Soldier;
import examenfinal.romans.Equipment.*;
import examenfinal.romans.Visitor.Visitor;


/**
 * DecoratorSoldier
 */
public class DecoratorSoldier implements Soldier{

    private Soldier soldier;
    private Equipment equipment;

    public DecoratorSoldier() {
        super();
    }

    public DecoratorSoldier(Soldier soldier) {
        this.soldier = soldier;
    }

    public void addEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Equipment getEquipment() {
        return this.equipment;
    }

    @Override
    public boolean isAlive() {
        // TODO Auto-generated method stub
        return soldier.isAlive();
    }

    @Override
    public int hit() {
        if (equipment != null)
            return soldier.hit() + equipment.getAttackStrength();
        else
            return soldier.hit();
    }

    @Override
    public int getLife() {
        // TODO Auto-generated method stub
        return soldier.getLife();
    }

    @Override
    public boolean defend(int force) {
        if (equipment != null)
            return soldier.defend(force - equipment.getDefendStrength());
        return soldier.defend(force);
    }

    @Override
    public void accept(Visitor visit) {
        // TODO Auto-generated method stub
        visit.visit(this);
    }
    
}