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

public class Table {
	static WebDriver driver;
	@BeforeMethod
	public static void launch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ed\\sel practice\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.timeshighereducation.com/student/best-universities/most-international-universities-world#survey-answer");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public static void m1()
	{
		WebElement table=driver.findElement(By.xpath("//*[@id=\"block-system-main\"]/div/div/div/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/table/tbody"));
		List<WebElement> total_rows=table.findElements(By.tagName("tr"));
		for(int row=0;row<total_rows.size();row++)
		{
			List<WebElement> total_columns=total_rows.get(row).findElements(By.tagName("td"));
			for(int col=0;col<total_columns.size();col++)
			{
				String search=total_columns.get(col).getText();
				//System.out.println(search);
				if(search.equals("France"))
				{
String goal=driver.findElement(By.xpath("//*[@id=\"block-system-main\"]/div/div/div/div[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/table/tbody/tr["+(row+1)+"]/td["+(col-2)+"]")).getText();
					System.out.println(goal);
				}
				
			}
		}
	}
	
	//@Test
	public static void m2()
	{
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]/table/tbody"));
		List<WebElement> total_rows=table.findElements(By.tagName("tr"));
		//System.out.println("zeroth row"+total_rows.get(0).getText());
		for(int row=0;row<total_rows.size();row++)
		{
			List<WebElement> total_columns=total_rows.get(row).findElements(By.tagName("td"));
			for(int col=0;col<total_columns.size();col++)
			{
				String search=total_columns.get(col).getText();
				//System.out.println(search);
				if(search.equals("Angola"))
				{
					System.out.println(row+" + "+col);
String goal=driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]/table/tbody/tr["+(row+1)+"]/td["+(col+2)+"]")).getText();
					System.out.println(goal);
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
