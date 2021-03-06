package javaoop.ArmyOOP;

import javaoop.ArmyOOP.Composite.CompositeSoldier;
import javaoop.ArmyOOP.Decorator.DecoratorSoldier;
import javaoop.ArmyOOP.Decorator.Spearmen;
import javaoop.ArmyOOP.Decorator.Swordmen;
import javaoop.ArmyOOP.Visitor.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * CountNumberSoldier
 */
public class CountNumberSoldier implements Visitor {
    
    private int numbersInfantrymen;
    private int numbersHorsemen;

    @Override
    public void visit(Infantrymen s) {
        System.out.println("Count Number " + s.toString() + "in Army");
        numbersInfantrymen++;
    }

    @Override
    public void visit(Horsemen s) {
        System.out.println("Count Number " + s.toString() + "in Army");
        numbersHorsemen++;
    }

    @Override
    public void visit(DecoratorSoldier s) {
        System.out.println("Count Number " + s.toString() + "in Army");
        numbersInfantrymen++;
    }

    @Override
    public void visit(Spearmen s) {
        System.out.println("Count Number " + s.toString() + "in Army");
        numbersInfantrymen++;
    }

    @Override
    public void visit(Swordmen s) {
        System.out.println("Count Number " + s.toString() + "in Army");
        numbersInfantrymen++;   
    }


    @Override
    public void visit(CompositeSoldier s) {

        List<Soldier> troops = s.getListSoldiers();

        // int noHorsemen = s.getNumberofHorsemen();
        // int noInfantrymen = s.getNumberofInfantrymen();

        for (Soldier soldier : troops) {
            soldier.accept(this);
        }

        System.out.println("COUNT INFANTRY" + "in Army");
        System.out.println("COUNT CALVARY" + "in Army");
        // noTotalSoldiers
        
    }

}