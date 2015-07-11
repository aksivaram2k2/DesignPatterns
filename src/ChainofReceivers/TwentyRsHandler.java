package ChainofReceivers;

public class TwentyRsHandler extends RsHandler{
	public void dispatchRS(long requestedAmount) 
	{
		long numberofNotesToBeDispatched = requestedAmount/20;
		
		if(numberofNotesToBeDispatched > 0)
		{
			if(numberofNotesToBeDispatched > 1)
			{
				System.out.println(numberofNotesToBeDispatched + " Twenty dispatched");
			}
			else
			{
				System.out.println(numberofNotesToBeDispatched + " One Twenty dispatched");
			}
		}
		
		long pendingAmount = requestedAmount%20;
		if(pendingAmount > 0)
		{
			rsHandler.dispatchRS(pendingAmount);
		}
	}
}
