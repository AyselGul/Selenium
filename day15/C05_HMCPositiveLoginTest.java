package tests.day15;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCampPage;
import utilities.Driver;

public class C05_HMCPositiveLoginTest {

    @Test
            public void test(){

        //	https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");


        //	login butonuna bas
        HMCampPage hmCampPage= new HMCampPage();
        hmCampPage.hmcampHomePageLoginLinki.click();

        //	test data username: manager
        hmCampPage.usernameBox.sendKeys("manager");

        //	test data password : Manager1!
        hmCampPage.passwordBox.sendKeys("manager1!");
        hmCampPage.hmcLoginButton.click();
        Assert.assertTrue(hmCampPage.listOfUsersYaziElementi.isDisplayed());
        Driver.closeDriver();

    }

}
