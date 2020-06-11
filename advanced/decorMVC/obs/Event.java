
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Event {
    public static final String VALUE = "INFINITE";

    private List<Input> Inputs = new ArrayList<Input>();
    private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();

    public class Input extends Event {
        private String i;
        public Input(String value) {
            this.i = value;
        }
    
        public String getValue() {
            return i;
        }
    
        public void setValue(String value) {
            notifyListeners(
                    this,
                    VALUE,
                    this.i,
                    this.i = value);
        }
    }
    

    public List<Input> getInputs() {
        return Inputs;
    }

    public Event() {
        Inputs.add(new Input("AAA"));
        Inputs.add(new Input("BBB"));
    }

    private void notifyListeners(Object object, String property, String oldValue, String newValue) {
        for (PropertyChangeListener name : listener) {
            name.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
        }
    }

    public void addChangeListener(PropertyChangeListener newListener) {
        listener.add(newListener);
    }

}