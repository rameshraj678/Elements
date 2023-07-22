package My_School_Bot_cucumber;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extend {

	public static void main(String[] args) throws IOException {
		ExtentReports extendreports= new ExtentReports();
		ExtentSparkReporter esr=new ExtentSparkReporter("report.html");
		
//		File file = new File("report.html");
//		ExtentSparkReporter esr=new ExtentSparkReporter(file); // path created with file instance  
		
		extendreports.attachReporter(esr);
	
//		ExtentTest test1=extendreports.createTest("Test 1");
//		test1.pass("this is pass");
		
//		ExtentTest test2=extendreports.createTest("Test 2");
//		test2.log(Status.FAIL, "this is faild");
		
//		extendreports.createTest("Test 3").skip("This is fail"); // without create instance 
		
		
		List<String> list=new LinkedList<String>();
		list.add("ramesh");
		list.add("swathi");
		list.add("Shrayan");
		list.add("Reyan");
		
		Map<Integer, String>map=new HashMap<Integer, String>();
		map.put(100, "ramesh");
		map.put(101, "reyansh");
		map.put(102, "shyareya");
		
		
		Set<Integer>mapset=map.keySet();
		
		
		extendreports.createTest("test1")
		.log(Status.INFO, "<b>info1</b>")
		.log(Status.INFO, "<i>info2</i>")
		.log(Status.PASS, "pass")
		.log(Status.WARNING,"<i><b>warning message</i></b>" )
		.log(Status.FAIL, "<i>test Fail</i>")
		.log(Status.SKIP, "<b>test skip</b>")
		.log(Status.INFO, "<em>info3</em>")
		.log(Status.FAIL, "test fail2")
		.log(Status.PASS, "<mark>pass2</mark>");
		
		
//		test3.skip("This is fail");
		
		//  data varification 
		
//		String xmldata =
//			"<menu id=\"file\" value=\"File\">\r\n"
//			+ "  <popup>\r\n"
//			+ "    <menuitem value=\"New\" onclick=\"CreateNewDoc()\" />\r\n"
//			+ "    <menuitem value=\"Open\" onclick=\"OpenDoc()\" />\r\n"
//			+ "    <menuitem value=\"Close\" onclick=\"CloseDoc()\" />\r\n"
//			+ "  </popup>\r\n"
//			+ "</menu>";
		
		
//		String jsondata="{\"menu\": {\r\n"
//				+ "  \"id\": \"file\",\r\n"
//				+ "  \"value\": \"File\",\r\n"
//				+ "  \"popup\": {\r\n"
//				+ "    \"menuitem\": [\r\n"
//				+ "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\r\n"
//				+ "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\r\n"
//				+ "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\r\n"
//				+ "    ]\r\n"
//				+ "  }\r\n"
//				+ "}}";
		
//		extendreports.createTest("xml base date")
//		.info(MarkupHelper.createCodeBlock(xmldata, CodeLanguage.XML)); 
//		
//		extendreports.createTest("json date formate")
//		.info(MarkupHelper.createCodeBlock(jsondata,CodeLanguage.JSON));
	
		// data variation 
		
		extendreports.createTest("list based test").info(MarkupHelper.createOrderedList(list))
		.info(MarkupHelper.createUnorderedList(list));
		
		extendreports.createTest("map based test").info(MarkupHelper.createOrderedList(map))
		.info(MarkupHelper.createUnorderedList(map));
		
		extendreports.createTest("set based test").info(MarkupHelper.createOrderedList(mapset)) 
		.info(MarkupHelper.createUnorderedList(mapset));		
		
		extendreports.createTest("Heighliting Message")
		.info(MarkupHelper.createLabel("this is the heighliting message", ExtentColor.BLUE)); //  color heighlting 
		
		
			extendreports.flush(); // last line code use for extends report 
			// after execute completed report automatically shows in deafult browser 
			Desktop.getDesktop().browse(new File("report.html").toURI());
	
	
	
	}

}
