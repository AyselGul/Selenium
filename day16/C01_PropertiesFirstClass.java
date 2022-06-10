package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_PropertiesFirstClass {

    @Test
    public void positiveLoginTest(){
        // Hotel My Camp sitesine positive login testini POM'a tam uygun olarak yapiniz

        //    Driver.getDriver().get("buraya properties dosyasina git HMCUrl'e karsilik gelen degeri getir");

        //	https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));


        //	login butonuna bas
        HMCampPage hmCampPage= new HMCampPage();
        hmCampPage.hmcampHomePageLoginLinki.click();

        //	test data username: manager
        hmCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));


        //	test data password : Manager1!
        hmCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hmCampPage.hmcLoginButton.click();

        Assert.assertTrue(hmCampPage.listOfUsersYaziElementi.isDisplayed());
        Driver.closeDriver();


    }
}
