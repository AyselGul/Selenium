package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTableDemoQA {

               //  normlde //thead//th olurdu ancak bu tablo class isimleri ile organize edilmis
               //  3.   3.sutunun basligini yazdirin
               //  4. Tablodaki tum datalari yazdirin
              //  5. Tabloda kac cell (data) oldugunu yazdirin
              //  6. Tablodaki satir sayisini yazdirin
               //  7. Tablodaki sutun sayisini yazdirin
               //  8. Tablodaki 3.kolonu yazdirin
               //   9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
               //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin
    @Test
    public void test(){
        //  1. “https://demoqa.com/webtables” sayfasina gidin

        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));
        //  2. Headers da bulunan department isimlerini yazdirin

    }

}
