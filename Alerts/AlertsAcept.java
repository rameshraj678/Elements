package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertsAcept {

	
	WebDriver driver;
	
	@ BeforeTest
	
	public void OpneBrowser() throws InterruptedException {
		
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver(option);
		
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}	
	@Test
	
	public void accept() throws InterruptedException {
		
		driver.findElement(By.id("searchBtn")).click();
		String value=driver.switchTo().alert().getText();
		System.out.println(value);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
	}
	
	@ AfterTest
	
	public void close() {
		
		driver.close();
	}
	
}
