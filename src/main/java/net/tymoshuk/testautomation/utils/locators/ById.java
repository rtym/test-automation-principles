package net.tymoshuk.testautomation.utils.locators;

import org.openqa.selenium.By;

/**
 * Created with IntelliJ IDEA.
 * User: roman
 * Date: 22.12.13
 * Time: 19:47
 * To change this template use File | Settings | File Templates.
 */
public class ById extends By.ById implements Locatable
{
    private String id;

    public ById(final String id)
    {
        super(id);

        this.id = id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLocator()
    {
        return "id=".concat(this.id);
    }
}
