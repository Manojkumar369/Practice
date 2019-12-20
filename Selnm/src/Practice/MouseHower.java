package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MouseHower {
	
	static WebDriver driver;
	SoftAssert softAssert=new SoftAssert();
@BeforeClass
public static void before()
{
	System.setProperty("webdriver.chrome.driver", "E:\\ed\\sel practice\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.spicejet.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
}
	
		
@Test(priority=1)
public static void m1()
{
	
	WebElement ele=driver.findElement(By.xpath("//a[contains(@id,'highlight-addons')]"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).click().build().perform();
	WebElement ele2=driver.findElement(By.xpath("//a[contains(text(),'SpiceMax ')]"));
	act.moveToElement(ele2).click().build().perform();
	System.out.println(driver.getTitle());
	
}

@Test (priority=2)
public static void m2()
{
	
	WebElement ele=driver.findElement(By.xpath("//a[contains(@id,'highlight-addons')]"));
	Actions act=new Actions(driver);
	act.moveToElement(ele).click().build().perform();
	WebElement ele2=driver.findElement(By.xpath("//a[contains(text(),'SpiceMax ')]"));
	act.moveToElement(ele2).click().build().perform();
	Assert.assertEquals(true,false);
	System.out.println("testcase failed");
}
@AfterClass
public static void tearDown()
{
	driver.close();
}
}
