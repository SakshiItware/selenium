package readPropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String filePath = System.getProperty("user.dir")+"//fb Test.properties";
		
		FileInputStream myFile = new FileInputStream(filePath);
		 Properties prop = new Properties();
		 prop.load(myFile);
		 
		 String value = prop.getProperty("lastName");
		 
		 System.out.println(value);
	}



}

