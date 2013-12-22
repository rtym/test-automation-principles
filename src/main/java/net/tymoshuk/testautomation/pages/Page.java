package net.tymoshuk.testautomation.pages;

import net.tymoshuk.testautomation.utils.selenium.Selenium;

/**
 * Created with IntelliJ IDEA.
 * User: roman
 * Date: 20.12.13
 * Time: 21:04
 * To change this template use File | Settings | File Templates.
 */
public abstract class Page
{
    /**
     * Selenium instance.
     */
    private Selenium selenium;

    /**
     * Constructor.
     *
     * @param selenium
     *          selenium
     */
    public Page(final Selenium selenium)
    {
        this.setSelenium(selenium);
    }

    /**
     * Sets' selenium instance.
     *
     * @param selenium
     */
    public void setSelenium(final Selenium selenium)
    {
        if (null == selenium)
        {
            throw new IllegalArgumentException("Cannot create page with null selenium instance.");
        }

        this.selenium = selenium;
    }

    /**
     * Gets' selenium instance.
     *
     * @return
     */
    public Selenium getSelenium()
    {
        return this.selenium;
    }

    /**
     * Visits current page in browser.
     */
    public abstract void visit();

    /**
     * Checks if current page is activated in browser.
     *
     * @return
     */
    public abstract boolean isActive();
}
