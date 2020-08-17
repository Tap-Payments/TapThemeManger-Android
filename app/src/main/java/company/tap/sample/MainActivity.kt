package company.tap.sample

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import company.tap.sample.databinding.ActivityMainBinding
import company.tap.thememanager.manager.JsonParser
import company.tap.thememanager.manager.ThemeManager
import company.tap.thememanager.theme.ChipTheme
import company.tap.thememanager.theme.TextViewTheme
import kotlinx.android.synthetic.main.navigation_header_layout.*

class MainActivity : AppCompatActivity() {

    private var currentTheme = 0
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initAppTheme(R.raw.defaultdarktheme)
    }

    private fun initAppTheme(theme: Int) {
        currentTheme = theme
//        ThemeManager.loadTapTheme(this, "https://kar-tempo.s3.ap-south-1.amazonaws.com/theme-tap.json")
        ThemeManager.loadTapTheme(resources, theme)
        val textViewTheme = TextViewTheme()
        textViewTheme.textSize = (ThemeManager.getValue<Int>("inlineCard.saveCardOption.labelTextFont") as String ).toFloat()
        textViewTheme.textColor = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.orange"))
        mainBinding.textViewTheme = textViewTheme

//        mainBinding.textViewTheme = JsonParser.setObject1InlineCard()
    }





    fun swap(view: View?) {
        if (currentTheme == R.raw.defaultdarktheme) {
            initAppTheme(R.raw.defaultlighttheme)
            Toast.makeText(applicationContext, "Theme switched to defaultlighttheme", Toast.LENGTH_SHORT).show()
        }
        else {
            initAppTheme(R.raw.defaultdarktheme)
            Toast.makeText(applicationContext, "Theme switched defaultdarktheme", Toast.LENGTH_SHORT).show()

        }
    }
}