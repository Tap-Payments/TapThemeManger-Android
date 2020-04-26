package company.tap.sample

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import company.tap.sample.databinding.ActivityMainBinding
import company.tap.thememanager.TapThemeManager
import company.tap.thememanager.theme.TextViewTheme

class MainActivity : AppCompatActivity() {

    private var currentTheme = 0
    private val themeManager = TapThemeManager()
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initAppTheme(R.raw.theme1)
    }

    private fun initAppTheme(theme: Int) {
        currentTheme = theme
        themeManager.loadTapTheme(resources, theme)
        val textViewTheme = TextViewTheme()
        textViewTheme.textSize = themeManager.getValue<Int>("textView.fontSize").toFloat()
        textViewTheme.textColor = Color.parseColor(themeManager.getValue("textView.fontColor"))
        mainBinding.textViewTheme = textViewTheme
    }

    fun swap(view: View?) {
        if (currentTheme == R.raw.theme1)
            initAppTheme(R.raw.theme2)
        else
            initAppTheme(R.raw.theme1)
    }
}