package dataProviders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Utility {
	@DataProvider(name = "Family member")
	public String[][] myData() throws EncryptedDocumentException, IOException {
	String testData[][] = readDataFromExcel("excelTest", "Sheet6");
	return testData;
	}
	public static String[][] readDataFromExcel(String excelFileName, String sheetName)

	throws EncryptedDocumentException, IOException {
	String path = System.getProperty("user.dir") + "\\" + excelFileName + ".xlsx";
	FileInputStream myFile = new FileInputStream(path);
	 org.apache.poi.ss.usermodel.Sheet mySheet = WorkbookFactory.create(myFile).getSheet(sheetName);
	int rowCount =  mySheet.getLastRowNum();
	int cellCount = mySheet.getRow(0).getLastCellNum() - 1;
	System.out.println(rowCount);
	System.out.println(cellCount);
	String data[][] = new String[rowCount + 1][cellCount + 1];
	for (int i = 0; i <= rowCount; i++) {
	for (int j = 0; j <= cellCount; j++) {
	String value =
	mySheet.getRow(i).getCell(j).getStringCellValue();
	data[i][j] = value;
	}
	}
	return data;
}
}