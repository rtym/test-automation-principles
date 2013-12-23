package net.tymoshuk.testautomation.suites;

import net.tymoshuk.testautomation.SignInTest;
import net.tymoshuk.testautomation.utils.Driver;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test suites for Firefox.
 *
 * @author roman@tymoshuk.net
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({SignInTest.class})
public class FirefoxTestSuite extends BaseTestSuite
{
    @BeforeClass
    public static void initialize()
    {
       initialize(Driver.FIREFOX);
    }
}
