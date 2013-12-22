package net.tymoshuk.testautomation.pages;

import com.thoughtworks.selenium.Selenium;

/**
 * Created with IntelliJ IDEA.
 * User: roman
 * Date: 20.12.13
 * Time: 21:04
 * To change this template use File | Settings | File Templates.
 */
public abstract class Page
{
    private Selenium selenium;

    public Page(final Selenium selenium)
    {
        this.setSelenium(selenium);
    }

    public void setSelenium(final Selenium selenium)
    {
        this.selenium = selenium;
    }

    public Selenium getSelenium()
    {
        return this.selenium;
    }

    public abstract void visit();

    public abstract boolean isActive();
}
