package login;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.GenericUtility.ListenersUtility.class)

public class ToLearn_Listeners {
	
	@Test
	public void test() {
		
		Reporter.log("Testcase Executed-Line 1",true);
		Reporter.log("Testcase Executed-Line 2",true);
		Reporter.log("Testcase Executed-Line 3",true);
		Assert.assertEquals("abb", "acc");
		Reporter.log("Testcase Executed-Line 1",true);
		Reporter.log("Testcase Executed-Line 1",true);
	}

}
