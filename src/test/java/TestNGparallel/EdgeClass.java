package TestNGparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EdgeClass {
	
	//WebDriver driver;
	@Test
	public void method()  {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\002ZLK744\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
	
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		
		
		}
}

