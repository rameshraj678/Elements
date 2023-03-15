package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLofEveryLink {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("Webdriver.chrome.driver","D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe" );
		
		WebDriver ramesh =new ChromeDriver();
		ramesh.get("https://www.mercurytravels.co.in/");
		Thread.sleep(3000);
		ramesh.manage().window().maximize();
		
		
		
		List<WebElement>links=ramesh.findElements(By.tagName("a"));
		System.out.println("no of links"+" "+links.size());
		
		for(int r=0; r<links.size();r++)
		{
		
			if(links.get(r).isDisplayed()) 
			{
				
				String name = links.get(r).getText();
				links.size();
				links.get(r).click();
				String url= ramesh.getCurrentUrl();	
				System.out.println("URL Name"+" "+url);
				ramesh.navigate().back();
				links=ramesh.findElements(By.tagName("a"));
			
				Thread.sleep(4000);
				ramesh.quit();
				
			}
				
		}
			
			
				
		
			

	}

}
