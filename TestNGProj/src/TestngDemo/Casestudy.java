package TestngDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Casestudy {

	static WebDriver driver;
	@BeforeMethod
	public static void launch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ed\\sel practice\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Manoj/Downloads/index.html");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	//@Test(priority=1)
	public static void test1()
	{
		WebElement email=driver.findElement(By.id("inputEmail"));
		WebElement pwd=driver.findElement(By.id("inputPassword"));
		WebElement login=driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block']"));
		Assert.assertEquals(true, email!=null);
		System.out.println("email is present");
		Assert.assertEquals(true, pwd!=null);
		System.out.println("password is present");
		Assert.assertEquals(true, login!=null);
		System.out.println("login button is present");
		email.clear();
		email.sendKeys("k.manojkumar699@gmail.com");
		pwd.clear();
		pwd.sendKeys("K_manoj369");
	}
	
	//@Test(priority=2)
	public static void test2()
	{
		driver.navigate().to("file:///C:/Users/Manoj/Downloads/index.html");
		List<WebElement> coll=driver.findElements(By.xpath("//*[@id='test-2-div']/ul/li"));
		int total=coll.size();
		Assert.assertEquals(total,3);
		System.out.println("total elements ar:e "+total);
		
		
	}
	//@Test(priority=3)
	public static void test3()
	{
		driver.navigate().to("file:///C:/Users/Manoj/Downloads/index.html");
		WebElement dropdown=driver.findElement(By.id("dropdownMenuButton"));
		Select sel=new Select(dropdown);
		WebElement selected=sel.getFirstSelectedOption();
		Assert.assertTrue(selected.getText().equals("Option 1"),"option 1 is not selected");
		sel.selectByValue("Option 3");
		WebElement selected3=sel.getFirstSelectedOption();
		Assert.assertTrue(selected3.getText().equals("Option 3"),"option 3 is not selected");
		
		
	}
	//@Test(priority=4)
	public static void test4()
	{
		driver.navigate().to("file:///C:/Users/Manoj/Downloads/index.html");
		WebElement btn1=driver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-primary')]"));
		WebElement btn2=driver.findElement(By.xpath("//button[contains(@class,'btn btn-lg btn-secondary')]"));
		System.out.println(btn2.getText());
		Assert.assertTrue(btn1.isEnabled());
		Assert.assertTrue(!btn2.isEnabled());
		
	}
	//@Test(priority=5)
	public static void test5()
	{
		driver.navigate().to("file:///C:/Users/Manoj/Downloads/index.html");
		WebElement btn1=driver.findElement(By.id("test5-button"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		//js.executeScript("arguments[0].scrollIntoView();", btn1);
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(btn1));
		
		Assert.assertTrue(btn1.isDisplayed());
		System.out.println("element is displayed "+btn1.getText());
	}
	@Test(priority=6)
	public static void test6()
	{
		driver.navigate().to("file:///C:/Users/Manoj/Downloads/index.html");
		WebElement table=driver.findElement(By.xpath("//*[@id='test-6-div']/div/table/tbody"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(2);
		list1.add(2);
		js.executeScript("arguments[0].scrollIntoView();", table);
		List<WebElement> total_rows=table.findElements(By.tagName("tr"));
		for(int row=0;row<total_rows.size();row++)
		{
			List<WebElement> total_col=total_rows.get(row).findElements(By.tagName("td"));
			for(int col=0;col<total_col.size(); col++)
			{
				System.out.println("yes,Ventosanzap is at"+row+" "+col);
				WebElement res=driver.findElement(By.xpath("//*[@id=\"test-6-div\"]/div/table/tbody/tr["+(row+1)+"]/td["+(col+1)+"]"));
				
				if(res.getText().equalsIgnoreCase("Ventosanzap"))
				{
				
				List<Integer> list2=new ArrayList<Integer>();
				list2.add(row);
				list2.add(col);
				System.out.println("yes,Ventosanzap is at"+row+" "+col);
				Assert.assertEquals(list1,list2);
				
				}
				break;
				
			}
			
		}	
	//findValue(1,1);
	}
	
	public static void findValue(int row,int col)
	{
	WebElement table=driver.findElement(By.xpath("//*[@id='test-6-div']/div/table/tbody"));
	List<WebElement> total_rows=table.findElements(By.tagName("tr"));
	
		List<WebElement> total_col=total_rows.get(1).findElements(By.tagName("td"));
		
			WebElement res=driver.findElement(By.xpath("//*[@id=\"test-6-div\"]/div/table/tbody/tr["+(row+1)+"]/td["+(col+1)+"]"));
			System.out.println("at 1,1 position cell value is"+res.getText());

			
		
	}
	
	@AfterMethod
	public static void teardown()
	{
		driver.close();
		System.out.println("end");
	}
	
	
	
	
}
