package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTesti {
    HMCampPage hmCampPage;

    //   3 Farkli test Methodunda 3 senaryoyu test et

    //	- yanlis Kullanici    - dogru Sifre
    //	- yanlis Sifre    - dogru kullaniciadi
    //	- yanlis Sifre Ve yanlis Kullanici
    //test data yanlis username: manager1 , yanlis password : manager1!
    //2) https://www.hotelmycamp.com adresine git
    //3) Login butonuna bas
    //4) Verilen senaryolar ile giris yapilamadigini test et

    @Test
    public void invalidUserNameTest() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hmCampPage = new HMCampPage();
        hmCampPage.hmcampHomePageLoginLinki.click();
        hmCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCInvalidUsername"));
        hmCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmCampPage.hmcLoginButton.click();
        Assert.assertTrue(hmCampPage.errorMsgText.isDisplayed());


    }

    @Test
    public void invalidPasswordTest() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hmCampPage = new HMCampPage();
        hmCampPage.hmcampHomePageLoginLinki.click();
        hmCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hmCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCInvalidPassword"));
        hmCampPage.hmcLoginButton.click();
        Assert.assertTrue(hmCampPage.errorMsgText.isDisplayed());
        Driver.closeDriver();
    }


    @Test
    public void invalidUserAndPasswordTest() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hmCampPage = new HMCampPage();
        hmCampPage.hmcampHomePageLoginLinki.click();
        hmCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCInvalidUsername"));
        hmCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCInvalidPassword"));
        hmCampPage.hmcLoginButton.click();
        Assert.assertTrue(hmCampPage.errorMsgText.isDisplayed());
        Driver.closeDriver();
    }
}