package tests.day15;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookLogIn {

    @Test
    public void test(){
        // 1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.cookiesWebelement.click();

        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin

        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin

        Faker faker = new Faker();
        facebookPage.facebookEmailboxWebelement.sendKeys(faker.internet().emailAddress());
        facebookPage.facebookPasswordboxWebelement.sendKeys(faker.internet().password());
        facebookPage.facebookLoginBottonWebelement.click();

        // 4-  Giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.facebookGirilemediSekli.isDisplayed());

        Driver.closeDriver();

    }
}
