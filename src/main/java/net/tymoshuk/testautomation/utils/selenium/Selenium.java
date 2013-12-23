package net.tymoshuk.testautomation.utils.selenium;

import net.tymoshuk.testautomation.utils.locators.Locatable;

import org.openqa.selenium.WebDriver;

/**
 * Custom Selenium interface.
 *
 * @author roman.tymoshuk.net
 */
public interface Selenium extends com.thoughtworks.selenium.Selenium
{
    /**
     * Check a toggle-button (checkbox/radio)
     *
     * @param locator BY locator
     */
    void check(final Locatable locator);

    /**
     * Clicks on a link, button, checkbox or radio button. If the click action causes a new page to
     * load (like a link usually does), call waitForPageToLoad.
     *
     * @param locator BY locator
     */
    void click(final Locatable locator);

    /**
     * Simulates a user hovering a mouse over the specified element.
     *
     * @param locator BY locator
     */
    void mouseOver(final Locatable locator);

    /**
     * Sets the value of an input field, as though you typed it in.
     *
     * <p>
     * Can also be used to set the value of combo boxes, check boxes, etc. In these cases, value
     * should be the value of the option selected, not the visible text.
     * </p>
     *
     * @param locator BY locator
     * @param value the value to type
     */
    void type(final Locatable locator, final String value);

    /**
     * Gets' base URL.
     *
     * @return
     */
    public String getBaseURL();

    /**
     * Gets' current web driver.
     *
     * @return
     */
    public WebDriver getWebDriver();
}
