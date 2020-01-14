package javaoop.ArmyOOP;

import javaoop.ArmyOOP.Composite.CompositeSoldier;
import javaoop.ArmyOOP.Decorator.DecoratorSoldier;
import javaoop.ArmyOOP.Decorator.Spearmen;
import javaoop.ArmyOOP.Decorator.Swordmen;
import javaoop.ArmyOOP.Visitor.*;

/**
 * CheckAliveVisitor
 */
public class CheckAliveVisitor implements Visitor{
    @Override
    public void visit(Infantrymen s) {
        // TODO Auto-generated method stub
        System.out.println("Check is ALIVE " + s.toString() + "is Alive");
    }

    @Override
    public void visit(Swordmen s) {
        // TODO Auto-generated method stub
        System.out.println("Check is ALIVE " + s.toString() + "is Alive");
    }
    
    @Override
    public void visit(Spearmen s) {
        System.out.println("Check is ALIVE " + s.toString() + "is Alive");
    }

    @Override
    public void visit(Horsemen s) {
        System.out.println("Check is ALIVE " + s.toString() + "is Alive");
    }

    @Override
    public void visit(CompositeSoldier s) {
        System.out.println("Check is ALIVE " + s.toString() + "is Alive");
    }

    @Override
    public void visit(DecoratorSoldier s) {
        System.out.println("Check is ALIVE " + s.toString() + "is Alive");
    }
}