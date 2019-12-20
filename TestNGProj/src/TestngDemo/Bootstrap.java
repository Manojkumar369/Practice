package TestngDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Bootstrap {
static WebDriver driver;
	@BeforeClass
	public static void launch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\ed\\sel practice\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/bootstrap4/demo.php?ex=79.0_1");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
}
	
@Test
public static void first()
{
	driver.findElement(By.id("btnDropdownDemo")).click();
	List<WebElement> boots=driver.findElements(By.xpath("//a[@class='dropdown-item']"));
for(WebElement boot:boots)
{
	if(boot.getText().equalsIgnoreCase("HTML"))
	{
		System.out.println(boot.getText());
		boot.click();
		break;
	}
}
}
	
@AfterClass
public static void teardown()
{
	driver.close();
}
	
}
