package team;

public class Manager extends EmployeeDecorator {

    public Manager(Employee e, String n) {
		super(e,n);
    }

    @Override
	public void doTask() {
        createRequirement() ;
        assignTask();
        manageProgress();
    }
    
    public void createRequirement() {
        System.out.println( this.name + " is making requirements.");
      }

    public void assignTask() {
        System.out.println( this.name + " is assigning tasks.");
    }

    public void manageProgress() {
        System.out.println( this.name + " is making requirements.");
    }


   
}