package net.tymoshuk.testautomation.utils;

import org.openqa.selenium.WebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: roman
 * Date: 22.12.13
 * Time: 19:14
 * To change this template use File | Settings | File Templates.
 */
public enum Session
{
    INSTANCE;

    private WebDriver driver;

    /**
     * Gets' web driver.
     *
     * @return
     *      web driver
     */
    public WebDriver getDriver()
    {
        return this.driver;
    }

    /**
     * Sets' web driver.
     *
     * @param driver
     *          web driver
     */
    public void setDriver(final WebDriver driver)
    {
        this.driver = driver;
    }
}
