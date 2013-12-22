package net.tymoshuk.testautomation.utils.selenium;

import net.tymoshuk.testautomation.utils.locators.Locatable;

import org.openqa.selenium.WebDriver;

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
     * Constructor.
     *
     * @param baseDriver
     * @param baseUrl
     */
    public WebDriverBackedSelenium(final WebDriver baseDriver, final String baseUrl)
    {
        super(baseDriver, baseUrl);

        this.webDriver = baseDriver;
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
    public void type(final Locatable locator, final String value)
    {
        super.type(locator.getLocator(), value);
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
