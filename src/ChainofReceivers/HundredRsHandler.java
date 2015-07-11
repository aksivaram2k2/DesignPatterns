package ChainofReceivers;

public class HundredRsHandler extends RsHandler{
	public void dispatchRS(long requestedAmount) 
	{
		long numberofNotesToBeDispatched = requestedAmount/100;
		
		if(numberofNotesToBeDispatched > 0)
		{
			if(numberofNotesToBeDispatched > 1)
			{
				System.out.println(numberofNotesToBeDispatched + " Hundreds dispatched");
			}
			else
			{
				System.out.println(numberofNotesToBeDispatched + " One Hundred dispatched");
			}
		}
		
		long pendingAmount = requestedAmount % 100;
		if(pendingAmount > 0)
		{
			rsHandler.dispatchRS(pendingAmount);
		}
	}
}
