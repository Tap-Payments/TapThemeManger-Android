package company.tap.sample

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import company.tap.sample.databinding.ActivityMainBinding
import company.tap.thememanager.ThemeManager
import company.tap.thememanager.theme.TextViewTheme

class MainActivity : AppCompatActivity() {

    private var currentTheme = 0
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initAppTheme(R.raw.theme1)
    }

    private fun initAppTheme(theme: Int) {
        currentTheme = theme
        ThemeManager.loadTapTheme(this, "https://kar-tempo.s3.ap-south-1.amazonaws.com/theme-tap.json","dark")
        ThemeManager.loadTapTheme(resources, theme,"dark")
        val textViewTheme = TextViewTheme()
        textViewTheme.textSize = ThemeManager.getValue<Int>("textView.fontSize").toFloat()
        textViewTheme.textColor = Color.parseColor(ThemeManager.getValue("textView.fontColor"))
        mainBinding.textViewTheme = textViewTheme
    }

    fun swap(view: View?) {
        if (currentTheme == R.raw.theme1)
            initAppTheme(R.raw.theme2)
        else
            initAppTheme(R.raw.theme1)
    }
}