package company.tap.thememanager.base;

public class Text {
    /**
     * font size attribute
     */
    private float fontSize;
    private float letterSpacing;

    /**
     * @return getter for the font size
     */
    public float getFontSize() {
        return fontSize;
    }

    /**
     * @param fontSize setter for the font size
     */
    void setFontSize(float fontSize) {
        this.fontSize = fontSize;
    }

    public float getLetterSpacing() {
        return letterSpacing;
    }

    public void setLetterSpacing(float letterSpacing) {
        this.letterSpacing = letterSpacing;
    }
}
