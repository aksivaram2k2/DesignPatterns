package ChainofReceivers;
//http://ramj2ee.blogspot.in/
public abstract class RsHandler 
{
	RsHandler rsHandler;
	public void nextHandler(RsHandler rsHandler)
	{
		this.rsHandler = rsHandler;
	}

	public abstract void dispatchRS(long requestedAmount);

}
