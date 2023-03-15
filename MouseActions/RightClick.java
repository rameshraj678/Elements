package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClick {

	
	WebDriver driver;
	
	@BeforeTest
	
	public void open () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	 
	@Test
	
	public void rightclick() throws InterruptedException {
		
		WebElement yhelp=driver.findElement(By.linkText("Sign In"));
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		ac.contextClick(yhelp).build().perform(); // right click //contextClick to use method 
		
		Thread.sleep(3000);
	}
	
	@AfterTest
	
	public void close() {
		driver.close();
		
		
		
	}
}
