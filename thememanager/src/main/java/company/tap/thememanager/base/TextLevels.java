package company.tap.thememanager.base;

import org.json.JSONException;
import org.json.JSONObject;

public class TextLevels {
    /**
     * Header text type
     */
    private Text headerText;
    /**
     * Helper text type
     */
    private Text helperText;

    /**
     * @return getter for the instance
     */
    public Text getHeaderText() {
        return headerText;
    }

    /**
     * @return getter for the instance
     */
    public Text getHelperText() {
        return helperText;
    }

    /**
     * @param jsonText Json text to set Text instance
     */
    public void setHeaderText(JSONObject jsonText) {
        headerText = new Text();
        fillText(headerText, jsonText);
    }

    /**
     * @param jsonText Json text to set Text instance
     */
    public void setHelperText(JSONObject jsonText) {
        helperText = new Text();
        fillText(helperText, jsonText);
    }

    /**
     * @param textInstance TextLevel type
     * @param jsonText text attributes
     */
    private void fillText(Text textInstance, JSONObject jsonText){
        try {
            textInstance.setFontSize(jsonText.getInt("fontSize"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
