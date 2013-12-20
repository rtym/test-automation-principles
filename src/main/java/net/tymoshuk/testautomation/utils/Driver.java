package net.tymoshuk.testautomation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opera.core.systems.OperaDriver;

/**
 * Created with IntelliJ IDEA.
 * User: roman
 * Date: 20.12.13
 * Time: 19:37
 * To change this template use File | Settings | File Templates.
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
    // CHROME
    // {
    //     /**
    //      * {@inheritDoc}
    //      */
    //     @Override
    //     public WebDriver createWebDriver()
    //     {
    //         return new ChromeDriver();
    //     }
    // };

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
