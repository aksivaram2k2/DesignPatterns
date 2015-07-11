package ChainofResponsibility;

public class HR extends Employee
{
	private int MAX_LEAVES_CAN_APPROVE = 30;
	public void applyLeave(String employeeName, int numberofDaysLeave)
	{
		if(numberofDaysLeave <= MAX_LEAVES_CAN_APPROVE)
		{
			ApproveLeave(employeeName, numberofDaysLeave);
		}
		else
		{
			System.out.println("Leave Suspended");
		}
	}
	
	public void ApproveLeave(String employeeName, int numberofDaysLeave)
	{
		System.out.println("HR Approved Leave " + numberofDaysLeave);
	}
}
