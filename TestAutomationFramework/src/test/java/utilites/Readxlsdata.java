package utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class Readxlsdata {

	@DataProvider(name = "bvtdata")

	public String[][] readxls(Method m) throws EncryptedDocumentException, IOException {
		String excelsheetName = m.getName();
		File excelfile = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\test.xlsx");
		FileInputStream fis = new FileInputStream(excelfile);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheetname = wb.getSheet(excelsheetName);

		int totalrows = sheetname.getLastRowNum();
		System.out.println("total rows are: " + totalrows);
		Row rowcells = sheetname.getRow(0);

		int totalcols = rowcells.getLastCellNum();
		System.out.println("Total columns are:" + totalcols);

		DataFormatter format = new DataFormatter();
		String testdata[][] = new String[totalrows][totalcols];

		for (int i = 1; i <= totalrows; i++) {
			for (int j = 0; j < totalcols; j++) {

				testdata[i - 1][j] = format.formatCellValue(sheetname.getRow(i).getCell(j));
				System.out.println(testdata[i - 1][j]);

			}

		}
		return testdata;

	}

}
