package Screenshots;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class screenshots {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver(option);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		//File
//		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //or 
		
		TakesScreenshot screenshots=(TakesScreenshot)driver; //type cast 
//		File sourcefile =screenshots.getScreenshotAs(OutputType.FILE);
//		File destinifile=new File("./Screenshots/proff/image.jpeg");
//		FileUtils.copyFile(sourcefile,destinifile);
//		
		
		// BASE64 formate
//		String sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64); 
//		String base64decode=screenshots.getScreenshotAs(OutputType.BASE64); 
//		// base64 encoded string so we should convert decode
//		//to convert byate array and decode
//		byte[] bytearray =Base64.getDecoder().decode(base64decode); // additinal code
//		
//		File destinyfile = new File("./Screenshots/proff/image.jpeg");
//		FileOutputStream fos=new FileOutputStream(destinyfile);
//		fos.write(bytearray);
//		fos.close(); //should close after fileoutputstream
//		System.out.println("base65 screen");
		
		
		//byte[] formate
		byte[] bytearray=screenshots.getScreenshotAs(OutputType.BYTES);
		File destiny=new File("./Screenshots/image.jpeg");
		FileOutputStream fos=new FileOutputStream(destiny);
		fos.write(bytearray);
		fos.close();
		System.out.println("bytes screen");
		
		
		
		
		
		driver.quit();
		
		
		
		

	}

}
