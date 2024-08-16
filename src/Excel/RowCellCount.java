package Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowCellCount {

	private static int lastRowNum;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream myfile = new FileInputStream("D:\sakshiExceldoc.xlsx");


Sheet mySheet=WorkbookFactory.create(myfile).getSheet("Sheet4");

int lastRowNume = mySheet.getLastRowNum();

//System.out.println(lastRowNum);
int totalNumberOfRows = lastRowNum;
short lastCellNum = mySheet.getRow(0).getLastCellNum();
//System.out.println(lastCellNum);
int totalNumberOfCoulmns = lastCellNum - 1;
for (int i = 0; i <= totalNumberOfRows; i++) {
for (int j = 0; j <= totalNumberOfCoulmns; j++) {
Cell myCell = mySheet.getRow(i).getCell(j);
CellType myCellType = myCell.getCellType();
if (myCellType == CellType.NUMERIC) {
System.out.print(myCell.getNumericCellValue() + " ");
} else if (myCellType == CellType.BOOLEAN) {
System.out.print(myCell.getBooleanCellValue() + " ");
} else if (myCellType == CellType.STRING) {
System.out.print(myCell.getStringCellValue() + " ");
}
}
System.out.println();
	}

}

}