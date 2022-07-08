package homework7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


public class Legume {
	
	public void writePropertiesFile() throws IOException {
		try {
			OutputStream outPut = new FileOutputStream("legume.properties");
			Properties legum = new Properties();
			legum.setProperty("cartof", "82");
			legum.setProperty("morcov", "43");
			legum.setProperty("castravete", "11");
			legum.setProperty("zucchini", "17");
			legum.setProperty("conopida", "25");
			
			legum.store(outPut, "salvare");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	public boolean readPropertiesFile(String key) throws IOException   {
		InputStream inputStream = new FileInputStream("legume.properties");
		Properties legum = new Properties();
		legum.load(inputStream);
	
		if(legum.containsKey(key)) {
			System.out.println("Leguma aleasa de tine are: " + legum.getProperty(key)+ "kcal");

			return true;
		}else {
			System.out.println("Nu vindem aceasta leguma. Alegeti alta ");
			return false;
		}
	}
	
	
}
