package examenfinal.romans.Composite;

/**
 * Army
 */
public class Army extends CompositeSoldier {
    private String name = "Army";

    public Army() {
        super();
    }

    public Army(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getName();
    }

}