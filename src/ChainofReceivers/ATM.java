package ChainofReceivers;

public class ATM {

	private static HundredRsHandler hundredHandler = new HundredRsHandler();
	private static FiftyRsHandler fiftyHandler = new FiftyRsHandler();
	private static TwentyRsHandler twentyHandler = new TwentyRsHandler();
	private static FiveRsHandler fiveRsHandler = new FiveRsHandler();
	
	static
	{
		hundredHandler.nextHandler(fiftyHandler);
		fiftyHandler.nextHandler(twentyHandler);
		twentyHandler.nextHandler(fiveRsHandler);
	}
	
	public void withdraw(long requestedamount)
	{
		hundredHandler.dispatchRS(requestedamount);
	}
}
