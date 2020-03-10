package company.tap.thememanager;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import company.tap.thememanager.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int currentTheme;
    ThemeManager themeManager;
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initAppTheme(R.raw.theme1);
    }

    private void initAppTheme(int theme){
        currentTheme = theme;
        themeManager = new ThemeManager();
        themeManager.loadTapTheme(getResources(),theme);
        mainBinding.setTextViewTheme(themeManager.getAtomsTheme().getTextViewTheme());
    }

    public void swap(View view) {
        if (currentTheme == R.raw.theme1)
            initAppTheme(R.raw.theme2);
        else
            initAppTheme(R.raw.theme1);
    }
}
