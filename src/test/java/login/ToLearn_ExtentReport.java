package login;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearn_ExtentReport {

	@Test
	public void test() {
		
		//create object for ExtentsparkReporter class
		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/report.html");
		
		//create object for ExtentReports class
		ExtentReports reports = new ExtentReports();
		
		//call attachReporter() and pass spark reference
		reports.attachReporter(spark);
		
		//call createTest() and store it
		ExtentTest test = reports.createTest("sample test Report");
		
		//printing statement
		Reporter.log("Testcase Executed",true);
		Assert.assertEquals("abc", "abc");
		
		//call log and pass Arguements
		test.log(Status.PASS, "Test case pass");
		
		reports.flush();
		
	}
}
