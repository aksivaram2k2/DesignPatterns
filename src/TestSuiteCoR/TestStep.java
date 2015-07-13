package TestSuiteCoR;

public abstract class TestStep {

	protected TestStep executeStep;
	public void SetNextStep(TestStep executeStep)
	{
		this.executeStep = executeStep;
	}
}
