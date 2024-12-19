package ExcelSheet;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3_getColSizeInARow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\6th July 2024\\6thJuly Selenium.xlsx");
		
		int colSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getLastCellNum();
		System.out.println(colSize);
	}
}
