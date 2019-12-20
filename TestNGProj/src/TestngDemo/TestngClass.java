package TestngDemo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class TestngClass {		
		static WebDriver driver;
		static SoftAssert softAssert=new SoftAssert();
	//@BeforeMethod
	public static void before()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ed\\sel practice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
	}
		
			
	@Test (priority=1,description="on site")
	public static void first()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ed\\sel practice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.xpath("//a[contains(@id,'highlight-addons')]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().build().perform();
		WebElement ele2=driver.findElement(By.xpath("//a[contains(text(),'SpiceMax ')]"));
		act.moveToElement(ele2).click().build().perform();
		System.out.println("first "+driver.getTitle());
		
		driver.close();
	}

	@Test(priority=2,description="3 but 2")
	public static void third()
	{
		
		softAssert.assertEquals(true,false);
		System.out.println("testcase failed");
		//softAssert.assertAll();
	}
	
	@Test(priority=3,description="2 but 3")
	public static void second()
	{
		System.out.println("welcome to selenium 2 world");
	}
	@Test(priority=4)
	public static void four()
	{
		
		Assert.assertEquals(true,true);
		System.out.println("testcase 4 pass");
		//softAssert.assertAll();
	}
	//@AfterMethod
	public static void tearDown()
	{
		driver.close();
	
	}

}
