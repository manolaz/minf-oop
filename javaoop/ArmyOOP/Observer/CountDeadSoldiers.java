package javaoop.ArmyOOP.Observer;

/**
 * CountDeadSoldiers
 */
public class CountDeadSoldiers implements MObserver {
    
    private int totalDead = 0;
    @Override
    public void update(MObservable obj, Object arg) {
        totalDead++;
        System.out.println("Count DEAD soldiers" + obj + " in total  = " + totalDead);
    }
}