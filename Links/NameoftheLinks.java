package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameoftheLinks {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver ramesh = new ChromeDriver();
		
		ramesh.get("https://www.google.com/");
		ramesh.manage().window().maximize();
		
		List<WebElement>links=ramesh.findElements(By.tagName("a"));
		
		System.out.println("no of the links"+ "  "+links.size()); // no of count code
		
		for(int r=0;r<links.size();r++) 
		{
		
			System.out.println(links.get(r).getText());
			
			
		}  
		
		ramesh.close();
		
		
		
		
		
	} 

}
