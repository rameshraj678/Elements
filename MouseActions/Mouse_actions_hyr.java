package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions_hyr {

	public static void main(String[] args) {
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origns=*");
	
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://eastgodavari.ap.gov.in/");
		driver.manage().window().maximize();
		WebElement ccc=driver.findElement(By.xpath("//a[text()='About District']"));
		WebElement ddd=driver.findElement(By.xpath("//a[text()='Administrative Setup']"));
		WebElement sss= driver.findElement(By.xpath("//a[text()='Villages']"));
		
		
		//mouse over 
		Actions ac = new Actions(driver); 
		ac 	// chaining 
		.moveToElement(ccc)
		.moveToElement(ddd)
		.moveToElement(sss)
		.click().perform();
		
		// right click 
		ac.contextClick(driver.findElement(By.xpath("//span[@class='icon-twitter']"))).perform();
		
		
		// double click
		
		
		}
	}


