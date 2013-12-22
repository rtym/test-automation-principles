package net.tymoshuk.testautomation.utils.locators;

import org.openqa.selenium.By;

/**
 * Locator for items defined by id.
 *
 * @author roman@tymoshuk.net
 */
public class ById extends By.ById implements Locatable
{
    /**
     * ID.
     */
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
