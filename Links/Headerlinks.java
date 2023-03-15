package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headerlinks {

	public static void main(String[] args) {

		System.setProperty("Webdriver.driver.chrome", "D:\\finnysoftwares\\drivers\\chromedriver.exe");
		WebDriver ramesh = new ChromeDriver();
		
		ramesh.get("https://www.google.co.in/");
	
		ramesh.manage().window().maximize();
		
		WebElement header=ramesh.findElement(By.id("gb"));
		
		List<WebElement>headerlinks=header.findElements(By.tagName("a"));
		
		System.out.println("no of header links"+ headerlinks.size());
		
		for(int r=0;r<headerlinks.size();r++)
			
		{
			System.out.println("name of the header links"+ " "+ headerlinks.get(r).getText());
		}

		ramesh.close();
	}

}
