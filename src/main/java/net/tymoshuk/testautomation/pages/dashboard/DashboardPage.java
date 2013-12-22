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
    //TODO: Remove this hardcode
    private static final String PAGE_URL = "http://localhost/wordpress/wp-admin/";

    public DashboardPage(final Selenium selenium)
    {
        super(selenium);
    }

    @Override
    public void visit()
    {
        this.getSelenium().open(PAGE_URL);
    }

    @Override
    public boolean isActive()
    {
        return this.getSelenium().getLocation().equals(PAGE_URL);
    }

    public LoginPage logout()
    {
        this.getSelenium().click(By.id("wp-admin-bar-logout"));

        return new LoginPage(this.getSelenium());
    }
}
