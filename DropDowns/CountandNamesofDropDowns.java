package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountandNamesofDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement>dropdown=driver.findElements(By.tagName("select"));
		System.out.println("no of dropdowns"+" "+ dropdown.size()); 						  //no of dropdowns
		
//		int count =0;			
		
				for(int r=0;r<dropdown.size();r++)											//name of the dropdowns		
				{
			String shrayan =dropdown.get(r).getText();
			
			System.out.println(shrayan);
//			
//				if(dropdown.get(r).isDisplayed())  //////////////////////////////////\\\\\\\   displayed dropdowns
//					
//			{
//				count++;
//				
			}
//			
//		}
//		System.out.println("no of visibled dropdowns"+ " "+count );
//		System.out.println("no of in Visibled dropdowns"+ (dropdown.size()- count));
		
		driver.close();
	}

}
