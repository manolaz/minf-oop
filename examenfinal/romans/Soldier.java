package examenfinal.romans;

import examenfinal.romans.Visitor.*;

/**
 * Soldier
 */
public interface Soldier {
    // Return the shot strength
    public int hit();

    // Return the defend the hit of certain strength
    public boolean defend(int force);

    public int getLife();

    // Normal Solution: Check whether the soldier is alive
    public boolean isAlive();

    // Visitor pattern
    public void accept(Visitor visit);
}