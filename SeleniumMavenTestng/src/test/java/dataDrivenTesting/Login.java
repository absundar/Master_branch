package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Login {
@Test(dataProvider ="logindata")
public void practice(String username, String password) throws EncryptedDocumentException, IOException {
 final String filePath= "src/test/resources/logindata.xlsx";
	FileInputStream fis = new FileInputStream("filePath");
	Workbook workbook =  WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("Credentials");
	
	int rowCount= sheet.getLastRowNum();
	int columnCount = sheet.getRow(0).getLastCellNum();
}

}
