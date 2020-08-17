package company.tap.sample

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import company.tap.tapuilibrary.TapView
import company.tap.thememanager.manager.ThemeManager
import company.tap.thememanager.models.inlinecard.TextFields

/**
 * Created by OLAMONIR on 8/17/20.

Copyright (c) 2020  Tap Payments.
All rights reserved.
 **/

//open class TextTest(context: Context, attributeSet: AttributeSet) :
//        AppCompatTextView(context, attributeSet), TapView<TextFields> {
//    override fun setTheme(theme: TextFields) {
//        theme.textColor?.let { (ThemeManager.getValue("inlineCard.textFields.textColor")as String).toString() }
////        theme.textSize?.let { textSize = it }
////        theme.letterSpacing?.let { letterSpacing = it }
//        invalidate()
//    }
//}