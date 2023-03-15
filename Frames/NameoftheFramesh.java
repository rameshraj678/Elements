package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NameoftheFramesh {
 
	WebDriver driver;
	
	@BeforeTest
	
	public void open() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");   
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void nameoftheframesh() {
		
		List<WebElement>frames=driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames"+ " "+frames.size());
		for(int r=0;r<frames.size();r++)
		{
			System.out.println("name of the frames"+"  "+frames.get(r).getAttribute("name"));
		}
	}
	
	@AfterTest
	
	public void close() {
		
		driver.close();
	}
}
