package Windowhandle;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class searchkeyword {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-origins-allow=");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		//single window /two windows 
//		String parentwindow=driver.getWindowHandle();
//		Thread.sleep(2000);
//		driver.findElement(By.id("newWindowBtn")).click();
//		Thread.sleep(2000);
//		Set<String>windowhandels=driver.getWindowHandles();
//		
//		for (String  windowhandel: windowhandels) {
//			if(!windowhandel.equals(parentwindow)) {
//			driver.switchTo().window(windowhandel);
//			driver.manage().window().maximize();
//			driver.findElement(By.id("firstName")).sendKeys("rameshraj");
//			Thread.sleep(2000);
//			driver.close(); //present window only close 
//			
			
//		     }
//		}
//			driver.switchTo().window(parentwindow);
//			driver.findElement(By.id("name")).sendKeys("welcome parent window");
//			Thread.sleep(2000);
//			driver.close();
			//		driver.quit(); // all windows close 
			
			
			
			// tab / same single window operations 
			String parentwindow=driver.getWindowHandle();
			Thread.sleep(2000);
			driver.findElement(By.id("newTabBtn")).click();
			Thread.sleep(2000);
			Set<String>windowhandels=driver.getWindowHandles();
			
			for (String  windowhandel: windowhandels) {
				if(!windowhandel.equals(parentwindow)) {
					driver.switchTo().window(windowhandel);
					driver.findElement(By.id("alertBox")).click();
					driver.switchTo().alert().accept();
					driver.manage().window().maximize();
					Thread.sleep(2000);
					driver.close(); //present window only close 
				
				}
			}
			
			driver.switchTo().window(parentwindow);
			driver.findElement(By.id("name")).sendKeys("welcome parent window");
			Thread.sleep(2000);
			
			
			
		}
		
}


		
		
		


