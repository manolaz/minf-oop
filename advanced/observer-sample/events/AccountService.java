package observer-button.events;

import java.util.ArrayList;
import java.util.List;


public class AccountService implements IObserver{
    ArrayList<IObserver> observers = new ArrayList<>();
    Account data;
    public void changeStatus(AccountStatus state) {
        data.setStatus(state);
        System.out.println("Updated");
        this.notifyAll();
    }
    @override
    public void add(IObserver ob) {
        if (!observers.contains(ob)) {
            observers.add(ob);
        }
    }
    @override
    public void remove(IObserver ob) {
        observers.remove(ob);
    }
}