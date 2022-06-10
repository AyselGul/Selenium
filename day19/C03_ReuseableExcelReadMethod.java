package tests.day19;

import org.apache.commons.collections4.map.TransformedMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C03_ReuseableExcelReadMethod {

    // dosya yolu,sayfa ismi ve satir, hucre indexini verince hucre bilgisini dondursun


    public static Cell getCell(String path, String sayfaIsmi, int satirIndex, int hucreIndex) {
        Cell cell = null;
        String path1 = "src/test/java/pages/resources/ulkeler.xlsx";
        try {
            FileInputStream fileInputStream = new FileInputStream(path1);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            cell = workbook.getSheet(sayfaIsmi).getRow(satirIndex).getCell(hucreIndex);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cell;
    }

    public static Map<String, String> createMap(String path, String pageName) {

        Workbook workbook =null;
        String key = "";
        String value = "";

        Map<String, String> excelMap = new TreeMap<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);


        } catch (IOException e) {
            e.printStackTrace();

        }

        int rowNumber = workbook.getSheet(pageName).getLastRowNum();
        for (int i = 0; i <= rowNumber; i++) {
            key = workbook.getSheet(pageName).getRow(i).getCell(0).toString();
            value = workbook.getSheet(pageName).getRow(i).getCell(1).toString() +
                    ", " + workbook.getSheet(pageName).getRow(i).getCell(2).toString() +
                    ", " + workbook.getSheet(pageName).getRow(i).getCell(3).toString();
            excelMap.put(key,value);

        }
        return excelMap;
    }
}
