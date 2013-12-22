package net.tymoshuk.testautomation.pages.login;

import net.tymoshuk.testautomation.pages.dashboard.DashboardPage;
import net.tymoshuk.testautomation.pages.Page;
import net.tymoshuk.testautomation.utils.User;
import net.tymoshuk.testautomation.utils.locators.By;
import net.tymoshuk.testautomation.utils.selenium.Selenium;


/**
 * Created with IntelliJ IDEA.
 * User: roman
 * Date: 20.12.13
 * Time: 21:06
 * To change this template use File | Settings | File Templates.
 */
public class LoginPage extends Page
{
    //TODO: Remove this hardcode
    private static final String PAGE_URL = "http://localhost/wordpress/wp-login.php";

    public LoginPage(final Selenium selenium)
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

    public void login(final User user)
    {
        this.login(user, false);
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
