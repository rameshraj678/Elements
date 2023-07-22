package JavacriptExecutot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavacriptExe {

	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-origins-allow=");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		// document.getElementId('email'); >>>>>  Id
		//document.getElementsByName('email')[0]; >>>>>> name
		//document.getElementsByClassName('inputtext _55r1 _6luy')[0] >>>>>>>>  ClassName
		//document.getElementByTagName('input')[2]; >>>>>>>>>>>>>. Tagname
		// document.querySelector('#email');>>>>>>>>..... css seclector
		// document.evaluate(xpathExpression, contextNode, namespaceResolver.resultType,result).singleNode; >>>>>>>... xpath creation path
		
		//  //  "document.evaluate("//*[@id='email']",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;"
		
		/* heiglt  special function (document.getElementById('email').setAttribute('style','border:2px red solid;background:yellow'););
		 * document.getElementById('email').setAttribute('style','border:2px red solid;background:yellow;color:white'(text color);
		 * 
		 * 
		//Typecast>>>>>> we can user ChromeDriver driver=new ChromeDriver(); but not import webdriver methods so, that we could typecast
		 * JavacriptExecutor == is a interface, it is proved by Selinium so that why we do typecase
	//	  scrolling  special funciton in javascriptExecutor 
		   scroll/scrollTo 0-500>>>> from starting
		   scrollBy   0--500 >>>> from where to 500 scroll down 
		   scrollIntoView  .... particular text or tab 
		   
		   forward>>>>>>	js.executeScript("window.history.back()");
		   backword>>>>> js.executeScript("window.history.forward()");
		*/
		JavascriptExecutor excutor=(JavascriptExecutor)driver;
//		WebElement element=(WebElement)excutor.executeScript("return document.evaluate(\"//*[@id='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;");
//		element.sendKeys("xpath");
		
		// values and actions
		
//		excutor.executeScript("document.getElementById('email')setAttribute('style','border:3px red solid;background:yellow');");
//		excutor.executeAsyncScript("document.getElementById('pass').value='Raj';");
//		excutor.executeAsyncScript("document.getElementById('u_0_5_fi').click");
		

		excutor.executeScript("document.getElementById('email').style.border='5px red solid';");
		Thread.sleep(3000);
		excutor.executeScript("document.getElementById('email').style.background='yellow';");
		
//		excutor.executeScript("document.getElementById('email').setAttribute('style','border:2px red solid;background:yellow');");
		
		
	}
}
