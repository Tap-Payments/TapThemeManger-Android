package company.tap.thememanager.atoms;

/**
 * Created by Mario Gamal on 4/20/20
 * Copyright © 2020 Tap Payments. All rights reserved.
 */
public class SwitchTheme extends BaseTextTheme{

    private Integer thumbTint;
    private Integer trackTint;

    public Integer getThumbTint() {
        return thumbTint;
    }

    public void setThumbTint(Integer thumbTint) {
        this.thumbTint = thumbTint;
    }

    public Integer getTrackTint() {
        return trackTint;
    }

    public void setTrackTint(Integer trackTint) {
        this.trackTint = trackTint;
    }
}
