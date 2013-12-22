package net.tymoshuk.testautomation.suites;

import net.tymoshuk.testautomation.LoginPageTest;
import net.tymoshuk.testautomation.utils.Driver;
import net.tymoshuk.testautomation.utils.Session;
import net.tymoshuk.testautomation.utils.selenium.WebDriverBackedSelenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test suites for Opera.
 *
 * @author roman.tymoshuk.net
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({LoginPageTest.class})
@Ignore
public class OperaTestSuite
{
    @BeforeClass
    public static void initialize()
    {
        Session.INSTANCE.setSelenium(new WebDriverBackedSelenium(Driver.OPERA.createWebDriver(), "http://localhost/wordpress/"));
    }

    @AfterClass
    public static void deinitialize()
    {
        Session.INSTANCE.getSelenium().stop();
    }
}
