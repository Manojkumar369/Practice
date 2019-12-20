package Practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\ed\\sel practice\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement el1=driver.findElement(By.id("day"));
		WebElement el2=driver.findElement(By.id("month"));
		WebElement el3=driver.findElement(By.id("year"));
		Select sel1=new Select(el1);
		sel1.selectByVisibleText("14");
		
		Select sel2=new Select(el2);
		sel2.selectByIndex(6);
		
		Select sel3=new Select(el3);
		sel3.selectByValue("1995");
		WebElement selected=sel3.getFirstSelectedOption();
		System.out.println("i just selecyed year as 1995"+selected.getText().equals("1995"));
		List<WebElement> opt=sel2.getOptions();
		System.out.println("length "+opt.size());
		for(int i=0;i<opt.size();i++)
		{
			String str=opt.get(i).getText();
			System.out.println(i+" "+str);
		}
		
		
		
		
		
	}

}
