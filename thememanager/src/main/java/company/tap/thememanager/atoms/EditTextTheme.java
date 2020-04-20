package company.tap.thememanager.atoms;

import company.tap.thememanager.base.Text;

/**
 * Created by AhlaamK on 4/15/20.
 * <p>
 * Copyright (c) 2020    Tap Payments.
 * All rights reserved.
 **/
public class EditTextTheme extends BaseTextTheme{

    private Integer maxLines;
    private Integer textColorHint;
    private Integer backgroundTint;

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
