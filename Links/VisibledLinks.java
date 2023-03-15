package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibledLinks {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver ramesh = new ChromeDriver();
		ramesh.get("https://www.google.com/");
		ramesh.manage().window().maximize();
		
		List<WebElement>links=ramesh.findElements(By.tagName("a"));
		System.out.println("no of total links"+ links.size());
		
		int count =0;
		for(int r=0;r<links.size();r++)
		{
		
			if(links.get(r).isDisplayed())
			{
				
			count++;	
			}
			
		}
		
		System.out.println("no of visibled links"+ count);
		System.out.println("no of Invisibled links"+ (links.size()-count));
		
		ramesh.close();
	}

}
