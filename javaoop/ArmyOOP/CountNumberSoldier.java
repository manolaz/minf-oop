package javaoop.ArmyOOP;

import javaoop.ArmyOOP.Composite.CompositeSoldier;
import javaoop.ArmyOOP.Decorator.DecoratorSoldier;
import javaoop.ArmyOOP.Decorator.Spearmen;
import javaoop.ArmyOOP.Decorator.Swordmen;
import javaoop.ArmyOOP.Visitor.*;
/**
 * CountNumberSoldier
 */
public class CountNumberSoldier implements Visitor{

    @Override
    public void visit(Infantrymen s) {
        System.out.println("Count Number " + s.toString() + "in Army");
    }

    @Override
    public void visit(Horsemen s) {
        System.out.println("Count Number " + s.toString() + "in Army");
    }

    @Override
    public void visit(CompositeSoldier s) {
        System.out.println("Count Number " + s.toString() + "in Army");
    }

    @Override
    public void visit(DecoratorSoldier s) {
        System.out.println("Count Number " + s.toString() + "in Army");
    }

    @Override
    public void visit(Spearmen s) {
        System.out.println("Count Number " + s.toString() + "in Army");
    }

    @Override
    public void visit(Swordmen s) {
        System.out.println("Count Number " + s.toString() + "in Army");
    }
}