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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Nlate {
	static WebDriver driver;
	@BeforeMethod
	public static void launch()
	{
		//System.setProperty("webdriver.chrome.driver","E:\\ed\\sel practice\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\ed\\sel practice\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}
	
	@Test
	public static void m1()
	{
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select select=new Select(month);
		List<WebElement> months=select.getOptions();
		ArrayList real=new ArrayList();
		ArrayList dup=new ArrayList();
		
		for(WebElement ele:months)
		{
			String str=ele.getText();
			real.add(str);
			dup.add(str);
			System.out.println(str);
			
		}
		Collections.sort(dup);
		System.out.println(real+" "+dup);
		System.out.println(real.equals(dup));
		System.out.println(real.get(6).equals(dup.get(6)));
		
		
	}
	@Test
	public static void m2()
	{
	driver.findElement(By.xpath("//label[contains(text(),'Custom')]")).click();
	}
	
	@AfterMethod
	public static void tearDown()
	{
		driver.close();
	}

}
