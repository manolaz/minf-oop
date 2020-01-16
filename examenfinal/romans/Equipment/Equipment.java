package examenfinal.romans.Equipment;

/**
 * Equipment
 */
public interface Equipment {
    public int getDefendStrength();
    
    public int getAttackStrength();

    // Reduce Strength after some Numbers of BLOWS
    public void reduceStrength(int no_blows);
}