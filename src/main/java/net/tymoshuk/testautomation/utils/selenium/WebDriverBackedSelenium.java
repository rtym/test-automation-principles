package net.tymoshuk.testautomation.utils.selenium;

import net.tymoshuk.testautomation.utils.locators.Locatable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Default system-wide selenium.
 *
 * @author roman@tymoshuk.net
 */
public class WebDriverBackedSelenium extends org.openqa.selenium.WebDriverBackedSelenium implements Selenium
{
    /**
     * Web driver.
     */
    private WebDriver webDriver;

    /**
     * Base URL.
     */
    private String baseURL;

    /**
     * Constructor.
     *
     * @param baseDriver
     * @param baseUrl
     */
    public WebDriverBackedSelenium(final WebDriver baseDriver, final String baseUrl)
    {
        super(baseDriver, baseUrl);

        this.webDriver = baseDriver;
        this.baseURL = baseUrl;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void check(final Locatable locator)
    {
        super.check(locator.getLocator());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void click(final Locatable locator)
    {
        super.click(locator.getLocator());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void mouseOver(final Locatable locator)
    {
        final Actions action = new Actions(this.getWebDriver());
        action.moveToElement(this.getWebDriver().findElement((By) locator)).build().perform();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void type(final Locatable locator, final String value)
    {
        super.type(locator.getLocator(), value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getBaseURL()
    {
        return this.baseURL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebDriver getWebDriver()
    {
        return this.webDriver;
    }
}
