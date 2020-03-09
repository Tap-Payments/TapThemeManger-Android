package company.tap.thememanager.atoms;

import company.tap.thememanager.base.Text;

public class TextViewTheme {
    private Text text;
    private int color;

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
}
