package TestNGGroup;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationClass {
	@Test(priority=3, groups={"reg","smoke"})
	void met1() {
		System.out.println("regression");
	}
	@Test(priority=1,groups="reg")
	void met2() {
		System.out.println("test met2");
	}
	@Test(priority=0)
	void met3() {
		System.out.println("test met3");
	}
	@Test(priority=2)
	void met4() {
		System.out.println("test met4");
	}
	@BeforeClass
	void beforeClass() {
		System.out.println("before class");
	}
	@AfterClass
	void afterClass() {
		System.out.println("after class");
	}
	@BeforeGroups
	public void BfGroup() {
		System.out.println("before group");
	}
	@AfterGroups
	public void AfGroup() {
		System.out.println("after group");
	}
	@BeforeSuite
	void beforesuite() {
		System.out.println("before suite");
	}
	@AfterSuite
	void aftersuite() {
		System.out.println("after suite");
	}
	@BeforeMethod
	void beforemethod() {
		System.out.println("before met");
	}
	@AfterMethod
	void aftermethod() {
		System.out.println("after met");
	}
	@BeforeTest
	void beforetest() {
		System.out.println("before test");
	}
	@AfterTest
	void aftertest() {
		System.out.println("after test");
	}
	
	
	
	
}
