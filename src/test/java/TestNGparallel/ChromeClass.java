package TestNGparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeClass {
	public WebDriver driver;
	
	@Test
	public void method()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002ZLK744\\Downloads\\chromedriver-win64_new\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		driver.close();
		
}
}