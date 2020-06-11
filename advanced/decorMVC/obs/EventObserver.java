import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class EventObserver implements PropertyChangeListener {
    public EventObserver(Event eve) {
        eve.addChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        System.out.println("Changed property: " + event.getPropertyName() + " [old -> "
            + event.getOldValue() + "] | [new -> " + event.getNewValue() +"]");
    }
}