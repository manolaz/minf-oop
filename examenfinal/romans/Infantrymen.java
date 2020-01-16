package examenfinal.romans;

import examenfinal.romans.Visitor.Visitor;

/**
 * Infantrymen
 */
public class Infantrymen extends AbstractSoldier{
    private static final int FORCE_INFANTRYMEN = 1;

    public Infantrymen(int life) {
        super(life);
    }

    public int hit() {
        return FORCE_INFANTRYMEN;
    }

    @Override
    public String toString() {
        return "Infantrymen";
    }

    @Override
    public boolean isAlive() {
        // TODO Auto-generated method stub
        return life > 0;
    }

    @Override
    public void accept(Visitor visit) {
        visit.visit(this);
    }
}