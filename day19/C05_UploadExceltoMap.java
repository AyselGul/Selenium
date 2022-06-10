package tests.day19;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class C05_UploadExceltoMap {
    @Test
    public void test(){

        // dosya yolu ve sayfa ismi verilen bir excel sheet'i MAP olarak kaydeden
        // reusable bir method olusturalim

         String path="src/test/java/pages/resources/ulkeler.xlsx";
          String pageName="Sayfa1";


        System.out.println(C03_ReuseableExcelReadMethod.createMap(path,pageName));


        // olusturdugumuz map'i kullanarak Turkey'in bilgilerini yazdirin
         Map<String,String> countriesMap = C03_ReuseableExcelReadMethod.createMap(path,pageName);
        System.out.println(countriesMap.get("Turkey"));
        Assert.assertTrue(countriesMap.containsKey("Turkey"));

        // Listede Netherlands oldugunu testedin

        Assert.assertTrue(countriesMap.containsKey("Netherlands"));

    }
}
