package net.tymoshuk.testautomation.utils.locators;

import com.google.common.base.Strings;

/**
 * Custom by locator.
 *
 * @author roman@tymoshuk.net
 */
public class By
{
    /**
     * Creates locator by id.
     *
     * @param id The value of the "id" attribute to search for
     * @return a By which locates elements by the value of the "id" attribute.
     */
    public static Locatable id(final String id)
    {
        if (Strings.isNullOrEmpty(id))
        {
            throw new IllegalArgumentException("Cannot find elements with a null id attribute.");
        }

        return new ById(id);
    }
}
