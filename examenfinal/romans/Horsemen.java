package examenfinal.romans;

import examenfinal.romans.Visitor.Visitor;
/*
 * Horsemen
 */
public class Horsemen extends AbstractSoldier{
    private static final int FORCE_HORSEMEN = 2;

    public Horsemen(int life) {
        super(life);
    }

    public int hit() {
        return FORCE_HORSEMEN;
    }

    @Override
    public String toString() {
        return "Horsemen";
    }

    @Override
    public boolean isAlive() {
        // TODO Auto-generated method stub
        return life > 0;
    }

    @Override
    public void accept(Visitor visit) {
        // TODO Auto-generated method stub
        visit.visit(this);
    }
}