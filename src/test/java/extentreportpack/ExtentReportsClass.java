package extentreportpack;
import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReportsClass {
	ExtentReports report=new ExtentReports();
	ExtentSparkReporter spark=new ExtentSparkReporter("Extentreport.html");
	
@BeforeTest
public void BeforeTest() {
	report.attachReporter(spark);
}
 
@Test
public void f1() {
         // Create an object of Extent Reports
	ExtentTest test= report.createTest("Launch Browser");
	test.log(Status.PASS, "sucess");
}
@Test
public void f2() {
	ExtentTest test= report.createTest("login");
	test.info("pop up displaying");
	test.pass("login successfully");
	test.warning("reset password alert displaying");
}
@Test
public void f3() {
	ExtentTest test= report.createTest("verify dashboard");
	test.skip("verify dashboard skipped");
}
@Test
public void f4() {
	ExtentTest test= report.createTest("send email to user");
	test.fail("unable to send email");
}

@AfterTest
public void aftertest() {
	report.flush();
}

}