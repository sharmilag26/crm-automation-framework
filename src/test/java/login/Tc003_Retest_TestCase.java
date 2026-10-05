package login;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.GenericUtility.RetryAnalyzer;
import com.buisnessUtility.BaseClass;

public class Tc003_Retest_TestCase extends BaseClass {
	
	@Test (retryAnalyzer = RetryAnalyzer.class)
	
	public void tc003_Retest_TestCase() {
		
		Reporter.log("Testcase executing...",true);
		
		Assert.assertEquals("abc", "acc");
		
		Reporter.log("Testcase executed...",true);

	}

}
