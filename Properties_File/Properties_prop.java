package Properties_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Properties_prop {

	public static void main(String[] args) throws IOException {

		File file = new File("ramesh.properties");
		if(!file.exists()) {
			file.createNewFile();
//			System.out.println(file.exists());
//			file.delete();
			
			
			Properties prop = new Properties();
			
//			prop.setProperty("ramesh", "raj");
//			prop.setProperty("Shrayan", "raj");
//			prop.setProperty("reyansh", "raj");
//			
//			FileOutputStream fos = new FileOutputStream(file);
//			prop.store(fos,"family members");
			
			FileInputStream fis = new FileInputStream(file);
			prop.load(fis);
//			Set<String>keys=prop.stringPropertyNames();
			Set<Object>keyss=prop.keySet();
			Collection<Object>values=prop.values();
			
			System.out.println(values);
//			System.out.println(keyss);
		}

	}

}
