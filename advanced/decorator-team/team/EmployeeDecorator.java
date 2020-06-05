package team;

public class EmployeeDecorator implements Employee{
    protected final Employee delegate;
    
    protected final String name;
    
    public EmployeeDecorator(Employee e, String n) {
        this.delegate = e;
        this.name = n;
    }

	@Override
	public void doTask() {
        System.out.println(" doing tasks");
	}

	@Override
	public void join() {
		System.out.println(" joined on 04/11/2020");
	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub
		System.out.println(" terminated on 04/05/2025");
	}
    
}