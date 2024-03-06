package Java.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchCromeBRowser {

		@Test
		public void method() throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002ZLK744\\Downloads\\chromedriver-win64_new\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		//findelement
		driver.findElement(By.xpath("//span[text()='Flights']")).click();
		//findelements
		List<WebElement> ele= driver.findElements(By.tagName("nav"));
		for(WebElement elements:ele) {
			elements.getText();
			System.out.println(elements);
		}
	
		Thread.sleep(3000);
		driver.close();
		}
	

}
