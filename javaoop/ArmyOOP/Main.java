package javaoop.ArmyOOP;

import javaoop.ArmyOOP.Composite.*;
import javaoop.ArmyOOP.Decorator.*;
import javaoop.ArmyOOP.*;
import javaoop.ArmyOOP.Visitor.*;

/**
 * Main
 */

public class Main {
    public static void startBattle(Soldier f, Soldier c) {
        int numberOfShots = 0;
        boolean isFirstAlive = true;
        boolean isSecondAlive = true;

        for (; (isSecondAlive = f.defend(c.hit())) && (isFirstAlive = c.defend(f.hit())); numberOfShots++)
            ;

        System.out.println(
                "Death of the " + (isSecondAlive ? c.toString() : f.toString()) + " in " + numberOfShots + " shots");

    }

    public static void main(String[] args) {
        int lifeInfantrymen = 75;
        int lifeHorsemen = 100;
        Soldier s1 = new Horsemen(lifeHorsemen);
        s1.defend(10);
        s1.hit();
        Soldier s2 = new Infantrymen(lifeInfantrymen);
        System.out.println("[*] Exercise 1: Implement the Soldier ");
        startBattle(s1, s2);

        System.out.println("[*] Exercise 2: Model the battle between Spearmen vs Swordmen ");
        s1 = new Spearmen(lifeInfantrymen);
        s2 = new Swordmen(lifeInfantrymen);
        startBattle(s1, s2);

        Soldier temp1 = new DecoratorSoldier(new Infantrymen(lifeInfantrymen));
        ((DecoratorSoldier) temp1).addEquipment(new MediumShield());
        Soldier temp2 = new DecoratorSoldier(temp1);
        ((DecoratorSoldier) temp1).addEquipment(new LightArmor());
        Soldier spearmen = new DecoratorSoldier(temp2);
        ((DecoratorSoldier) spearmen).addEquipment(new Pike());
        Soldier spearmenWithAxe = new DecoratorSoldier(spearmen);
        ((DecoratorSoldier) spearmenWithAxe).addEquipment(new Axe());
        startBattle(spearmen, s2);

        System.out.println(
                "[*] Exercise 3: Model the battle between 2 Armies, Army 1 (2 Spearmens and 10 Swordmen) vs Army 2 (4 Spearmen and 8 Swordmen)");
        Army army1 = new Army("Army1");
        Army army2 = new Army("Army2");

        for (int i = 0; i < 2; i++)
            army1.addSoldier(new Spearmen(lifeInfantrymen));
        for (int i = 0; i < 10; i++)
            army1.addSoldier(new Swordmen(lifeInfantrymen));

        for (int i = 0; i < 4; i++)
            army2.addSoldier(new Spearmen(lifeInfantrymen));
        for (int i = 0; i < 8; i++)
            army2.addSoldier(new Swordmen(lifeInfantrymen));
        startBattle(army1, army2);
    }
}