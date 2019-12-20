package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ed\\sel practice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.tripadvisor.in/Hotels-g297628-Bengaluru_Bangalore_District_Karnataka-Hotels.html");
		driver.get("https://www.yatra.com/hotels/hotels-in-bangalore");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.switchTo().frame("Fancybox-frame");
		//driver.findElement(By.xpath("//span[@class='be-close js-subscription-popop-close']")).click();
		//driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[contains(text(),'HOLIDAYS')]")).click();
		
		//driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/div/div/span/div/div[6]/div/div/div")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/span/div[3]/div/div[2]/div[3]/span[1]/div[12]//preceding-sibling::div//div[conatins(@date-date,'2019-6-11')]")).click();
		
	/*	WebElement table=driver.findElement(By.tagName("/html/body/div[4]/div[1]/div[2]/table/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("total rows "+rows.size());
		List<WebElement> cols=rows.get(2).findElements(By.tagName("td"));
		System.out.println("total columns"+cols.size());*/
		
		
	}

}
