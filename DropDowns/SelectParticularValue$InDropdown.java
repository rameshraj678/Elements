package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectParticularValue$InDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement drop=driver.findElement(By.id("duration_d"));
		
//		drop.sendKeys("4Nights / 5Days"); //////\\\\\\\\\  //optional 
		
		Select st = new Select(driver.findElement(By.xpath("//*[@name='nights']")));		
		st.selectByIndex(6);
	
		
		WebElement ddp=driver.findElement(By.id("themes"));
	
//		ddp.sendKeys("nature"); ///////\\\\\\\  //optional 
		
		Select sst =new Select(driver.findElement(By.id("themes")));
		sst.selectByIndex(4);
		
//		st.selectByValue("18");
//		st.selectByVisibleText("");
//		List<WebElement> data=drop.findElements(By.tagName("option"));
//		
		
//		for(WebElement ele:data) 					//for each statement 
//		{				
//			System.out.println(ele.getText());
			
//			if(ele.getText().equalsIgnoreCase("Nature")) 
//			{
//				ele.click();
			
		
		Thread.sleep(3000);
		driver.close();
	}
		
}
