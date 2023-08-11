package Properties_File;

import java.io.File;
import java.io.IOException;

public class Files {

	public static void main(String[] args) throws Exception {
	
		
		File file =new File("./ramesh.txt");  // relative path ./ only 
//		File file = new File("C:\\Users\\aidni\\OneDrive\\Desktop\\Resumes\\ramesh.txt"); // abosulte path // farward double slash
		if(!file.exists()) {
		file.createNewFile();
		}
		System.out.println(file.exists());
//		System.out.println(file.exists());
	}

}
