package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OnepageScreenshot {

	

	WebDriver driver;
	
	@BeforeTest
	
	public void open() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		File srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	File file= ts.getScreenshotAs(OutputType.FILE); ///////////////////////\\\\\\\\\\   another way below //////
		FileUtils.copyFile(srcfile, new File("./ScreenshotsVK/imge.JPEG"));
		
		Thread.sleep(3000);
		
	}
	@Test
	
	public void countofimagesScreens() throws IOException  {
		
			driver.findElement(By.xpath("//a[@aria-label='Hindi\']")).click();
		
			TakesScreenshot ts = (TakesScreenshot)driver;
			File file =ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("./ScreenshotsVK/imag1.JPEG"));	
	}
	
	@AfterTest
	
	public void close() {
		
		driver.close();
				
		
		
		
	}
}
