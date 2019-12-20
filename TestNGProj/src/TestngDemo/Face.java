package TestngDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Face {
	static WebDriver driver;
	
	@BeforeMethod
	public static void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manoj\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
@Test
public static void m2()
{
WebElement ele=driver.findElement(By.xpath("//a[contains(text(),'Create Page')]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true);",ele);
js.executeScript("arguments[0].style.border='3px solid red'", ele);
WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
//js.executeScript("arguments[0].click()",ele1);
//js.executeScript("alert('"+"hi"+"')");
/*String str1=js.executeScript("return document.title;").toString();
System.out.println(str1);
String str2=js.executeScript("return document.documentElement.innerText;").toString();
System.out.println(str2);*/

String bgcolor=ele1.getCssValue("backgroundcolor");
for(int i=0;i<10;i++)
{
	changecolor("rgb(0,200,0)",ele1,driver);
	
}

}
	
	//@AfterMethod
	public static void teardown()
	{
		driver.close();
	}
}
