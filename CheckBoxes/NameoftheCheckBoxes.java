package CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameoftheCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver driver chrome","D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver ramesh = new ChromeDriver();
		ramesh.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		ramesh.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement>check=ramesh.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("no of check boxes"+" "+check.size());
		
		for(int r=0;r<check.size();r++)
		{
			System.out.println("name of the check box"+"  "+check.get(r).getAttribute("value"));
			
		}
		
		ramesh.close();
	}

}
