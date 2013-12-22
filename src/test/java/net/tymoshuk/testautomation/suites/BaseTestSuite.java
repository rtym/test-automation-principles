package net.tymoshuk.testautomation.suites;

import net.tymoshuk.testautomation.utils.Driver;
import net.tymoshuk.testautomation.utils.Session;
import net.tymoshuk.testautomation.utils.selenium.WebDriverBackedSelenium;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.AfterClass;

/**
 * Created with IntelliJ IDEA.
 * User: roman
 * Date: 22.12.13
 * Time: 22:44
 * To change this template use File | Settings | File Templates.
 */
public class BaseTestSuite
{
    public static final String BASE_URL = "http://ta-demo.tymoshuk.net/";

    @AfterClass
    public static void deinitialize()
    {
        Session.INSTANCE.getSelenium().stop();
    }

    public static void initialize(final Driver driver)
    {
        Session.INSTANCE.setSelenium(new WebDriverBackedSelenium(driver.createWebDriver(), BASE_URL));
    }
}
