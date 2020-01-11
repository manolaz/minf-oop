package javaoop.ArmyOOP.Composite;

/**
 * CompositeSoldier
 */
public class CompositeSoldier {

    public boolean defend(int amor, int damage, int health) {
        return (damage - amor) > health;
    }
}