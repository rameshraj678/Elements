package MouseActions_RobotClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Robot {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-origins-allow=");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		driver.navigate();
		driver.get("https://spreadsheetpage.com/calendar/");
		driver.manage().window().maximize();

		
		Robot robot = new Robot();
		// robot.keyPress(keyEvent.VK_TAB);
		// robot.keyPress(keyEvent.VK_DOWN);
		// robot.keyPress(keyEven.VK_ENTER);
		
			
		
	}

}
