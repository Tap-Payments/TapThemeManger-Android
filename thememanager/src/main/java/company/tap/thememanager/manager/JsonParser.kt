package company.tap.thememanager.manager

import android.graphics.Color
import androidx.annotation.ColorInt
import company.tap.thememanager.models.AmountSectionView
import company.tap.thememanager.models.Colors
import company.tap.thememanager.models.MerchantHeaderView

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


  fun setObject0(){
      var  colors = Colors()
      colors.apricot30 = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.apricot30")).toString()
      colors.black = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.black")).toString()
      colors.black50 = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.black50")).toString()
      colors.brownGrey = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.brownGrey")).toString()
      colors.brownGreyFive = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.brownGreyFive")).toString()
      colors.brownGreyThree = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.brownGreyThree")).toString()
      colors.brownGreyTwo = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.brownGreyTwo")).toString()
      colors.cherryRed = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.cherryRed")).toString()
      colors.cherryRed10 = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.cherryRed10")).toString()
      colors.cherryRed20 = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.cherryRed20")).toString()
      colors.clear = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.clear")).toString()
      colors.deepSkyBlue = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.deepSkyBlue")).toString()
      colors.white = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.white")).toString()
      colors.lightPeach = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.lightPeach")).toString()
      colors.deepSkyBlue = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.deepSkyBlue")).toString()
      colors.deepSkyBlue = Color.parseColor(ThemeManager.getValue("GlobalValues.Colors.deepSkyBlue")).toString()
/**
      "white" : "#1c1c1e",
      "black" : "#000000",
      "black50" : "#00000080",
      "lightPeach" : "#98989f",
      "greyishBrown" : "#ffffff",
      "veryLightPinkTwo" : "#404043",
      "brownGrey" : "#98989f",
      "whiteTwo": "#2b2b2f",
      "deepSkyBlue": "#007aff",
      "white30":"#ffffff4D",
      "lightPeriwinkle": "#d9d9da",
      "white80":"#ffffffcc",
      "vibrantGreen" : "#2ace00",
      "vibrantGreenTwo" : "#00d300",
      "paleLilac":"#e4e4e5",
      "clear":"#00000000",
      "brownGreyTwo":"#b2b2b2",
      "brownGreyThree":"#ababab",
      "orange":"#ea611c",
      "apricot30":"#ffbe604C",
      "reddishOrange20":"#ea672433",
      "cherryRed":"#e12131",
      "cherryRed10":"#e1213119",
      "cherryRed20":"#e12132",
      "deepSkyBlue15":"#007aff26",
      "brownGreyFive":"#aeaeae",
      "deepSkyBlue15":"#007aff26",
      "veryLightPinkThree": "#1c1c1e",
      "azure": "#009aff",
      "brownGreySix": "#a7a7a7",
      "brownGreySeven": "#7e7e7e",
      "white78": "#f9f9f9C6",
      "brownGreyFour": "#a6a6a6"*/



  }


    fun setObject10(){
        var  merchantHeaderView = MerchantHeaderView()
        merchantHeaderView.titleLabelFont = Color.parseColor(ThemeManager.getValue("MerchantHeaderView.titleLabelFont")).toString()
        merchantHeaderView.titleLabelColor = Color.parseColor(ThemeManager.getValue("MerchantHeaderView.titleLabelColor")).toString()
        merchantHeaderView.subTitleLabelFont = Color.parseColor(ThemeManager.getValue("MerchantHeaderView.subTitleLabelFont")).toString()
        merchantHeaderView.subTitleLabelColor = Color.parseColor(ThemeManager.getValue("MerchantHeaderView.subTitleLabelColor")).toString()
        merchantHeaderView.merchantLogoCorner = Color.parseColor(ThemeManager.getValue("MerchantHeaderView.merchantLogoCorner")).toString()
        merchantHeaderView.merchantLogoPlaceHolderColor = Color.parseColor(ThemeManager.getValue("MerchantHeaderView.merchantLogoPlaceHolderColor")).toString()
        merchantHeaderView.merchantLogoPlaceHolderFont = Color.parseColor(ThemeManager.getValue("MerchantHeaderView.merchantLogoPlaceHolderFont")).toString()
        merchantHeaderView.merchantLogoPlaceHolderLabelColor = Color.parseColor(ThemeManager.getValue("MerchantHeaderView.merchantLogoPlaceHolderLabelColor")).toString()
        merchantHeaderView.backgroundColor = Color.parseColor(ThemeManager.getValue("MerchantHeaderView.backgroundColor")).toString()


    }

    fun setObject11(){
        var  amountSectionView = AmountSectionView()
        amountSectionView.originalAmountLabelFont = Color.parseColor(ThemeManager.getValue("AmountSectionView.originalAmountLabelFont")).toString()
        amountSectionView.originalAmountLabelColor = Color.parseColor(ThemeManager.getValue("AmountSectionView.originalAmountLabelColor")).toString()
        amountSectionView.convertedAmountLabelFont = Color.parseColor(ThemeManager.getValue("AmountSectionView.convertedAmountLabelFont")).toString()
        amountSectionView.convertedAmountLabelColor = Color.parseColor(ThemeManager.getValue("AmountSectionView.convertedAmountLabelColor")).toString()
        amountSectionView.itemsLabelFont = Color.parseColor(ThemeManager.getValue("AmountSectionView.itemsLabelFont")).toString()
        amountSectionView.itemsLabelColor = Color.parseColor(ThemeManager.getValue("AmountSectionView.itemsLabelColor")).toString()
        amountSectionView.itemsNumberButtonBackgroundColor = Color.parseColor(ThemeManager.getValue("AmountSectionView.itemsNumberButtonBackgroundColor")).toString()
        amountSectionView.itemsNumberButtonBorder = Color.parseColor(ThemeManager.getValue("AmountSectionView.itemsNumberButtonBorder")).toString()
        amountSectionView.backgroundColor = Color.parseColor(ThemeManager.getValue("MerchantHeaderView.backgroundColor")).toString()


    }
}