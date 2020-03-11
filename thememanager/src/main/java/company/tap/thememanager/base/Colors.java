package company.tap.thememanager.base;

import android.graphics.Color;

public class Colors {
    /**
     * theme primary color
     */
    private String primary;
    /**
     * theme secondary color
     */
    private String secondary;

    /**
     * @return getter for the primary color
     */
    public int getPrimary() {
        return Color.parseColor(primary);
    }

    /**
     * @return getter for the secondary color
     */
    public int getSecondary() {
        return Color.parseColor(secondary);
    }

    /**
     * @param primary setter for the primary color
     */
    public void setPrimary(String primary) {
        this.primary = primary;
    }

    /**
     * @param secondary setter for the secondary color
     */
    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }
}
