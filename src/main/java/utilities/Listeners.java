package utilities;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;


public class Listeners implements ITestListener  {

	public void onFinish(ITestContext arg0) {
		Initialization.extent.close();
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		//
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		///screenshot
		Initialization.test = Initialization.extent.startTest(result.getName());
		try {
			 
			if(result.getStatus() == ITestResult.FAILURE){
				Initialization.test.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
				Initialization.test.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
				//To capture screenshot path and store the path of the screenshot in the string "screenshotPath"
	                        //We do pass the path captured by this mehtod in to the extent reports using "logger.addScreenCapture" method. 			
	                        String screenshotPath = Initialization.getScreenshot(result.getName());
				//To add it in the extent report 
	                        Initialization.test.log(LogStatus.FAIL, Initialization.test.addScreenCapture(screenshotPath));
			}else
			{
				Initialization.test.log(LogStatus.SKIP, "Test Case Ended Enexpectedly "+result.getName());
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Initialization.extent.flush();
		Initialization.extent.endTest(Initialization.test);
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		Initialization.test = Initialization.extent.startTest(arg0.getName());
		Initialization.test.log(LogStatus.SKIP, "Test Case " + arg0.getName() + " is Skipped " );
		Initialization.extent.flush();
		Initialization.extent.endTest(Initialization.test);
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		Initialization.test = Initialization.extent.startTest(arg0.getName());
		Initialization.test.log(LogStatus.PASS, "Test Case " + arg0.getName() +" is Passed");
		Initialization.extent.flush();
		Initialization.extent.endTest(Initialization.test);
	}

}
