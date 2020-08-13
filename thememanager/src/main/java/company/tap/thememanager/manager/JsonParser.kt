package company.tap.thememanager.manager

import android.graphics.Color
import androidx.annotation.ColorInt
import androidx.core.graphics.toColorInt
import company.tap.thememanager.models.Colors
import company.tap.thememanager.models.inlinecard.CommonAttributes
import company.tap.thememanager.models.inlinecard.InlineCard
import company.tap.thememanager.models.inlinecard.Shadow

/**
 * Created by OLAMONIR on 8/13/20.

Copyright (c) 2020  Tap Payments.
All rights reserved.
 **/


/// All the methods required to parse String values provided in the theme file into readable iOS values like UIColor, UIFont, etc.

object JsonParser {
    /**
    - The method for getting a certain value in the current theme dictrionary
    - Parameter keyPath: The key of the value needed
    - Returns: The value of the key, could be another object, String, Number, etc.
     */
    private fun value( keyPath: String) : Any? {
        return ThemeManager.getValue(keyPath)
    }



    /**
    - The method for getting a STRING value from the current theme dictionary
    - Parameter keyPath: The key of the string needed
    - Returns: The STRING value of the key, and nil if doesn't exist
     */
     fun stringValue( keyPath: String) :String? {
        return value(keyPath) as? String
    }


    /**
    - The method for getting a Numeric value from the current theme dictionary
    - Parameter keyPath: The key of the Number needed
    - Returns: The NSNumber value of the key, and nil if doesn't exist
     */

      fun numberValue( keyPath: String) : Int? {
        return value(keyPath) as? Int
    }


  fun setObjectGlobalValues(){
      var  colors = Colors()
      colors.apricot30 = (ThemeManager.getValue("GlobalValues.Colors.apricot30")as String).toColorInt()
      colors.black = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.black")).toString().toColorInt()
      colors.black50 = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.black50")).toString().toColorInt()
      colors.brownGrey = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.brownGrey")).toString().toColorInt()
      colors.brownGreyFive = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.brownGreyFive")).toString().toColorInt()
      colors.brownGreyThree = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.brownGreyThree")).toString().toColorInt()
      colors.brownGreyTwo = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.brownGreyTwo")).toString().toColorInt()
      colors.cherryRed = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.cherryRed")).toString().toColorInt()
      colors.cherryRed10 = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.cherryRed10")).toString().toColorInt()
      colors.cherryRed20 = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.cherryRed20")).toString().toColorInt()
      colors.clear = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.clear")).toString().toColorInt()
      colors.deepSkyBlue = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.deepSkyBlue")).toString().toColorInt()
      colors.white = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.white")).toString().toColorInt()
      colors.lightPeach = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.lightPeach")).toString().toColorInt()
      colors.greyishBrown = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.greyishBrown")).toString().toColorInt()
      colors.veryLightPinkTwo = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.veryLightPinkTwo")).toString().toColorInt()
      colors.whiteTwo = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.whiteTwo")).toString().toColorInt()
      colors.white30 = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.white30")).toString().toColorInt()
      colors.lightPeriwinkle = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.lightPeriwinkle")).toString().toColorInt()
      colors.white80 = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.white80")).toString().toColorInt()
      colors.vibrantGreen = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.vibrantGreen")).toString().toColorInt()
      colors.vibrantGreenTwo = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.vibrantGreenTwo")).toString().toColorInt()
      colors.paleLilac = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.paleLilac")).toString().toColorInt()
      colors.orange = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.orange")).toString().toColorInt()
      colors.reddishOrange20 = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.reddishOrange20")).toString().toColorInt()
      colors.deepSkyBlue15 = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.deepSkyBlue15")).toString().toColorInt()
      colors.veryLightPinkThree = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.veryLightPinkThree")).toString().toColorInt()
      colors.azure = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.azure")).toString().toColorInt()
      colors.brownGreySix = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.brownGreySix")).toString().toColorInt()
      colors.brownGreySeven = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.brownGreySeven")).toString().toColorInt()
      colors.white78 = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.white78")).toString().toColorInt()
      colors.brownGreyFour = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.brownGreyFour")).toString().toColorInt()
  }



    fun setObject1InlineCard(){
        val inlineCard = InlineCard()
        inlineCard.commonAttributes?.backgroundColor = Color.parseColor(ThemeManager.getValue("inlineCard.commonAttributes.backgroundColor")).toString()
        inlineCard.commonAttributes?.borderColor = Color.parseColor(ThemeManager.getValue("inlineCard.commonAttributes.borderColor")).toString()
        inlineCard.commonAttributes?.cornerRadius = Color.parseColor(ThemeManager.getValue("inlineCard.commonAttributes.cornerRadius")).toString().toColorInt()
        inlineCard.commonAttributes?.borderWidth = Color.parseColor(ThemeManager.getValue("inlineCard.commonAttributes.borderWidth")).toString().toColorInt()
        inlineCard.commonAttributes?.itemSpacing = Color.parseColor(ThemeManager.getValue("inlineCard.commonAttributes.itemSpacing")).toString().toColorInt()
        inlineCard.commonAttributes?.cvvPlaceHolder = Color.parseColor(ThemeManager.getValue("inlineCard.commonAttributes.cvvPlaceHolder")).toString()

        inlineCard.commonAttributes?.shadow?.color = Color.parseColor(ThemeManager.getValue("inlineCard.commonAttributes.shadow.color")).toString()
        inlineCard.commonAttributes?.shadow?.radius = Color.parseColor(ThemeManager.getValue("inlineCard.commonAttributes.shadow.radius")).toString().toColorInt()
        inlineCard.commonAttributes?.shadow?.offsetWidth = Color.parseColor(ThemeManager.getValue("inlineCard.commonAttributes.shadow.offsetWidth")).toString().toColorInt()
        inlineCard.commonAttributes?.shadow?.offsetHeight = Color.parseColor(ThemeManager.getValue("inlineCard.commonAttributes.shadow.offsetHeight")).toString().toColorInt()
        inlineCard.commonAttributes?.widthMargin = Color.parseColor(ThemeManager.getValue("inlineCard.commonAttributes.widthMargin")).toString().toColorInt()

        inlineCard.iconImage?.image = Color.parseColor(ThemeManager.getValue("inlineCard.iconImage.image")).toString()
        inlineCard.iconImage?.width = Color.parseColor(ThemeManager.getValue("inlineCard.iconImage.width")).toString().toColorInt()

        inlineCard.scanImage?.image = Color.parseColor(ThemeManager.getValue("inlineCard.scanImage.image")).toString()
        inlineCard.scanImage?.selected = Color.parseColor(ThemeManager.getValue("inlineCard.scanImage.selected")).toString()
        inlineCard.scanImage?.width = Color.parseColor(ThemeManager.getValue("inlineCard.scanImage.width")).toString().toColorInt()


        inlineCard.clearImage?.image = Color.parseColor(ThemeManager.getValue("inlineCard.clearImage.image")).toString()
        inlineCard.clearImage?.width = Color.parseColor(ThemeManager.getValue("inlineCard.clearImage.width")).toString().toColorInt()


        inlineCard.textFields?.textColor = Color.parseColor(ThemeManager.getValue("inlineCard.textFields.textColor")).toString()
        inlineCard.textFields?.errorTextColor = Color.parseColor(ThemeManager.getValue("inlineCard.textFields.errorTextColor")).toString()
        inlineCard.textFields?.font = Color.parseColor(ThemeManager.getValue("inlineCard.textFields.font")).toString()
        inlineCard.textFields?.placeHolderColor = Color.parseColor(ThemeManager.getValue("inlineCard.textFields.placeHolderColor")).toString()


        inlineCard.saveCardOption?.labelTextColor = Color.parseColor(ThemeManager.getValue("inlineCard.saveCardOption.labelTextColor")).toString()
        inlineCard.saveCardOption?.labelTextFont = Color.parseColor(ThemeManager.getValue("inlineCard.saveCardOption.labelTextFont")).toString().toColorInt()
        inlineCard.saveCardOption?.switchTintColor = Color.parseColor(ThemeManager.getValue("inlineCard.saveCardOption.switchTintColor")).toString()
        inlineCard.saveCardOption?.switchThumbColor = Color.parseColor(ThemeManager.getValue("inlineCard.saveCardOption.switchThumbColor")).toString()
        inlineCard.saveCardOption?.switchOnThumbColor = Color.parseColor(ThemeManager.getValue("inlineCard.saveCardOption.switchOnThumbColor")).toString()


    }


}