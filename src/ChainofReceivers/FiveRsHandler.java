package ChainofReceivers;

public class FiveRsHandler extends RsHandler{
	public void dispatchRS(long requestedAmount) 
	{
		long numberofNotesToBeDispatched = requestedAmount/5;
		
		if(numberofNotesToBeDispatched > 0)
		{
			if(numberofNotesToBeDispatched > 1)
			{
				System.out.println(numberofNotesToBeDispatched + " Five Rupees dispatched");
			}
			else
			{
				System.out.println(numberofNotesToBeDispatched + " One 5 Rupee dispatched");
			}
		}
		
	}
}
