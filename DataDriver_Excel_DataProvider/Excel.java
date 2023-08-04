package DataDriver_Excel_DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel {

	public static void main(String[] args) throws Exception {
		
		// geting data through excel sheet 
		
			File excelfile = new File("D:\\RAMESH\\Eclipse_WorkSpace\\VenakateshSir\\Resources\\Book1.xlsx"); //step 1
	//		System.out.println(excelfile.exists()); // file availble or not  return true/false
			
			FileInputStream fis = new FileInputStream(excelfile); // step2
			XSSFWorkbook book= new XSSFWorkbook(fis); 			//step3
			XSSFSheet sheet=book.getSheet("Sheet1"); 				// step4
			int row=sheet.getPhysicalNumberOfRows();
			int coloum=sheet.getRow(0).getLastCellNum(); // header any like  | neme | Address| 
			
			
			for(int i=1;i<row;i++) {   // if header no "int i=0"
				for(int j=0;j<coloum;j++) {
					System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				}
			}
	
		}
	
	
	// get data through dataprovider 
			@Test(dataProvider="dataentry")
			public void login() {
				
			}
			
		
				@DataProvider(name="dataentry")
				public Object[][] passdata(){
				Object [][] data = new Object[2][2];
				
				data[0][0]="rameshraj";
				data[0][1]="shrayanaraj";
				
				data[1][0]="ramesh";
				data[1][1]= "sharayan";
				
				return data;
			}
		}
	
	
