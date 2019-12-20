package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","E:\\ed\\selenium jars\\work\\chromedriver.exe");
		
		//m1();// w h
		//m2();//window handling
		//m3();//window handling
		m4();
	}
	public static void m4() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\ed\\sel practice\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("app opened");
		driver.findElement(By.xpath("//*[contains(@id,'alert')]")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		driver.close();
	
	
	
	
	}
	public static void m3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\ed\\sel practice\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("app opened");
		String main=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div/div/div/div/p[4]/button")).click();
		Thread.sleep(3000);
		System.out.println("1 click");
		
		Set<String> all=driver.getWindowHandles();
		Iterator<String> itr=all.iterator();
		while(itr.hasNext())
		{
			
			if(!main.equals(itr.next()))
			{
				driver.switchTo().window(itr.next());
				
				driver.close();
			}
		}
		System.out.println("windows closed ");
		driver.switchTo().window(main);
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void m2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\ed\\sel practice\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("app opened");
		String main= driver.getWindowHandle();
		System.out.println("current window---"+main);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a[2]")).click();
		Thread.sleep(3000);
		String c1= driver.getWindowHandle();
		System.out.println("child window is "+c1);
		if(main.equals(c1))
		{
			driver.switchTo().window(c1);
			System.out.println("first child title is"+driver.getTitle());
			driver.findElement(By.xpath("/html/body/div[3]/div/p[2]/a")).click();
			Thread.sleep(3000);
			String c2=driver.getWindowHandle();
			if(!c1.equals(c2))
			{
				driver.switchTo().window(c2);
				System.out.println("second child title is "+driver.getTitle());
				driver.close();
				System.out.println("second child closed");
				driver.switchTo().defaultContent();
				System.out.println("after switching default content"+driver.getTitle());
				driver.switchTo().window(c1);
				System.out.println("first child title is "+driver.getTitle());
				driver.close();
				driver.switchTo().defaultContent();
				System.out.println("after switching default content"+driver.getTitle());
			}
			
		}
	}
	public static void m1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","E:\\ed\\sel practice\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.toolsqa.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("app opened");
		String main= driver.getWindowHandle();
		System.out.println("current window---"+main);
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a[2]"));
		for(int i=0;i<3;i++)
		{
			ele.click();
			
			Thread.sleep(3000);
			System.out.println("open & wait 3 sec");
		}
		Set<String> windows=driver.getWindowHandles();
		System.out.println("set taken for windows"+windows);
		Iterator<String> handler=windows.iterator();
		while(handler.hasNext())
		{
			String child=handler.next();
			System.out.println(child);
			if(!main.equals(child))
			{
				System.out.println("not equals, so");
			driver.switchTo().window(child);
			System.out.println("switch happened");
			System.out.println("i am closing twitter"+driver.getTitle());
			driver.close();
			
			}
			driver.switchTo().window(main);
			System.out.println("again switch to main");
		}
	}

}
