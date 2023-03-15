package CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CountofCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		

		
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			
			System.setProperty("Webdriver.chrome.driver","D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
			WebDriver ramesh = new ChromeDriver(option);
			ramesh.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
			ramesh.manage().window().maximize();
			Thread.sleep(3000);
			
			List<WebElement>check=ramesh.findElements(By.xpath("//input[@type='checkbox']"));
			
			System.out.println("no of check boxes"+check.size());
			
			
		
				
							
				ramesh.close();
			
			
			
	}

}
