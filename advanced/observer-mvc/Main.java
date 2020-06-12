import obs.EventObserver;
import obs.Event;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Event e = new Event();
        EventObserver o1 = new EventObserver("Buttoon1");
        EventObserver o2 = new EventObserver("Box2");
        EventObserver o3 = new EventObserver("Header3");
        e.register(o1);
        e.register(o2);
        e.register(o3);

        o1.setSubject(e);
        o2.setSubject(e);
        o3.setSubject(e);

        // Fresh
        o1.update();
        o2.update();
        o3.update();

        //EDIT VALUE 
        e.postMessage("Hello New");
        e.postMessage("Chachacha");
        e.postMessage("The END");
    }
}