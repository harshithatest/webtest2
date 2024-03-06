package Java.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class buttons {
	WebDriver driver;
	public static void main(String args[]) {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\002ZLK744\\Downloads\\chromedriver-win64_new\\chromedriver-win64\\chromedriver.exe");


      WebDriver driver = new ChromeDriver();

      driver.get("https://demoqa.com/");
      driver.manage().window().maximize();
      try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      //scroll to element
      WebElement scrolEle=driver.findElement(By.xpath("//*[text()='Elements']"));
      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",scrolEle);
      scrolEle.click();
      
      //checkbox
      driver.findElement(By.xpath("//*[text()='Check Box']")).click();
      WebElement ele= driver.findElement(By.xpath("//*[@class='rct-checkbox']"));
      //explicit wait
      WebDriverWait wait= new WebDriverWait(driver, 5);
      wait.until(ExpectedConditions.elementToBeClickable(ele));
      ele.click();
      WebElement ele2= driver.findElement(By.id("result"));
      System.out.println(ele2.isDisplayed());
      
      //RadioButton
      WebElement scrolEle2=driver.findElement(By.xpath("//*[text()='Radio Button']"));
      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",scrolEle2);
      scrolEle2.click();
      WebElement scrolEle3=driver.findElement(By.xpath("(//input[@name='like'])[1]"));
      		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView;", scrolEle3);
      		
      		//seelect web element using javascriptexecutor
      		((JavascriptExecutor)driver).executeScript("arguments[0].click();", scrolEle3);
      
      WebElement ele3= driver.findElement(By.className("text-success"));
      System.out.println(ele3.isDisplayed());
		
      //buttons
      WebElement scrolEle4=driver.findElement(By.xpath("//*[text()='Buttons']"));
      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",scrolEle4);
      scrolEle4.click();
		
      WebElement ele4=driver.findElement(By.id("doubleClickBtn"));
      Actions act=new Actions(driver);
      act.doubleClick(ele4).perform();
      WebElement dbele= driver.findElement(By.id("doubleClickMessage"));
      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView;", dbele);
      System.out.println(dbele.isDisplayed());
      
      
      WebElement ele5=driver.findElement(By.id("rightClickBtn"));
      act.contextClick(ele5).perform();
      WebElement rcele= driver.findElement(By.id("rightClickMessage"));
      ((JavascriptExecutor)driver).executeScript("0, document.body.scollHeiht");
      System.out.println(rcele.isDisplayed());
    
      driver.close();
      
}
}