package company.tap.thememanager.base;

import android.graphics.Color;

public class Colors {
    private String primary;
    private String secondary;

    public int getPrimary() {
        return Color.parseColor(primary);
    }

    public int getSecondary() {
        return Color.parseColor(secondary);
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }
}
