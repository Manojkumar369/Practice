package TestngDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDrop {
static WebDriver driver;

@BeforeClass
public static void launchbrowser()
{

System.setProperty("webdriver.chrome.driver", "E:\\ed\\sel practice\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().window().maximize();
//SoftAssert softassert=new SoftAssert();
}

//@Test
public static void eledisplayed()
{
	Assert.assertEquals(true,driver.findElement(By.name("websubmit")).isDisplayed(),"element is dispalyed");
	
}
@Test
public static void eleSelected()
{
	System.out.println("element text is"+driver.findElement(By.xpath("//input[@value='2']")).getText());
	
	
	Assert.assertEquals(false,driver.findElement(By.xpath("//input[@value='2']")).isSelected(),"element is not selected");
	driver.findElement(By.xpath("//input[@value='2']")).click();

	Assert.assertEquals(true,driver.findElement(By.xpath("//input[@value='2']")).isSelected(),"element is not selected");
	//Assert.assertE
	
}
//@Test
public static void eleContains()
{
	Assert.assertEquals(true,driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).getText().contains("Forgotten account"),"text is not present");
	Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).isSelected());
}
//@Test
public static void dropvalues()
{		
WebElement monthele=driver.findElement(By.name("birthday_month"));
		Select se=new Select(monthele);
		List<WebElement> drop_month=se.getOptions();
		List<String> templist=new ArrayList<String>();
		List<String> endlist=new ArrayList<String>();
		for(WebElement month:drop_month)
		{
			templist.add(month.getText());
			endlist.add(month.getText());
		}
		Collections.sort(templist);
		System.out.println(templist);
		System.out.println(endlist);
		Assert.assertEquals(templist, endlist,"lists are not equal");
		System.out.println("lists are equal but not sorted");
		//softassert.assertAll();
		
}
	
	@AfterClass
	public static void teardown()
	{
		driver.close();
	}

}
