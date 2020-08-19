package company.tap.sample

import android.graphics.Color
import android.os.Bundle
import android.provider.CalendarContract
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import company.tap.thememanager.manager.ThemeManager
import company.tap.thememanager.theme.TextViewTheme
import kotlinx.android.synthetic.main.navigation_header_layout.*

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
//        val textViewTheme = TextViewTheme()
        var stringValue1 =  ThemeManager.getValue("inlineCard.commonAttributes.cornerRadius") as Int
        var stringValue2 =  ThemeManager.getValue("inlineCard.commonAttributes.backgroundColor") as String
        var stringValue3 =  ThemeManager.getValue("inlineCard.commonAttributes.cvvPlaceHolder") as String
        var stringValue4 =  ThemeManager.getValue("GlobalValues.Colors.white78") as String
        Toast.makeText(applicationContext, stringValue1.toString() +stringValue2.toString() +stringValue3.toString()  +stringValue4 , Toast.LENGTH_SHORT).show()



        //  textView.setTheme(textViewTheme)
//        = (ThemeManager.getValue<Int>("inlineCard.saveCardOption.labelTextFont") as String ).toFloat()
//        textView.setTheme(textViewTheme) = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.orange"))
    }





    fun swap(view: View?) {
        initAppTheme(R.raw.defaultdarktheme)

//        if (currentTheme == R.raw.defaultdarktheme) {
//            initAppTheme(R.raw.defaultlighttheme)
//            Toast.makeText(applicationContext, "Theme switched to defaultlighttheme", Toast.LENGTH_SHORT).show()
//        }
//        else {
//            initAppTheme(R.raw.defaultdarktheme)
//            Toast.makeText(applicationContext, "Theme switched defaultdarktheme", Toast.LENGTH_SHORT).show()
//
//        }
    }
}