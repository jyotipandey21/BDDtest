package techfios;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homerwok3 {
	
	
WebDriver driver;


@Before
public void TEST() {
	System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://www.techfios.com//ibilling//?ng=admin");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}

@Test
public void login() throws InterruptedException {
	
driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
driver.findElement(By.id("password")).sendKeys("abc123");
driver.findElement(By.name("login")).click();
driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a")).click();
driver.findElement(By.xpath("/html/body/section/div/nav/div/ul/li[3]/ul/li[1]/a")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"account\"]")).sendKeys("Preeti pandey");

	Select sel=new Select(driver.findElement(By.id("cid")));
	sel.selectByVisibleText("Techfios");
	sel.selectByValue("1");
	
	driver.findElement(By.id("email")).sendKeys("jppan2020@gmail.com");
	driver.findElement(By.id("phone")).sendKeys("972-518-1016");
	driver.findElement(By.id("address")).sendKeys("macarthur,app-746,zip-75038");
	driver.findElement(By.id("city")).sendKeys("frisco");
	driver.findElement(By.id("state")).sendKeys("tx");
	driver.findElement(By.id("zip")).sendKeys("75038");
	
	Select select=new Select(driver.findElement(By.id("country")));
	select.selectByVisibleText("United States");
	
	driver.findElement(By.xpath("//*[@id=\"rform\"]/div[1]/div[1]/div[10]/div/span/span[1]/span/ul/li/input")).sendKeys("Dubai");
	
	Select sel1 =new Select(driver.findElement(By.id("currency")));
	sel1.selectByValue("1");
	
Select sel2=new Select(driver.findElement(By.id("group")));
	sel2.selectByValue("2");

	driver.findElement(By.id("password")).sendKeys("abc123");
	driver.findElement(By.id("cpassword")).sendKeys("abc123");
	
}
}
