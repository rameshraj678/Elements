package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CountofFrames {

	
	WebDriver driver;
	
	
	@BeforeTest
	
	public void ope () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");   
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	}

@Test (priority =1)

public void count () {
	
//	List<WebElement> frmes=driver.findElements(By.tagName("iframe"));
//	System.out.println("no of framesh"+ " "+frmes.size());
	
}	
@Test (priority =2)
public void listofframes() {
	
//	List<WebElement>frames =driver.findElements(By.tagName("iframe"));
//	
//	for(int r=0;r<frames.size();r++)
//	{
//		String test=frames.get(r).getAttribute("name");
//		System.out.println("name of the frames"+" "+test);
//	}

}
@Test (priority = 3)

public void addframes() {
	
	List<WebElement>addfrms=driver.findElements(By.xpath("//*[@aria-label='Advertisement']"));
	System.out.println("no of add framesh"+ " "+addfrms.size());
	for(int r=0; r<addfrms.size();r++)
	{
		System.out.println("name of the add frames"+" "+ addfrms.get(r).getAttribute("name")); 
		
	}
}


@AfterTest

public void close() {
	
	driver.close();
}
}