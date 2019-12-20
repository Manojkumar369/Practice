package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Excep {
	static WebDriver driver;
	
	@BeforeMethod
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ed\\selenium jars\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.speedtest.net/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void test()
	{
		WebElement ele=driver.findElement(By.xpath("//script[contains(@type,'text/javascript')]"));
		System.out.println(ele.getText());
		ele.click();
	}
@AfterMethod
public void after()
{
	driver.close();
}
}
