package tests.day15;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverFirstTest {


    @Test
    public static void test() {

        // amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");

        // amazona gittigimizi test edelim
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));
        Driver.closeDriver();
    }


    @Test
    public void test01() {
        // bestbuy anasayfaya gidelim
        Driver.getDriver().get("https://www.bestbuy.com");


        // bestbuy'a gittigimizi test edelim
       Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("bestbuy"));

       Driver.closeDriver();

    }
}

