package GenericPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile implements FrameWorkConstant{
		public String ToReadDatafromExcel (String Sheet1,int row,int cell) throws EncryptedDocumentException, IOException {
		   FileInputStream fis = new FileInputStream (Excel);
		Workbook workbook = WorkbookFactory.create(fis);
		String value = workbook.getSheet(Sheet1).getRow(row).getCell(cell).toString();
		return value;
	}


}