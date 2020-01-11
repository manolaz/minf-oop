package javaoop.ArmyOOP;

/**
 * Main
 */
public class Main {

    public static void startBattle(Soldier aaa, Soldier bbb) {

        while (aaa > 0 || bbb  > 0) {
            aaa.fight();
            bbb.fight();
        }
    }

public static void main(String[] args) {
        System.out.println("init ARMIES");
        Army nato = new Army("NATO");
        Army taliban = new Army("Taliban");

        System.out.println("Start BATTLE");

        for (int i = 0; i < 20; i++){
            nato
        }
    }
}
