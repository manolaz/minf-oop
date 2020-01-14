package javaoop.ArmyOOP;

/**
 * Soldier
 */
public interface Soldier {
    boolean isAlive();
    
    public void getName();
    // Return the shot strength
    public int hit();
    // Return the defend the hit of certain strength
    public boolean defend(int force);

    public boolean accept();
}