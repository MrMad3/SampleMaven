package totest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void mytest() {
		Reporter.log("My First TestCase",true);
	}
}
