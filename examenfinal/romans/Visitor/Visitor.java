package examenfinal.romans.Visitor;

import examenfinal.romans.Horsemen;
import examenfinal.romans.Infantrymen;
import examenfinal.romans.Composite.*;
import examenfinal.romans.Decorator.*;
/**
 * Visitor
 */
public interface Visitor {

    public void visit(DecoratorSoldier s);

    public void visit(CompositeSoldier s);
    
    public void visit(Infantrymen s);

    public void visit(Horsemen s);
}