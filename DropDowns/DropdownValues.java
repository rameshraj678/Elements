package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DropdownValues {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.id("themes"));
		System.out.println("Name of Dropdown" +" "+ dropdown);

		List<WebElement>values= dropdown.findElements(By.tagName("option"));
		
		for(int r=0;r<values.size();r++)
		
		{
			System.out.println("Name of the value"+ " "+ values.get(r).getText());
			
		}
			

		
		
		driver.close();
		
		

	}

}
