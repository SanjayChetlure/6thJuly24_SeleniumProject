package ExcelSheet;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex9_getDataByVeryfying_CellType
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\6th July 2024\\6thJuly Selenium.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		Cell s1 = sh.getRow(0).getCell(3);
		CellType type = s1.getCellType();
		
		//
		if(type==CellType.STRING)
		{
			String value = s1.getStringCellValue();
			System.out.println(value);
		}
		else if(type==CellType.NUMERIC)
		{
			double value = s1.getNumericCellValue();
			System.out.println(value);
		}
		else if(type==CellType.BOOLEAN)
		{
			boolean value = s1.getBooleanCellValue();
			System.out.println(value);
		}				
	}
}
