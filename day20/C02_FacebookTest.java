package tests.day20;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_FacebookTest extends TestBaseRapor {

@Test
    public void test(){
    extentTest=extentReports.createTest("facebook","Cannot be login with fake information");
    // 1 - https://www.facebook.com/ adresine gidin
    Driver.getDriver().get("https://www.facebook.com/");
    FacebookPage facebookPage = new FacebookPage();
    facebookPage.cookiesWebelement.click();

    //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin

    //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin

    Faker faker = new Faker();
    facebookPage.facebookEmailboxWebelement.sendKeys(faker.internet().emailAddress());
    extentTest.info("Faker class'indan email adres alindi");

    facebookPage.facebookPasswordboxWebelement.sendKeys(faker.internet().password());
    extentTest.info("Faker class'indan password alindi");

    facebookPage.facebookLoginBottonWebelement.click();
    extentTest.info("Login butonuna tiklandi");

    // 4-  Giris yapilamadigini test edin
    Assert.assertTrue(facebookPage.facebookGirilemediSekli.isDisplayed());
    extentTest.pass("Faker kutuphanedesinde ki methodlarla giris yapilamadi");




}
}
