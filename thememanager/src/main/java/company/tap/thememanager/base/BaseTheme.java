package company.tap.thememanager.base;

import android.graphics.Color;

public class BaseTheme {
    /**
     * Theme colors
     */
    private Colors colors;
    /**
     * Theme text levels
     */
    private TextLevels textLevels;

    /**
     * @return getter for theme colors
     */
    public Colors getColors() {
        return colors;
    }

    /**
     * @param colors setter for theme colors
     */
    public void setColors(Colors colors) {
        this.colors = colors;
    }

    /**
     * @return getter for text levels
     */
    public TextLevels getTextLevels() {
        return textLevels;
    }

    /**
     * @param textLevels setter for text levels
     */
    public void setTextLevels(TextLevels textLevels) {
        this.textLevels = textLevels;
    }
}
