package ExcelSheet;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex6_getAllDataInCol
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\6th July 2024\\6thJuly Selenium.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastRowIndex = sh.getLastRowNum();   //4
		
		//           1<=4
		for(int i=0; i<=lastRowIndex; i++) 
		{  //                        1          0
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}		
	}
}
