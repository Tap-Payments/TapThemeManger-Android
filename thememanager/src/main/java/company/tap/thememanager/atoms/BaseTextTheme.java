package company.tap.thememanager.atoms;

/**
 * Created by Mario Gamal on 4/20/20
 * Copyright © 2020 Tap Payments. All rights reserved.
 */
public class BaseTextTheme {

    private Integer textColor;
    private Float textSize;
    private Float letterSpacing;

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public float getTextSize() {
        return textSize;
    }

    public void setTextSize(float textSize) {
        this.textSize = textSize;
    }

    public float getLetterSpacing() {
        return letterSpacing;
    }

    public void setLetterSpacing(float letterSpacing) {
        this.letterSpacing = letterSpacing;
    }
}
