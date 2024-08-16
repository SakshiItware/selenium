package coverFoxTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath = System.getProperty("user.dir")+"//coverfoxdara.properties";
		FileInputStream myfile=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(myfile);
		String value = prop.getProperty("age");
		System.out.println(value);

	}

}
