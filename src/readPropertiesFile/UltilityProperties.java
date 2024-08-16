package readPropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UltilityProperties {
	
	public static String readDataFromProertyFile(String Key) throws IOException 
    {
    	FileInputStream myfile=new FileInputStream(System.getProperty("user.dir")+"//coverFoxTest.properties");
    	Properties prop=new Properties();
    	prop.load(myfile);
    	String value = prop.getProperty(Key);
    	return value;
    }
    

}
