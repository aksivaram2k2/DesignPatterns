package ChainofResponsibility;

public class ProjectLeader extends Employee
{
	private int MAX_LEAVES_CAN_APPROVE = 20;
	public void applyLeave(String employeeName, int numberofDaysLeave)
	{
		if(numberofDaysLeave <= MAX_LEAVES_CAN_APPROVE)
		{
			ApproveLeave(employeeName, numberofDaysLeave);
		}
		else
		{
			supervisor.applyLeave(employeeName, numberofDaysLeave);
		}
	}
	
	public void ApproveLeave(String employeeName, int numberofDaysLeave)
	{
		System.out.println("ProjectLeader Leave " + numberofDaysLeave);
	}
}