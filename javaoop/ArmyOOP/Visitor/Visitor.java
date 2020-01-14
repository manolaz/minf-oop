package javaoop.ArmyOOP.Visitor;

import javaoop.ArmyOOP.*;
import javaoop.ArmyOOP.Composite.*;
import javaoop.ArmyOOP.Decorator.*;
/**
 * Visitor
 */
public interface Visitor {
    public void visit(Horsemen s);
    
    public void visit(Infantrymen s);
    
    public void visit(Spearmen s);

    public void visit(Swordmen s);
    
    public void visit(CompositeSoldier s);
    
    public void visit(DecoratorSoldier s);
    // public void accept();
}