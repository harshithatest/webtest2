package AlertAndiFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002ZLK744\\Downloads\\chromedriver-win64_new\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		 WebElement scrolEle=driver.findElement(By.xpath("//*[text()='Alerts, Frame & Windows']"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",scrolEle);
	      scrolEle.click();
	      Thread.sleep(5000);
	      WebElement scrolEle2=driver.findElement(By.xpath("//*[text()='Frames']"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",scrolEle2);
	      driver.findElement(By.xpath("//*[text()='Frames']")).click();
	   //   String mainWindow= driver.getWindowHandle();
	      
	     WebElement frame= driver.findElement(By.id("framesWrapper"));
	   
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",frame);
	      frame.click();
	     
	 //    driver.switchTo().frame(frame);
	     String str=driver.getTitle();
	     System.out.print(str);
	     driver.switchTo().frame(0);
	     String str2=driver.getTitle();
	     System.out.print(str2);
	     driver.switchTo().frame(1);
	     String str3=driver.getTitle();
	     System.out.print(str3);
	     driver.close();

	}

}
