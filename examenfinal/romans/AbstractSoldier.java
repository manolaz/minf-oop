package examenfinal.romans;

import examenfinal.romans.Observer.MObservable;

abstract class AbstractSoldier  extends MObservable implements Soldier{

    protected int life;

    AbstractSoldier(int life) {
        this.life = life;
    }

    public boolean defend(int force) {
        if (force < 0)
            return true;
        life = (life > force) ? life - force : 0;
        if (life <= 0)
            this.notifyObServers();

        return life > 0;
    }

    @Override
    public int getLife() {
        return life;
    }
}