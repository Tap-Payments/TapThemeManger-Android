package company.tap.thememanager.atoms;

import company.tap.thememanager.base.Text;

public class TextViewTheme {
    /**
     * Text style instance
     */
    private Text text;
    /**
     * Text color
     */
    private int color;

    /**
     * @return getter for the Text instance
     */
    public Text getText() {
        return text;
    }

    /**
     * @return getter for the color
     */
    public int getColor() {
        return color;
    }

    /**
     * @param text setter for the text instance
     */
    public void setText(Text text) {
        this.text = text;
    }

    /**
     * @param color getter for the
     */
    public void setColor(int color) {
        this.color = color;
    }
}
