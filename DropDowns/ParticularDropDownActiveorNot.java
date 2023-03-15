package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticularDropDownActiveorNot {

	
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement drop = driver.findElement(By.id("duration_d"));
		System.out.println(drop);
		
		List<WebElement>values=drop.findElements(By.tagName("option"));
		
		for(int r=0;r<values.size();r++)
		{
			String names=values.get(r).getText();
		
			values.get(r).click();
			
			if(values.get(r).isDisplayed())
			{
				System.out.println(names +" "+"Active");
			}
		
			else
			{
				System.out.println(names+ " "+"InAcitve");
			}
		
				
		}
		
		driver.close();
		
		
		
	}

}
