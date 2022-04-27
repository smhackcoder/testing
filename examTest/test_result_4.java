package examTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_result_4
{
	WebDriver driver;
	@Test
	public void test_case4() {
		driver.findElement(By.xpath("//span[.='2']")).click();
		driver.findElement(By.xpath("//span[.='3']")).click();
		driver.findElement(By.xpath("//span[.='4']")).click();
		driver.findElement(By.xpath("//span[.='8']")).click();
		driver.findElement(By.xpath("//span[.='2']")).click();
		driver.findElement(By.xpath("//span[.='3']")).click();
		driver.findElement(By.xpath("//span[.='–']")).click();
		driver.findElement(By.xpath("//span[.='–']")).click();
		driver.findElement(By.xpath("//span[.='2']")).click();
		driver.findElement(By.xpath("//span[.='3']")).click();
		driver.findElement(By.xpath("//span[.='0']")).click();
		driver.findElement(By.xpath("//span[.='9']")).click();
		driver.findElement(By.xpath("//span[.='4']")).click();
		driver.findElement(By.xpath("//span[.='8']")).click();
		driver.findElement(By.xpath("//span[.='2']")).click();
		driver.findElement(By.xpath("//span[.='3']")).click();
		
		driver.findElement(By.xpath("//span[.='ans']")).click();
	}
	@BeforeMethod
	  public void openBrowser()
	  {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.calculator.net/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  }		
	@AfterMethod
	  public void closeBrowser() throws InterruptedException
		   {
			  Thread.sleep(5000); 
			  driver.quit();
		   }
	
}

