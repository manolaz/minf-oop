package javaoop.ArmyOOP;

/**
 * AbstractSoldier
 */
public class AbstractSoldier implements Soldier {
    
    private int life;
    private int strenght = 0;

    AbstractSoldier(int life) {
        this.life = life;
    }

    public boolean defend(int force) {
        if (force <= 0)
            return true;
        life = (life > force) ? life - force : 0;
        return life > 0;
    }

    @Override
    public boolean isAlive() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int hit() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void getName() {
        System.out.println("Abstract Soldier.");
    }
}