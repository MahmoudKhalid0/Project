package org.example;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class UsersFromExcel {
    public static Object[][] getExcelData () throws Exception {
        File filePath = new File (System.getProperty ("user.dir") + "/Files/" + "Users.xlsx");
        FileInputStream file = new FileInputStream (filePath);
        XSSFWorkbook workbook = new XSSFWorkbook (file);
        XSSFSheet sheet = workbook.getSheetAt (0);
        int rowCount = sheet.getLastRowNum ();
        int columnCount = sheet.getRow (0).getLastCellNum ();
        Object[][] data = new Object[rowCount][columnCount];

        for (int i = 1; i <= rowCount; i++) {
            for (int j = 0; j < columnCount; j++)
                data[i - 1][j] = sheet.getRow (i).getCell (j).toString ();
        }
        workbook.close ();
        return data;
    }


}
