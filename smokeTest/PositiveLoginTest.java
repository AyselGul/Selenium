package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTest {

    HMCampPage hmCampPage;
    @Test
    public void positiveLoginTest(){
        //	https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        //	login butonuna bas
        hmCampPage = new HMCampPage();
        hmCampPage.hmcampHomePageLoginLinki.click();

        //test data username: manager
        hmCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));

        //test data password : Manager1!
        hmCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmCampPage.hmcLoginButton.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hmCampPage.listOfUsersYaziElementi.isDisplayed());
        Driver.closeDriver();


    }
}
