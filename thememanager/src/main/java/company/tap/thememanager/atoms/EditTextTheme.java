package company.tap.thememanager.atoms;

import company.tap.thememanager.base.Text;

/**
 * Created by AhlaamK on 4/15/20.
 * <p>
 * Copyright (c) 2020    Tap Payments.
 * All rights reserved.
 **/
public class EditTextTheme {
    private Text text;
    private int color;
    private int textColorHint;
    private int maxLines;
    private int backgroundTint;

    public Text getText() {
        return text;
    }

    public int getColor() {
        return color;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getTextColorHint() {
        return textColorHint;
    }

    public void setTextColorHint(int textColorHint) {
        this.textColorHint = textColorHint;
    }

    public int getMaxLines() {
        return maxLines;
    }

    public void setMaxLines(int maxLines) {
        this.maxLines = maxLines;
    }

    public int getBackgroundTint() {
        return backgroundTint;
    }

    public void setBackgroundTint(int backgroundTint) {
        this.backgroundTint = backgroundTint;
    }
}
