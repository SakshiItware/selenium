package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
  @DataProvider(name = "teacher")
  
  public String[][] myData() {
	  String data[][]= {{"Sakshi","Itware","7397955171"},{"Rakesh","Itware","8888888888",},
	  {"Velocity","Pune","1234567890"}};
	  return data;
	  
	  }
  @DataProvider(name = "Student")
  
  public String[][] myData1(){
	  String data[][]= {{"Pranay","Nilawar","83083161597"},{"Varsha","Gurule","9999999999"},
	  { "Parachi", "Jadhav", "7777777777" } };
	  
	  return data;
	  
	  }
  
  
  
  }

