package tests.day15;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {
    @Test
    public void test(){

        // amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");

        // nutella icin arama yapalim
        AmazonPage amazonPage = new AmazonPage();

        amazonPage.amazonSearchBox.sendKeys("Nutella", Keys.ENTER);

        // sonucun nutella icerdigini test edelim

        String actualResult= amazonPage.amazonResulTextWebelement.getText();
        Assert.assertTrue(actualResult.contains("Nutella"));
        Driver.closeDriver();



    }

@Test
    public void test02(){

    // amazona gidelim
    Driver.getDriver().get("https://www.amazon.com");


    // Flower icin arama yapalim
    AmazonPage amazonPage = new AmazonPage();
    amazonPage.amazonSearchBox.sendKeys("Flower", Keys.ENTER);

    // sonucun Flower icerdigini test edelim

    String actualResult= amazonPage.amazonFlowerResultWebelement.getText();
    Assert.assertTrue(actualResult.contains("Flower"));
    Driver.closeDriver();
}

}
