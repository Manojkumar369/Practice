package Practice;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class Hashmap 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver", "E:\\ed\\sel practice\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://freecrm.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("email")).sendKeys(username("buy"));
	driver.findElement(By.name("password")).sendKeys(password("buy"));
	
	
	
	
	
	}
	public static String username(String role)
	{
	
		String value=mapCredentials().get(role);
		return value.split(":")[0];
	}
	public static String password(String role)
	{
		String value=mapCredentials().get(role);
		return value.split(":")[1];
		
	}
	public static HashMap<String, String> mapCredentials()
	{
		HashMap<String,String> usermap=new HashMap<String,String>();
		usermap.put("buy", "Manoj:12345");
		usermap.put("sell", "Manoj:15");
		usermap.put("prod", "Manoj:345");
		usermap.put("med", "Manoj:1125");
		usermap.put("add", "Manoj:2121");
		return usermap;
	}
}
