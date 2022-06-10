package tests.day19;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void test() throws IOException {
         String path ="src/test/java/pages/resources/ulkeler.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("Sayfa1");
        Row row = sheet.getRow(4);
        Cell cell= row.getCell(3);
        System.out.println(cell);
        // indexi 4 olan satirdaki, indexi 2 olan hucrenin Andorra la Vella oldugunu test ediniz

         String expectedData= "Andorra la Vella";
         Assert.assertEquals(cell.toString(),expectedData);




    }
}
