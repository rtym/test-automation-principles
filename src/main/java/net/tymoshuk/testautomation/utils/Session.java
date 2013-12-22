package net.tymoshuk.testautomation.utils;

import net.tymoshuk.testautomation.utils.selenium.Selenium;

import java.net.URL;

/**
 * Container singleton for session-wide parameters.
 *
 * @author roman@tymoshuk.net
 */
public enum Session
{
    INSTANCE;

    /**
     * Selenium.
     */
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
    public void setSelenium(final Selenium selenium)
    {
        this.selenium = selenium;
    }
}
