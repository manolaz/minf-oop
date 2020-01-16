package examenfinal.romans;

import examenfinal.romans.Composite.*;
import examenfinal.romans.Decorator.*;
import examenfinal.romans.Equipment.*;
import examenfinal.romans.Observer.*;
import examenfinal.romans.Visitor.*;

public class Main {
    public static void startBattle(Soldier s1, Soldier s2) {
        int numerOfShots = 1;
        boolean isFirstAlive = true;
        boolean isSecondAlive = true;

        for (; (isSecondAlive = s1.defend(s2.hit())) && (isFirstAlive = s2.defend(s1.hit())); numerOfShots++) {
            System.out.println("[Battle] After the shot " + numerOfShots + ": ");
            System.out.println(s1.toString() + " life: " + s1.getLife());
            System.out.println(s2.toString() + " life: " + s2.getLife());
        }

        System.out.println(
                "Death of the " + (isSecondAlive ? s2.toString() : s1.toString()) + " in " + numerOfShots + " shots");

    }

    public static void main(String[] args) {
        int lifeInfantrymen = 75;
        int lifeHorsemen = 100;
        Soldier s1 = new Horsemen(lifeHorsemen);
        s1.defend(10);
        s1.hit();
        Visitor checkAlive = new CheckAliveVisitor();
        Soldier s2 = new Infantrymen(lifeInfantrymen);
        System.out.println("Ex1: Implement the Soldier ");
        startBattle(s1, s2);
        System.out.println("[Normal] " + s1.toString() + " is alive: " + s1.isAlive());
        s1.accept(checkAlive);
        System.out.println("[Normal] " + s2.toString() + " is alive: " + s2.isAlive());
        s2.accept(checkAlive);

        System.out.println("Ex2: Model the battle between Spearmen vs Swordmen ");
        s1 = new Spearmen(lifeInfantrymen);
        s2 = new Swordmen(lifeInfantrymen);
        startBattle(s1, s2);
        System.out.println("[Normal] " + s1.toString() + " is alive: " + s1.isAlive());
        s1.accept(checkAlive);
        System.out.println("[Normal] " + s2.toString() + " is alive: " + s2.isAlive());
        s2.accept(checkAlive);

        s2 = new Swordmen(lifeInfantrymen);
        Soldier temp1 = new DecoratorSoldier(new Infantrymen(lifeInfantrymen));
        ((DecoratorSoldier) temp1).addEquipment(new MediumShield());
        Soldier temp2 = new DecoratorSoldier(temp1);
        ((DecoratorSoldier) temp1).addEquipment(new LightArmor());
        Soldier spearmen = new DecoratorSoldier(temp2);
        ((DecoratorSoldier) spearmen).addEquipment(new Pike());
        Soldier spearmenWithAxe = new DecoratorSoldier(spearmen);
        ((DecoratorSoldier) spearmenWithAxe).addEquipment(new Axe());
        startBattle(spearmenWithAxe, s2);

        System.out.println(
                "Ex2: Model the battle between 2 Armies, Army 1 (2 Spearmens and 10 Swordmen) vs Army 2 (4 Spearmen and 8 Swordmen)");
        Army army1 = new Army("Army1");
        Army army2 = new Army("Army2");

        for (int i = 0; i < 2; i++)
            army1.addSoldier(new Spearmen(lifeInfantrymen));
        for (int i = 0; i < 10; i++)
            army1.addSoldier(new Swordmen(lifeInfantrymen));
        army1.addSoldier(new Infantrymen(lifeInfantrymen));
        army1.addSoldier(new Horsemen(lifeHorsemen));

        for (int i = 0; i < 4; i++)
            army2.addSoldier(new Spearmen(lifeInfantrymen));
        for (int i = 0; i < 8; i++)
            army2.addSoldier(new Swordmen(lifeInfantrymen));
        army1.accept(new DisplayVisitor());
        army1.accept(new CountNumberVisitor());
        army1.addObServer(new CountDeadObserver());
        army2.addObServer(new CountDeadObserver());

        startBattle(army1, army2);
        System.out.println("[Normal] " + army1.toString() + " is alive: " + army1.isAlive());
        army1.accept(checkAlive);
        System.out.println("[Normal] " + army2.toString() + " is alive: " + army2.isAlive());
        army2.accept(checkAlive);
        army1.accept(new DisplayVisitor());
        army1.accept(new CountNumberVisitor());
    }
}