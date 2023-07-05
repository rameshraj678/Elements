package Data_Calender;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calander_date {

	
	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		

	
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origns=*");
	
	WebDriver driver =new ChromeDriver(option);
	driver.get("https://phptravels.net/#");
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("#departure")).click();
	String year="September 2023";
	String date= "19";
	
	while(true) {
		String text= driver.findElement(By.xpath("//body[1]/div[9]/div[1]/table[1]/thead[1]/tr[1]/th[2]")).getText();
		if(text.equals(year)) {
			break;
		}
		else {
			driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[9]/div[1]/table/thead/tr[1]/th[3]")).click();
			
		}
	}
			WebElement s=driver.findElement(By.xpath("//body[1]/div[9]/div[1]/table[1]/tbody[1]/tr/td[contains(text(),"+date+")]"));
			Thread.sleep(2000);
			s.click();
//		for(WebElement ele:alldates) {		
//			System.out.println(ele.getText());
//		}
	
	}

}
