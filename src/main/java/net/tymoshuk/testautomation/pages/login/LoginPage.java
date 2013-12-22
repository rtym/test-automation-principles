package net.tymoshuk.testautomation.pages.login;

import net.tymoshuk.testautomation.pages.dashboard.DashboardPage;
import net.tymoshuk.testautomation.pages.Page;
import net.tymoshuk.testautomation.utils.User;
import net.tymoshuk.testautomation.utils.locators.By;
import net.tymoshuk.testautomation.utils.selenium.Selenium;


/**
 * Login page.
 *
 * @author roman@tymoshuk.net
 */
public class LoginPage extends Page
{
    private static final String PAGE_URL = "http://localhost/wordpress/wp-login.php";

    /**
     * Constructor.
     *
     * @param selenium
     *          selenium
     */
    public LoginPage(final Selenium selenium)
    {
        super(selenium);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void visit()
    {
        this.getSelenium().open(PAGE_URL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isActive()
    {
        return this.getSelenium().getLocation().equals(PAGE_URL);
    }

    public void login(final User user, final boolean rememberMe)
    {
        if (rememberMe)
        {
            this.getSelenium().check(By.id("rememberme"));
        }

        this.getSelenium().type(By.id("user_login"), user.getUsername());
        this.getSelenium().type(By.id("user_pass"), user.getPassword());
        this.submit();
    }

    public DashboardPage loginWithCorrectCredentials(final User user, final boolean rememberMe)
    {
        this.login(user, rememberMe);

        return new DashboardPage(this.getSelenium());
    }

    public LoginPage loginWithIncorrectCredentials(final User user, final boolean rememberMe)
    {
        this.login(user, rememberMe);

        return new LoginPage(this.getSelenium());
    }

    protected void submit()
    {
        this.getSelenium().click(By.id("wp-submit"));
    }
}
