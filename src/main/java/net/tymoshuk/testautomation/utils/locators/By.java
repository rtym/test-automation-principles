package net.tymoshuk.testautomation.utils.locators;

import com.google.common.base.Strings;

/**
 * Created with IntelliJ IDEA.
 * User: roman
 * Date: 22.12.13
 * Time: 19:40
 * To change this template use File | Settings | File Templates.
 */
public class By
{
    /**
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
