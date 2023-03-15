package CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticularCheckBoxActiveorNot {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver driver chrome","D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver ramesh = new ChromeDriver();
		ramesh.get("https://www.automationtestinginsider.com/2019/08/student-registration-form.html");
		ramesh.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement  student =ramesh.findElement(By.xpath("//*[@value='Drawing']"));
		student.click();
		
		if(student.isSelected())
		{
			
			System.out.println("Working good");
		}
		else
			
		{
			System.out.println("Working not good");
		}
		
		ramesh.close();
		
	
		
		
		
	}

}
