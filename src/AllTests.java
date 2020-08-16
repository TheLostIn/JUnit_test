import junit.framework.TestSuite;
import junit.textui.TestRunner;
public class AllTests {
	public static void main (String[] args)	{
		TestRunner.run(suite());
	}
	public static TestSuite suite () {
		TestSuite suite= new TestSuite("All JUnit Tests");
		suite.addTestSuite(CalculatorTest.class);
//		suite.addTest(VectorTest.suite());
//		suite.addTest(new Test.class);
		return suite;
	}
}