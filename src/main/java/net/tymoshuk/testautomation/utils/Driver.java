package net.tymoshuk.testautomation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opera.core.systems.OperaDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Support browser drivers.
 *
 * @author roman@tymoshuk.net
 */
public enum Driver
{
    /**
     * Firefox default driver.
     */
    FIREFOX
    {
        /**
         * {@inheritDoc}
         */
        @Override
        public WebDriver createWebDriver()
        {
            return new FirefoxDriver();
        }
    },

    /**
     * Chrome default driver.
     */
    CHROME
    {
        /**
         * {@inheritDoc}
         */
        @Override
        public WebDriver createWebDriver()
        {
            return new ChromeDriver();
        }
    },

    /**
     * IE default driver.
     */
    IE
    {
        /**
         * {@inheritDoc}
         */
        @Override
        public WebDriver createWebDriver()
        {
            return new InternetExplorerDriver();
        }
    },

    /**
     * Opera default driver.
     */
    OPERA
    {
        /**
         * {@inheritDoc}
         */
        @Override
        public WebDriver createWebDriver()
        {
            return new OperaDriver();
        }
    };

    /**
     * Gets' selenium driver.
     * @see WebDriver
     *
     * @return
     *      web driver
     */
    public abstract WebDriver createWebDriver();

    /**
     * Gets' driver name.
     *
     * @return
     *      driver name
     */
    public String getName()
    {
        return String.valueOf(this);
    }
}
