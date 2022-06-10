package tests.day19;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_ReusableRunner {

    @Test
    public void test(){
        // Ulkeler excelindeki, Sayfa1'de
        // 11.index'deki satirin, 2.indexdeki hucresinin Azerbaycan oldugunu test edin
        String path= "src/test/java/pages/resources/ulkeler.xlsx";
        String expectedCountry="Azerbaycan";
        String actualCountry= C03_ReuseableExcelReadMethod.getCell(path,"sayfa1",11,2).toString();
        Assert.assertTrue(actualCountry.contentEquals(expectedCountry));

    }
}
