package techfios;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techfios {
 
	WebDriver driver;
	@Before
	 public void element() {
		 System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		 	 driver=new ChromeDriver();
		 	 driver.get("http://www.techfios.com//ibilling//?ng=admin");
		 	 		 
		 	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void login() throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.get("http://www.techfios.com/ibilling/?ng=transactions/deposit/");
        driver.findElement(By.className("ibox-title")).click();
driver.findElement(By.id("account")).sendKeys("Mean258");
driver.findElement(By.id("description")).sendKeys("deposited by Jyoti");
driver.findElement(By.id("amount")).sendKeys("52,000");
driver.findElement(By.id("submit")).click();
Thread.sleep(2000);
driver.findElement(By.className("nav-label")).click();
Thread.sleep(2000);


}
	@Test
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
