package net.tymoshuk.testautomation;

import net.tymoshuk.testautomation.utils.Driver;

import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Selenium;

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

        final String baseUrl = "http://www.google.com";

        for (final Driver driver : Driver.values())
        {
            log.info("Proceeding with driver ".concat(driver.getName()));

            final Selenium selenium = new WebDriverBackedSelenium(driver.createWebDriver(), baseUrl);

            selenium.open(baseUrl);
            selenium.type("name=q", "cheese");
            selenium.click("name=btnG");

            (new WebDriverWait(((WebDriverBackedSelenium) selenium).getWrappedDriver(), 10)).until(new ExpectedCondition<Boolean>()
            {
                @Override
                public Boolean apply(final WebDriver webDriver)
                {
                    return webDriver.getTitle().toLowerCase().startsWith("cheese");
                }
            });

            log.info("Closing browser ".concat(driver.getName()));

            selenium.stop();
        }

        log.info("Finishing application");
    }
}
