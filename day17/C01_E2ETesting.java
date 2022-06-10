package tests.day17;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HMCampPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class C01_E2ETesting {

    HMCampPage hmCampPage;
    Actions actions;
    Select select;
    @Test
    public void createHotelTest(){

        //3. https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //4. Username textbox ve password metin kutularını locate edin ve asagidaki verileri girin.
        //	a. Username : manager
        //	b. Password  : Manager1!
        //5. Login butonuna tıklayın.
        actions=new Actions(Driver.getDriver());
        hmCampPage = new HMCampPage();

        hmCampPage.girisYap();

        //6. Hotel Management/Hotel List menusunden ADD HOTEL butonuna tiklayin
        hmCampPage.hotelManagementButton.click();
        hmCampPage.hotelListButton.click();
        hmCampPage.addHotelButton.click();

        //7. Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        hmCampPage.codeButton.click();
        hmCampPage.codeButton.sendKeys("Aslan");
        actions.sendKeys(Keys.TAB);
        hmCampPage.nameButton.sendKeys("aslan");
        actions.sendKeys(Keys.TAB);
        hmCampPage.adressButton.sendKeys("balikli gol");
        actions.sendKeys(Keys.TAB);
        hmCampPage.phoneButton.sendKeys("123-123-23");
        actions.sendKeys(Keys.TAB);
        hmCampPage.emailButton.sendKeys("gulenadam@gmail.com");
        actions.sendKeys(Keys.TAB).perform();
        hmCampPage.IDGroupButton.click();
        select= new Select(hmCampPage.IDGroupButton);
        select.selectByVisibleText("Hotel Type1");
        Driver.bekleme(3);


        //8. Save butonuna tıklayın.
        hmCampPage.saveButton.click();
        Driver.bekleme(3);
        //9. “Hotel was inserted successfully” textinin göründüğünü test edin.

        Assert.assertTrue(hmCampPage.HWasInsertText.isDisplayed());

        //10. OK butonuna tıklayın.
        hmCampPage.alertSaveButton.click();

    }
}
