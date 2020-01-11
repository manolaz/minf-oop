package javaoop.ArmyOOP;

/**
 * AbstractSoldier
 */
public class AbstractSoldier implements Soldier{

    public boolean defend( int damage, int health) {
        return damage > health;
    }
}