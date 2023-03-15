package Links;


import java.sql.Driver;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CountofTheLinks {

	public static void main(String[] args) throws InterruptedException {
	

		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		System.setProperty("Webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe\\");
		WebDriver ramesh = new ChromeDriver(option);
		
	
		ramesh.get("https://www.facebook.com/");
		
		ramesh.manage().window().maximize();
		
		ramesh.navigate();
		ramesh.get("https://www.google.co.in/");
		Thread.sleep(4000);
		
		
		List<WebElement>links= ramesh.findElements(By.tagName("a"));
		System.out.println("no of total links"+" "+links.size());
		
		ramesh.close();
		

	}

}
