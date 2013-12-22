package net.tymoshuk.testautomation.utils;

import com.thoughtworks.selenium.Selenium;

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

    private Selenium selenium;

    /**
     * Gets' selenium driver.
     *
     * @return
     *      selenium driver
     */
    public Selenium getSelenium()
    {
        return this.selenium;
    }

    /**
     * Sets' selenium driver.
     *
     * @param selenium
     *          selenium driver
     */
    public void setDriver(final Selenium selenium)
    {
        this.selenium = selenium;
    }
}
