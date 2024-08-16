package commonMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {

	// excelData
	// screenSHot
	// click
	// scroll
	// wait-->implicit
	
	//1.Scroll
	public static void scrollIntoView(WebDriver driver, WebElement element) {
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	//2.click
	public static void Clickon(WebDriver driver,WebElement element)
	{
		scrollIntoView(driver, element);
		element.click();
	}
	//3.ScreenShot
	public static void takeScreenShot(WebDriver driver, String fileName) throws
	IOException {

	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("D:\sakshiExceldoc.xlsx"
	 + fileName + ".png");
	FileHandler.copy(src, dest);
	}
	//exceldata 
	public static String read(String filePath, String sheetName, int rowNum, int cellNum)throws EncryptedDocumentException, IOException {
	FileInputStream myFile = new FileInputStream(filePath);
	String value =WorkbookFactory.create(myFile).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	return (value+"");
	}
	public static String readDataFromPropertiesFile(String key)throws IOException 
	{
		String filePath = System.getProperty("user.dir")+"//CoverData.properties";
		Properties prop= new Properties();
		
		Reader myfile = null;
		prop.load(myfile);
		String value =prop.getProperty(key);
		Reporter.log("Reading data from Property file",true);
		return value;
	}
	public static String readDataFromExcel(String filePath, String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile = new FileInputStream(filePath);
		String value = WorkbookFactory.create(myFile).getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return (value+"");
	}
}
		

