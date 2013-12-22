package net.tymoshuk.testautomation;

import net.tymoshuk.testautomation.pages.login.LoginPage;
import net.tymoshuk.testautomation.utils.Session;
import net.tymoshuk.testautomation.utils.User;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Tests for Login Page.
 *
 * @author roman@tymoshuk.net
 */
public class LoginPageTest
{
    private static LoginPage loginPage;

    @BeforeClass
    public static void activatePage()
    {
        loginPage = new LoginPage(Session.INSTANCE.getSelenium());

        loginPage.visit();
    }

    @Before
    public void preparePage()
    {
        loginPage.visit();
    }


    @Test
    public void shouldBeActivated()
    {
        assert loginPage.isActive();
    }

    @Test
    public void shouldSignIn()
    {
        User user = new User()
        {{
            this.setUsername("rtym");
            this.setPassword("rtym");
        }};

        assert loginPage.loginWithCorrectCredentials(user, false).isActive();
    }

    @Test
    public void shouldNotSignIn()
    {
        User user = new User()
        {{
                this.setUsername("rtym");
                this.setPassword("123");
        }};

        assert loginPage.loginWithIncorrectCredentials(user, false).isActive();
    }
}
