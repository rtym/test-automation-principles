package net.tymoshuk.testautomation;

import net.tymoshuk.testautomation.pages.dashboard.DashboardPage;
import net.tymoshuk.testautomation.pages.login.LoginPage;
import net.tymoshuk.testautomation.utils.Driver;
import net.tymoshuk.testautomation.utils.User;
import net.tymoshuk.testautomation.utils.selenium.Selenium;
import net.tymoshuk.testautomation.utils.selenium.WebDriverBackedSelenium;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger log = Logger.getLogger(App.class.getName());

    public static void main( String[] args )
    {
        log.info("Starting application");

        final String baseUrl = "http://localhost/wordpress/";

        for (final Driver driver : Driver.values())
        {
            log.info("Proceeding with driver ".concat(driver.getName()));

            final Selenium selenium = new WebDriverBackedSelenium(driver.createWebDriver(), baseUrl);

            LoginPage loginPage = new LoginPage(selenium)
            {{
                this.visit();
            }};

            assert loginPage.isActive();

            User user = new User()
            {{
                this.setUsername("rtym");
                this.setPassword("rtym");
            }};

            DashboardPage dashboardPage = loginPage.loginWithCorrectCredentials(user, true);

            assert dashboardPage.isActive();

            log.info("Closing browser ".concat(driver.getName()));

            selenium.stop();
        }

        log.info("Finishing application");
    }
}
