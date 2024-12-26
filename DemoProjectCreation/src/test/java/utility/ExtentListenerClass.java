package utility;

import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.ListenerComparator;
import org.testng.reporters.TestHTMLReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentListenerClass implements ITestListener {

	
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	String path;
	public void configureReport() {
		;
		 path = System.getProperty("user.dir")+ "\\test-output\\ExtentListenerReportDemo.html";
		htmlReporter= new ExtentSparkReporter(path);
		reports= new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//add system information/environments info to reports
		reports.setSystemInfo("Machine", "AishuPc");
		reports.setSystemInfo("OS","Windows11");
		
		
		htmlReporter.config().setDocumentTitle("Extent Listener Report Demo");
		htmlReporter.config().setReportName("This is my first Report");
		htmlReporter.config().setTheme(Theme.DARK);}
	
	public  void onTestStart(ITestResult result) {
		System.out.println(path);
		    
		  }

		  
		  public void onTestSuccess(ITestResult result) {
			  System.out.println( "Name of the Test Method successfully executed " + result.getName());
			  test = reports.createTest(result.getName());
			  test.log(Status.PASS, MarkupHelper.createLabel("Name of the testcase is " + result.getName(), ExtentColor.GREEN));
		    
		  }

		
		   
		  public void onTestFailure(ITestResult result) {
			  System.out.println( "Name of the Test Method failed " + result.getName());
			  test = reports.createTest(result.getName());
			  test.log(Status.FAIL, MarkupHelper.createLabel("Name of the testcase is " + result.getName(), ExtentColor.RED));
			
			  String screenshotPath = System.getProperty("user.dir" + "\\Screenshots\\" +result.getName()+ ".png");
			  File file = new File(screenshotPath);
			  if(file.exists()) {
				  test.fail("captured the below screenshot: " + test.addScreenCaptureFromPath(screenshotPath));
			  }
		   
		  }

		  /**
		   * Invoked each time a test is skipped.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SKIP
		   */
		  public void onTestSkipped(ITestResult result) {
			  System.out.println( "Name of the Test Method skipped " + result.getName());
			  test = reports.createTest(result.getName());
			  test.log(Status.SKIP, MarkupHelper.createLabel("Name of the testcase is " + result.getName(), ExtentColor.YELLOW));
		  }

		
		  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		   
		  }

		  /**
		   * Invoked each time a test fails due to a timeout.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   */
		  public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		  }

		  /**
		   * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt;
		   * tag and calling all their Configuration methods.
		   *
		   * @param context The test context
		   */
		  public void onStart(ITestContext context) {
		    configureReport();
		    System.out.println("Test has benn invoked.........`");
		  }

		  /**
		   * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have
		   * run and all their Configuration methods have been called.
		   *
		   * @param context The test context
		   */
		  public void onFinish(ITestContext context) {
		    System.out.println("On FInish method invoked successfuly.................");
		    reports.flush();
		  }
}
