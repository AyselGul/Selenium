package tests.day19;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExcel2 {
    @Test
    public void test() throws IOException {

        // ulkeler excelinin 3.satirini yazdirin
        String path = "src/test/java/pages/resources/ulkeler.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        for (int i = 0; i < 4; i++) {
            System.out.println(workbook.getSheet("Sayfa1").getRow(2).getCell(i).toString());
        }

        System.out.println("****************************");
        // ilk 20 ulkenin baskentlerinin turkce isimlerini yazdirin

        for (int i = 0; i <= 20; i++) {
            System.out.println(workbook.getSheet("Sayfa1").getRow(i).getCell(3));

        }

    }
}



