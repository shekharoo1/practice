package practice.generics;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImpl implements ITestListener{
	
	 public void onTestStart(ITestResult result) 
	 {
		 System.out.println("Test started");
	 }
	
	  public void onTestSuccess(ITestResult result) {
	    // not implemented
	  }

	  public void onTestFailure(ITestResult result) 
	  {
	    System.out.println("Test got failed");
	   // EventFiringWebDriver ew = new EventFiringWebDriver(DemoListener.driver);
	   // File src = ew.getScreenshotAs(OutputType.FILE);
	    
	  }

	  
	  public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	  public void onStart(ITestContext context) {
	    // not implemented
	  }
	  
	  public void onFinish(ITestContext context) {
	    // not implemented
	  }
	}

