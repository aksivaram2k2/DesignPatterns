package ChainofReceivers;

public class FiftyRsHandler extends RsHandler{
	public void dispatchRS(long requestedAmount) 
	{
		long numberofNotesToBeDispatched = requestedAmount/50;
		
		if(numberofNotesToBeDispatched > 0)
		{
			if(numberofNotesToBeDispatched > 1)
			{
				System.out.println(numberofNotesToBeDispatched + " Fifty dispatched");
			}
			else
			{
				System.out.println(numberofNotesToBeDispatched + " One Fifty dispatched");
			}
		}
		
		long pendingAmount = requestedAmount % 50;
		if(pendingAmount > 0)
		{
			rsHandler.dispatchRS(pendingAmount);
		}
	}
}
