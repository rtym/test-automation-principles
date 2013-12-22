package net.tymoshuk.testautomation.pages.dashboard;

import net.tymoshuk.testautomation.pages.Page;
import net.tymoshuk.testautomation.pages.login.LoginPage;
import net.tymoshuk.testautomation.utils.locators.By;
import net.tymoshuk.testautomation.utils.selenium.Selenium;

/**
 * Dashboard page.
 *
 * @author roman@tymoshuk.net
 */
public class DashboardPage extends Page
{
    private static final String PAGE = "wp-admin/";

    /**
     * Constructor.
     *
     * @param selenium
     *          selenium
     */
    public DashboardPage(final Selenium selenium)
    {
        super(selenium);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void visit()
    {
        this.getSelenium().open(this.getSelenium().getBaseURL().concat(PAGE));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isActive()
    {
        return this.getSelenium().getLocation().equals(this.getSelenium().getBaseURL().concat(PAGE));
    }

    public LoginPage logout()
    {
        this.getSelenium().click(By.id("wp-admin-bar-logout"));

        return new LoginPage(this.getSelenium());
    }
}
