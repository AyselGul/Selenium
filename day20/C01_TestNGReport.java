package tests.day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C01_TestNGReport extends TestBaseRapor {

    @Test
    public void test() throws InterruptedException {

        extentTest=extentReports.createTest("Window Handle","Switch to 2. page");

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        extentTest.info("Sayfa'ya gidildi" );
        WebElement click=Driver.getDriver().findElement(By.xpath("//a[text()='Click Here']"));

        ReusableMethods.clickWithTimeOut(click,3);
        extentTest.info("Click Here butonuna basildi");

        ReusableMethods.switchToWindow("New Window");
        extentTest.info("Yeni sayfa'ya gecildi");

        String expectedTitle="New Window";
        String actualTitle= Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
        extentTest.pass("Title testi PASSED");


    }
}
