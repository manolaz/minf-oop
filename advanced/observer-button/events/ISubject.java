package observer-button.events;

public interface ISubject {
    void add(IObserver ob);
    void remove();
    void notifyAll();    
}