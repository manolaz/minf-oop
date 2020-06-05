package team;

public class Member extends EmployeeDecorator  {
    public Member(Employee e, String n) {
		super(e,n);
    }

    @Override
	public void doTask() {
        System.out.println(" doing tasks");
        super.join() ;
        super.terminate();
    }
}