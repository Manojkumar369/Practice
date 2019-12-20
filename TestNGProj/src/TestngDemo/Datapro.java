package TestngDemo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapro {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public static void launch()
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\ed\\sel practice\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
	}
	
	@Test(dataProvider="testdata")
	public static void m1()
	{
		
	}
	
	@DataProvider(name="testdata")
	public static Object[][] data()
	{
		File f=new File("C:/Users/Manoj/Documents/testdata.xlsx");
		Workbook wb=Workbook.getWorkbook(f);
		
		return inputdata;
	}
	
	@AfterMethod
	public static void teardown()
	{
		driver.close();
	}

}
