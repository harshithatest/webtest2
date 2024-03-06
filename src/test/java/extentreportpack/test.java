package extentreportpack;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class test {
	ExtentReports report=new ExtentReports();
	ExtentSparkReporter spark=new ExtentSparkReporter("Extentreport.html");
		@Test
	void f1() {
		report.attachReporter(spark);
		ExtentTest test= report.createTest("Launch Browser");
		test.log(Status.PASS, "sucess");
		report.flush();
	}

}
