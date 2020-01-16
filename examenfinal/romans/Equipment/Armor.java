package examenfinal.romans.Equipment;

/**
 * Armor
 */
public abstract class Armor implements Equipment {

    public int defend_strength;

    @Override
    public int getAttackStrength() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void reduceStrength(int no_blows) {
        // Reduce  1 point per  Number of each 7 BLOWS
        while (no_blows > 7) {
            this.defend_strength--;
            // Reduce per Number of BLOWS
            no_blows -= 7;
        }
    }
}