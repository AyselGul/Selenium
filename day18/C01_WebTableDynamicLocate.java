package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HMCampPage;

public class C01_WebTableDynamicLocate {
         HMCampPage hmCampPage;
         HMCWebTablePage hmcWebTablePage;

    @Test
    public void rowDataTest(){
        // 1.method satir numarasi verdigimde bana o satirdaki datalari yazdirsin
        //  5. satir yazdiralim
        hmCampPage= new HMCampPage();
        hmCampPage.girisYap();
        hmcWebTablePage= new HMCWebTablePage();

        WebElement row=hmcWebTablePage.satirGetir(5);
        System.out.println(row.getText());

    }
    @Test
    public void cellTest(){
        // 2. method satir no ve data numarasi girdigimde verdigim datayi yazdirsin

        WebElement cellData= hmcWebTablePage.cellData(5,6);
        System.out.println("Istenen hucre datasi : "+ cellData.getText());
    }
    @Test
    public void sutunGetir(){
        // 3. sutun numarasi verdigimde bana tum sutunu yazdirsin
        hmCampPage= new HMCampPage();
        hmCampPage.girisYap();
        hmcWebTablePage= new HMCWebTablePage();
        hmcWebTablePage.sutunYazdir(5);

    }



}
