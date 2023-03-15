package RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoofRadioButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","D:\\finnysoftwares\\drivers\\chromedriver.exe");
		WebDriver ramesh = new ChromeDriver();
		ramesh.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		ramesh.manage().window().maximize();
		
		List<WebElement>radio=ramesh.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("no of radio button"+radio.size());
		
		ramesh.close();
		
		
	}

}
