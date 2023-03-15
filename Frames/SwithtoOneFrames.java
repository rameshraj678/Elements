package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwithtoOneFrames {

	
	WebDriver driver;
	
	@BeforeTest
	
	public void open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");   
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	
	@Test
	
	public void counttable() throws InterruptedException {
		
		List<WebElement>frames=driver.findElements(By.tagName("iframe"));
		int totalframesh= frames.size();
		System.out.println("no of frames"+" "+totalframesh);
		WebElement sframe =driver.findElement(By.name("iframe_b"));
		System.out.println("frame name are"+" " +sframe);
		
	for  (WebElement iframe : frames) {
			System.out.println(iframe.getAttribute("name"));
			
			if(iframe.getAttribute("name").equals("iframe_b"))
				{
					driver.switchTo().frame(sframe);
					driver.findElement(By.id("searchInput")).sendKeys("Testing tools");						
					Thread.sleep(2000);
					driver.switchTo().defaultContent();
				}
		}
		
				boolean buttondisplay = driver.findElement(By.id("simpleAlert")).isDisplayed();
				System.out.println(buttondisplay);
	}
	
	@AfterTest
	
	public void close() {
		
		driver.close();
	}
}
