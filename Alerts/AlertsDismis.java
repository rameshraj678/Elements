package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertsDismis {

	
	WebDriver driver;
	
	@ BeforeTest
	
	public void open() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe" );
		driver=new ChromeDriver();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void click() throws InterruptedException {
		driver.findElement(By.id("promptAlert")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Yes");
		
		
		
//		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
	}
	
	@ AfterTest
	public void close() {
		
		driver.close();
		
		
	}
	
}
