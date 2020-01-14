package javaoop.ArmyOOP;

/**
 * Soldier
 */
public interface Soldier {
    public void getName();
    // Return the shot strength
    public int hit();
    // Return the defend the hit of certain strength
    public boolean defend(int force);
}