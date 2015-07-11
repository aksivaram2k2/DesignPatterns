package ChainofResponsibility;

public abstract class Employee {

	// next element in chain of responsbility
	protected Employee supervisor;

	public void setNextSupervisor(Employee Supervisor) {
		this.supervisor = Supervisor;
	}

	public abstract void applyLeave(String employeeName, int numberofDaysLeave);
}
