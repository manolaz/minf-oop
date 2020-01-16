package examenfinal.romans.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Mobservable
 */
public class MObservable implements MObserver {

    private List<MObserver> listObservers;

    public MObservable() {
		listObservers = new ArrayList<MObserver>();
	}

    public void notifyObServers() {
        listObservers.forEach(obServer -> obServer.update(this, null));
    }

    @Override
    public void update(MObservable obj, Object arg) {
        // TODO Auto-generated method stub
        
    }

    public void addObServer(MObserver obServer) {
        listObservers.add(obServer);
    }

    public void setChanged() {

    }

}