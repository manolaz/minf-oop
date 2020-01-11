package javaoop.ArmyOOP.Decorator;

/**
 * DecoratorSoldier
 */
public class DecoratorSoldier {

    public boolean defend(int amor, int damage, int health) {
        return (damage - amor) > health;
    }
}