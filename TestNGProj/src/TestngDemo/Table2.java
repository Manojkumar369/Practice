package TestngDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Table2 {

	static WebDriver driver;
	@BeforeMethod
	public static void launch()
	{
		//System.setProperty("webdriver.chrome.driver","E:\\ed\\sel practice\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\ed\\sel practice\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.indiatoday.in/education-today/gk-current-affairs/story/indian-states-with-highest-population-1358414-2018-10-08");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}
	
	@Test
	public static void m1()
	{
	WebElement table=driver.findElement(By.xpath("//*[@id=\"story\"]/div[2]/div/div[3]/div[3]/table/tbody"));
	
	List<WebElement> rows=table.findElements(By.tagName("tr"));
	for(int i=1;i<rows.size();i++)
	{
		List<WebElement> columns=rows.get(i).findElements(By.tagName("td"));
		for(int j=0;j<columns.size();j++)
		{
			WebElement ele=driver.findElement(By.xpath("//*[@id=\"story\"]/div[2]/div/div[3]/div[3]/table/tbody/tr["+(i+1)+"]/td["+(j+1)+"]"));
			System.out.println(ele.getText());
			if(ele.getText().equals("Bihar"))
			{
				System.out.println(driver.findElement(By.xpath("//*[@id=\"story\"]/div[2]/div/div[3]/div[3]/table/tbody/tr["+(i+1)+"]/td["+(j+2)+"]")).getText());
			break;
			}
			
		}
	}	
	}
	
	
	
	
	
	@AfterMethod
	public static void tearDown()
	{
		driver.close();
	}
}
