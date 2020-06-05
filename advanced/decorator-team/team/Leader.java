package team;

public class Leader extends EmployeeDecorator {

    public Leader(Employee e, String n) {
		super(e,n);
    }
    
    @Override
	public void doTask() {
        super.doTask();
        planning();
        motivate() ;
        monitor();
    }

    private void motivate() {
        System.out.println(this.name + "is motivating his members.");
      }

    private void planning() {
    System.out.println(this.name + "is planning.");
    }

    private void monitor() {
    System.out.println(this.name + "is monitoring his members.");
    }

}