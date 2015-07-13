package TestSuiteCoR;
public class Demo {

	public static void main(String[] args)
	{
		TestSuite testSuite = new TestSuite();
		TestCase testCase = new TestCase();
		TestCases testCases = new TestCases();
		TestSteps testSteps = new TestSteps();
		TestScenario testScenario = new TestScenario();
		TestScenarios testScenarios = new TestScenarios();
		testCase.executeStep = testSteps.executeStep;
		testCases.executeStep = testCase.executeStep;
		testScenario.executeStep = testCases.executeStep;
		testScenarios.executeStep = testScenario.executeStep;
		testSuite.executeStep = testScenarios.executeStep;
		
	}
}
