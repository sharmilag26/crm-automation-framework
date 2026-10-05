package com.GenericUtility;

import java.time.LocalDateTime;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ListenersUtility implements ITestListener,ISuiteListener{

	ExtentTest test;
	ExtentReports reports;
	
	String time= LocalDateTime.now().toString().replace(":", "-");

	
	@Override
	public void onStart(ISuite suite) {
		
		Reporter.log("onStart Executed- Started",true);
		
		//create object for ExtentsparkReporter class
		ExtentSparkReporter spark = new ExtentSparkReporter("./reports/report_"+suite.getName()+"_"+time+".html");
				
		//create object for ExtentReports class
		ExtentReports reports = new ExtentReports();
				
	   //call attachReporter() and pass spark reference
	   reports.attachReporter(spark);
	   
	 //call createTest() and store it
	//  test = reports.createTest("sample test Report");
	  test = reports.createTest(suite.getName()+"_"+time);

		
	}

	@Override
	public void onFinish(ISuite suite) {
		Reporter.log("onFinish Executed- Ended",true);
		
		reports.flush();
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("onTestSucess Executed- Passed",true);
		
		test.log(Status.PASS, "Test case pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("onTestFailure Executed- Failed",true);
		
		test.log(Status.FAIL, "Test case Failed");
		
	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("onTestSkipped Executed- Skipped",true);
		test.log(Status.SKIP, "Test case Skipped");
	}
	

}
