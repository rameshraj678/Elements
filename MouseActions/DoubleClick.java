package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleClick {

	WebDriver driver;
	
	@ BeforeTest
	
	public void open() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
@ Test (priority =1)
		public void doubleclick() throws InterruptedException {
			

		WebElement gsearch=driver.findElement(By.xpath("//input[@name='q']"));
		Actions ac = new Actions(driver);
		ac.doubleClick(gsearch).build().perform();		
		Thread.sleep(3000);
		
	}
@Test (priority =2)

	public void enterfield() throws InterruptedException {
	
	driver.findElement(By.name("q")).sendKeys("Testing tools");
	Thread.sleep(3000);
	WebElement entry = driver.findElement(By.name("btnK"));
	Actions ac = new Actions(driver);
	
	ac.doubleClick(entry).build().perform();
	Thread.sleep(3000);
	
	driver.navigate().back();
	
}
		
@ Test (priority =3)
	
	public void rightclick() throws InterruptedException {
	
	WebElement right = driver.findElement(By.linkText("Gmail"));
	Actions ac =new Actions(driver);
	
	ac.contextClick(right).build().perform();
	Thread.sleep(3000)	;
}
	
@ AfterTest
public void close () {
	driver.close();
}
	

}
