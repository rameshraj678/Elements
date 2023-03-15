package RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameoftheRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.driver.chrome", "D:\\finnysoftwares\\drivers\\chromedriver.exe");
		WebDriver ramesh = new ChromeDriver();
		ramesh.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		ramesh.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement>radios=ramesh.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("no of the radiobuttons"+radios.size());
		
	
			for(int r=0;r<radios.size();r++) {
				
			System.out.println(radios.get(r).getAttribute("name"));
					
				
		}
		
		ramesh.close();
		

}

}
