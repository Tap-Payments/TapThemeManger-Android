package company.tap.thememanager.base;

import org.json.JSONException;
import org.json.JSONObject;

public class TextLevels {
    private Text headerText;
    private Text helperText;

    public Text getHeaderText() {
        return headerText;
    }

    public Text getHelperText() {
        return helperText;
    }

    public void setHeaderText(JSONObject jsonText) {
        headerText = new Text();
        fillText(headerText, jsonText);
    }

    public void setHelperText(JSONObject jsonText) {
        helperText = new Text();
        fillText(helperText, jsonText);
    }

    private void fillText(Text textInstance, JSONObject jsonText){
        try {
            textInstance.setFontSize(jsonText.getInt("fontSize"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
