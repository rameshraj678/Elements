package Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTittleLink {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver ramesh = new ChromeDriver();
		ramesh.get("https://www.google.com/");
		ramesh.manage().window().maximize();
		
		ramesh.findElement(By.linkText("Gmail")).click();
		String expected="Gmail";
		String actual=ramesh.getTitle();
		System.out.println("Actual");
		
		if(expected.contains(actual)) {
			
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		ramesh.close();
	}

}
