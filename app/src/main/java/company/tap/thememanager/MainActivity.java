package company.tap.thememanager;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import company.tap.thememanager.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ThemeManager themeManager;
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initAppTheme();
    }

    private void initAppTheme(){
        themeManager = new ThemeManager();
        themeManager.loadTapTheme(getResources(), R.raw.theme);
        mainBinding.setTextViewTheme(themeManager.getAtomsTheme().getTextViewTheme());
    }

}
