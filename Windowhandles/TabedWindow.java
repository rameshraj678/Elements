package Windowhandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TabedWindow {
	
	WebDriver driver;
	
	@BeforeTest
	
	public void open () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);  
		
	}
		
	@Test
	
	public void tabbedwindow() throws InterruptedException {
		
		
		WebElement tabedwindow= driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]"));
		tabedwindow.click();
		Thread.sleep(2000);
		Set<String>windowids=driver.getWindowHandles();
		Iterator<String>iter=windowids.iterator();
		String mainwindow=iter.next();
		String chaildwindow=iter.next();
		driver.switchTo().window(chaildwindow);
		System.out.println("Tittle" +"  "+driver.getTitle());
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(mainwindow);
		System.out.println("Tittle"+ "  "+driver.getTitle());
		
	
	}
	
	@AfterTest
	
	public void close() {
		
		driver.close();
	
		
	}

	
	
}




