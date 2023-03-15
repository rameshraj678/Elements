package OwnPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfunction {

	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\finnysoftwares\\drivers\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			WebElement gmail=driver.findElement(By.linkText("Gmail"));
			gmail.click();
			
			WebElement header=driver.findElement(By.xpath("/html/body/header"));
			WebElement sign=driver.findElement(By.linkText("Sign in"));
			sign.click();
			driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("rameshraj678");
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
			
		
			

	}

}
