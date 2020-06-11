import obs.Event.Input;
import obs.EventObserver;
import obs.Event;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Event e = new Event();
        EventObserver obs = new EventObserver(e);
        
        for (Input i : e.getInputs()) {
            i.setValue(i.getValue() + "1");
        }
        // we change the name of the person, observer will get notified
        for (Input i : e.getInputs()) {
            i.setValue(i.getValue() + "1");
        }   
    }
}