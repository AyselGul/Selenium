package tests.day19;

import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.apache.poi.ss.usermodel.WorkbookFactory.create;

public class C06_WriteExcel {
    @Test
    public void test() throws IOException {

        // Create a new column in Excel file of countries named "Nufus" and
        // set the 5th Row's of the countrie's population to 9000000

        String path="src/test/java/pages/resources/ulkeler.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);
        Workbook workbook= create(fileInputStream);


        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("Nufus");
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("Nufus");
        workbook.getSheet("Sayfa1").getRow(4).createCell(4).setCellValue("9000000");

        FileOutputStream fileOutputStream= new FileOutputStream(path);

        workbook.write(fileOutputStream);
    }
}
