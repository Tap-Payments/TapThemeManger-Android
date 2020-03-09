package company.tap.thememanager;

import android.content.res.Resources;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

import company.tap.thememanager.base.BaseTheme;
import company.tap.thememanager.base.Colors;
import company.tap.thememanager.base.Text;
import company.tap.thememanager.base.TextLevels;
import company.tap.thememanager.atoms.AtomsTheme;
import company.tap.thememanager.atoms.TextViewTheme;
import company.tap.thememanager.util.JsonKeys;

class ThemeManager {

    private BaseTheme baseTheme;
    private AtomsTheme atomsTheme;

    public BaseTheme getBaseTheme() {
        return baseTheme;
    }

    public AtomsTheme getAtomsTheme() {
        return atomsTheme;
    }

    void loadTapTheme(Resources resources, int resId) {
        InputStream resourceReader = resources.openRawResource(resId);
        Writer writer = new StringWriter();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(resourceReader, StandardCharsets.UTF_8));
            String line = reader.readLine();
            while (line != null) {
                writer.write(line);
                line = reader.readLine();
            }
            initTapTheme(writer.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resourceReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void initTapTheme(String jsonTheme){
        baseTheme = new BaseTheme();
        atomsTheme = new AtomsTheme();
        try {
            JSONObject tapTheme = new JSONObject(jsonTheme);
            configureBaseStyle(tapTheme.getJSONObject(JsonKeys.BASE));
            configureAtomsStyle(tapTheme.getJSONObject(JsonKeys.ATOMS));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void configureAtomsStyle(JSONObject atoms) {
        try {
            configureTextView(atoms.getJSONObject(JsonKeys.TEXT_VIEW));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void configureTextView(JSONObject textView) {
        atomsTheme.setTextViewTheme(new TextViewTheme());
        try {
            atomsTheme.getTextViewTheme().setColor(getColorType(textView.getString(JsonKeys.COLOR)));
            atomsTheme.getTextViewTheme().setText(getTextType(textView.getString(JsonKeys.TEXT_LEVEL)));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private Text getTextType(String text){
        switch (text){
            case JsonKeys.HELPER_TEXT:
                return baseTheme.getTextLevels().getHelperText();
            case JsonKeys.HEADER_TEXT:
                return baseTheme.getTextLevels().getHeaderText();
            default:
                return null;
        }
    }

    private int getColorType(String color){
        switch (color){
            case JsonKeys.PRIMARY:
                return baseTheme.getColors().getPrimary();
            case JsonKeys.SECONDARY:
                return baseTheme.getColors().getSecondary();
            default:
                return 0;
        }
    }

    private void configureBaseStyle(JSONObject base) {
        try {
            configureThemeColors(base.getJSONObject(JsonKeys.COLORS));
            configureThemeText(base.getJSONObject(JsonKeys.TEXT));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void configureThemeColors(JSONObject colors){
        baseTheme.setColors(new Colors());
        try {
            baseTheme.getColors().setPrimary(colors.getString(JsonKeys.PRIMARY));
            baseTheme.getColors().setSecondary(colors.getString(JsonKeys.SECONDARY));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void configureThemeText(JSONObject text){
        baseTheme.setTextLevels(new TextLevels());
        try {
            baseTheme.getTextLevels().setHeaderText(text.getJSONObject(JsonKeys.HEADER_TEXT));
            baseTheme.getTextLevels().setHelperText(text.getJSONObject(JsonKeys.HELPER_TEXT));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
