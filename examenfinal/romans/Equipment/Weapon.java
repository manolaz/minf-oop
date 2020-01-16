
package examenfinal.romans.Equipment;

/**
 * Weapon
 */
public abstract class Weapon implements Equipment {

    public int attack_strength;

    @Override
    public int getDefendStrength() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void reduceStrength(int no_blows) {
        // Reduce 1 point per Number of each 7 BLOWS
        while (no_blows > 7) {
            this.attack_strength--;
            //Reduce per Number of BLOWS
            no_blows -= 7;
        }
    }
}