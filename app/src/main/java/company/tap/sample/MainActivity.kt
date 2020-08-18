package company.tap.sample

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import company.tap.thememanager.manager.ThemeManager
import company.tap.thememanager.theme.TextViewTheme

class MainActivity : AppCompatActivity() {

    private var currentTheme = 0
//    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_main)
        initAppTheme(R.raw.defaultdarktheme)
    }

    private fun initAppTheme(theme: Int) {
        currentTheme = theme
//        ThemeManager.loadTapTheme(this, "https://kar-tempo.s3.ap-south-1.amazonaws.com/theme-tap.json")
        ThemeManager.loadTapTheme(resources, theme)
        val textViewTheme = TextViewTheme()
      //  textView.setTheme(textViewTheme)
//        = (ThemeManager.getValue<Int>("inlineCard.saveCardOption.labelTextFont") as String ).toFloat()
//        textView.setTheme(textViewTheme) = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.orange"))
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