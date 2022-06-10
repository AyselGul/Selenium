package tests.day19;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import static org.apache.poi.ss.usermodel.WorkbookFactory.create;

public class C04_NumberofRows {

    @Test
    public void test() throws IOException {
        // ulkeler excelindeki Sayfa1 ve Sayfa2'deki satir sayilarini
        // ve kullanilan satir sayilarini bulun

        String path= "src/test/java/pages/resources/ulkeler.xlsx";
        FileInputStream fileInputStream= new FileInputStream(path);
        Workbook workbook= create(fileInputStream);
        System.out.println("Row number of Page 1 : "+ workbook.getSheet("Sayfa1").getLastRowNum());
        System.out.println("Physically used row number of Page 1 : " + workbook.getSheet("Sayfa1").getPhysicalNumberOfRows());

        System.out.println("Row number of Page 2 : "+ workbook.getSheet("Sayfa2").getLastRowNum());
        System.out.println("Physically used row number of Page 2 : " + workbook.getSheet("Sayfa2").getPhysicalNumberOfRows());
    }

}
