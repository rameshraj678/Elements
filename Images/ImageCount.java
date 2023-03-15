package Images;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageCount {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.driver.chrome","D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver ramesh =  new ChromeDriver();
		ramesh.get("https://www.mercurytravels.co.in/");
		ramesh.manage().window().maximize();
		Thread.sleep(3000);
	
				
		List<WebElement>images=ramesh.findElements(By.tagName("img"));
		System.out.println("no of images"+images.size());
		
		ramesh.close();
		

	}

}
