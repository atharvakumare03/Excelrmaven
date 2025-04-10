package TestNG;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener{
	
    @Override
    public void onTestFailure(ITestResult result) {
    	System.out.println("failed");
    	try {
			login_fail_listener.screenshort();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

   
}
