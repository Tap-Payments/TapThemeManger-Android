package company.tap.thememanager.atoms;

public class AtomsTheme {
    /**
     * Theming object for the TextView
     */
    private TextViewTheme textViewTheme;
    private EditTextTheme editTextTheme;

    /**
     * @return getter for the theming instance
     */
    public TextViewTheme getTextViewTheme() {
        return textViewTheme;
    }

    /**
     * @param textViewTheme setter for the theming instance
     */
    public void setTextViewTheme(TextViewTheme textViewTheme) {
        this.textViewTheme = textViewTheme;
    }

    public EditTextTheme getEditTextTheme() { return editTextTheme; }

    public void setEditTextTheme(EditTextTheme editTextTheme) {
        this.editTextTheme = editTextTheme;
    }
}
