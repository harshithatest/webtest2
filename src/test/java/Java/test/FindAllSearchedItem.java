package Java.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FindAllSearchedItem {

	
		// TODO Auto-generated method stub
		@Test
		public void method() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002ZLK744\\Downloads\\chromedriver-win64_new\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//findelement
		WebElement el=driver.findElement(By.id("twotabsearchtextbox"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','OnePlus 12')", el);
		//driver.findElement(By.id("twotabsearchtextbox"));
		Actions act=new Actions(driver);
		List<WebElement> ele=driver.findElements(By.xpath("//*[@class='left-pane-results-container']//child::div/div/div"));
		ele.size();
		
		//System.out.println(product.getText());
		Thread.sleep(5000);
		System.out.println("*******");
		driver.close();
	}
	
	}
