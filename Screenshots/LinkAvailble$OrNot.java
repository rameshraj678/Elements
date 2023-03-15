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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkAvailble$OrNot {

	WebDriver driver;   //Global verible
	
	@BeforeTest
	
	public void opne() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	@Test
	public void availbletest() throws IOException {  						//link is availble or not proff
		
		List<WebElement> links= driver.findElements(By.linkText("BKFS"));
		
		if(links.size()==0) {
			
			File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File("./Screenshots/Image.JPEG"));
		}
		else
		{
			links.get(0).click();
			
		}
		
	}
	
	@AfterTest
	
	public void close() {
		driver.close();
	}
}
