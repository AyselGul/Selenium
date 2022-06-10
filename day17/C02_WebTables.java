package tests.day17;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HMCampPage;
import utilities.Driver;

import java.util.List;

public class C02_WebTables {
    HMCampPage hmCampPage;
    HMCWebTablePage hmcWebTablePage;

    @Test
    public void loginTest(){
                   //● login( ) metodun oluşturun ve oturum açın.
                   //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
                   // ○ Username : manager
                   //  ○ Password : Manager1!
                      hmCampPage = new HMCampPage();
                      hmCampPage.girisYap();

    }

    @Test (priority = 1)
    public void table(){
        hmcWebTablePage = new HMCWebTablePage();
             //	○ Tüm table body’sinin boyutunu(sutun sayisi) bulun.          //tbody
             // header kisminda birinci satir ve altindaki altbasliklari(sutun) locate edelim ve kac adet var yazdiralim

             List<WebElement> headerDataList = hmcWebTablePage.headerDataList;
             System.out.println("Number's of columns " + headerDataList.size());
              System.out.println();

            //	○ Table’daki tum body’i ve başlıkları(headers) konsolda yazdırın.

              System.out.println("Whole body : "+ hmcWebTablePage.wholepageBody.getText());

        // Eger body'yi tek bir webelement olarak locate edersek
        // icindeki tum datalari getText() ile yazdirabiliriz
        // ancak bu durumda bu elementler ayri ayri degil,
        // body'nin icindeki tek bir String'in parcalari olurlar
        // dolayisiyla bu elementlere tek tek ulasmamiz mumkun olmaz
        // sadece contains method'u ile body'de olup olmadiklarini test edebiliriz.




        // eger her bir datayi ayri ayri almak istersek
        //  //tbody//td seklinde locate edip bir list'e atabiliriz

        List<WebElement> bodyData=hmcWebTablePage.bodyDataList;

        for (WebElement each : bodyData
             ) {
            System.out.println(each.getText());
        }
        System.out.println("*************************************************************");
        }


        @Test(priority = 2)
    public void printRows(){

              //	○ table body’sinde bulunan toplam satir(row) sayısını bulun.     //tbody//tr

            List<WebElement> wholeBodyRowList=hmcWebTablePage.wholebodyRowData;
            System.out.println(wholeBodyRowList.size());


            //	○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
            List<WebElement> wholeBodyRowList1=hmcWebTablePage.wholebodyRowData;
            for (WebElement each : wholeBodyRowList1
                 ) {
                System.out.println("Rows : "+ each.getText());
            }


            //	○ 4.satirdaki(row) elementleri konsolda yazdırın.
            System.out.println(hmcWebTablePage.fourthRowData.getText());
           // Driver.closeDriver();
        }



    }

