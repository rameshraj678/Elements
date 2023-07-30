package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class cookie {

	
	WebElement driver;
	
	@Test
	public void cookiesclass() {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origns=*");
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.yahoo.com/?guccounter=1");
		driver.manage().window().maximize();
		
		 Set<Cookie>allcoockies= driver.manage().getCookies();
		 System.out.println("all founded cookies: " +allcoockies.size());
		 System.out.println("--------------------------");
		 
		 
		 for(Cookie cooke:allcoockies) {
			 System.out.println("name of the cookie:"+cooke.getName());
			 System.out.println("path of the cooke:"+cooke.getPath());
			 System.out.println("Domien:"+cooke.getDomain());
			 System.out.println("value:"+cooke.getValue());
			 System.out.println("===============");
			 
		 }
		 
		 driver.manage().deleteAllCookies();
		 Set<Cookie>reamingcookies=driver.manage().getCookies();
		 System.out.println("after delet cookes"+reamingcookies.size());
		 
		 Set<Cookie>afterdeletecookies=driver.manage().getCookies();
		 System.out.println("after delete reamin cookies:"+afterdeletecookies.size());
		 
		 driver.quit();
	}
	
	
}
