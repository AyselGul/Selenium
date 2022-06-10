package tests.day15;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCampPage;
import utilities.Driver;

public class C04_HMCNegativetiveLoginTest {

    @Test
    public void negativeLoginTest(){

        //	https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");


        //	login butonuna bas
        HMCampPage hmCampPage= new HMCampPage();
        hmCampPage.hmcampHomePageLoginLinki.click();

        //	test data username: manager
        hmCampPage.usernameBox.sendKeys("manager1");

        //	test data password : manager1!
        hmCampPage.passwordBox.sendKeys("manager");
        hmCampPage.hmcLoginButton.click();

        //	Degerleri girildiginde sayfaya girilemedigini test nedin
        Assert.assertTrue(hmCampPage.errorMsgText.isDisplayed());
              Driver.closeDriver();

    }
}
