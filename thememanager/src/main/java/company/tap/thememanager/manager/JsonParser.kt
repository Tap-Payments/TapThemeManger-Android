package company.tap.thememanager.manager

import android.graphics.Color
import company.tap.thememanager.models.amountsectionview.AmountSectionView
import company.tap.thememanager.models.Colors
import company.tap.thememanager.models.MerchantHeaderView
import androidx.core.graphics.toColorInt
import company.tap.thememanager.models.horizontallist.HorizontalList
import company.tap.thememanager.models.itemlist.ItemList

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
        merchantHeaderView.merchantLogoCorner = Color.parseColor(ThemeManager.getValue("MerchantHeaderView.merchantLogoCorner")).toString().toColorInt()
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
        amountSectionView.itemsNumberButtonBorder?.color = Color.parseColor(ThemeManager.getValue("AmountSectionView.itemsNumberButtonBorder.color")).toString()
        amountSectionView.itemsNumberButtonBorder?.width = Color.parseColor(ThemeManager.getValue("AmountSectionView.itemsNumberButtonBorder.width")).toString().toInt()
        amountSectionView.backgroundColor = Color.parseColor(ThemeManager.getValue("AmountSectionView.backgroundColor")).toString().toColorInt()


    }

    fun setObject12() {
        var horizontalList = HorizontalList()
        horizontalList.backgroundColor = Color.parseColor(ThemeManager.getValue("HorizontalList.backgroundColor")).toString()
        horizontalList.itemSpacing = Color.parseColor(ThemeManager.getValue("HorizontalList.itemSpacing")).toString().toInt()
        horizontalList.margin = Color.parseColor(ThemeManager.getValue("HorizontalList.margin")).toString().toInt()
        horizontalList.headers?.gatewayHeader?.backgroundColor = Color.parseColor(ThemeManager.getValue("HorizontalList.gatewayHeader.backgroundColor")).toString()
        horizontalList.headers?.gatewayHeader?.leftButton?.labelTextFont = Color.parseColor(ThemeManager.getValue("HorizontalList.gatewayHeader.leftButton.labelTextFont")).toString()
        horizontalList.headers?.gatewayHeader?.leftButton?.labelTextColor = Color.parseColor(ThemeManager.getValue("HorizontalList.gatewayHeader.leftButton.labelTextColor")).toString()
        horizontalList.headers?.gatewayHeader?.rightButton?.labelTextFont = Color.parseColor(ThemeManager.getValue("HorizontalList.gatewayHeader.rightButton.labelTextFont")).toString()
        horizontalList.headers?.gatewayHeader?.rightButton?.labelTextColor = Color.parseColor(ThemeManager.getValue("HorizontalList.gatewayHeader.rightButton.labelTextColor")).toString()
        horizontalList.chips?.radius = Color.parseColor(ThemeManager.getValue("HorizontalList.gatewayHeader.rightButton.labelTextColor")).toString().toInt()

        horizontalList.chips?.currencyChip?.backgroundColor = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.currencyChip.backgroundColor")).toString()
        horizontalList.chips?.currencyChip?.labelTextFont = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.currencyChip.labelTextFont")).toString()
        horizontalList.chips?.currencyChip?.labelTextColor = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.currencyChip.labelTextColor")).toString()
        horizontalList.chips?.currencyChip?.selected?.shadow?.color = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.currencyChip.selected.shadow.color")).toString()
        horizontalList.chips?.currencyChip?.selected?.shadow?.radius = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.currencyChip.selected.shadow.radius")).toString().toInt()
        horizontalList.chips?.currencyChip?.selected?.shadow?.offsetWidth = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.currencyChip.selected.shadow.offsetWidth")).toString().toInt()
        horizontalList.chips?.currencyChip?.selected?.shadow?.offsetHeight = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.currencyChip.selected.shadow.offsetHeight")).toString().toInt()
        horizontalList.chips?.currencyChip?.selected?.shadow?.opacity = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.currencyChip.unSelected.shadow.opacity")).toString().toInt()
        horizontalList.chips?.currencyChip?.unSelected?.shadow?.offsetWidth = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.currencyChip.unSelected.shadow.offsetWidth")).toString().toInt()
        horizontalList.chips?.currencyChip?.unSelected?.shadow?.offsetHeight = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.currencyChip.unSelected.shadow.offsetHeight")).toString().toInt()
        horizontalList.chips?.currencyChip?.unSelected?.shadow?.opacity = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.currencyChip.unSelected.shadow.opacity")).toString().toInt()

        horizontalList.chips?.gatewayChip?.backgroundColor = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.gatewayChip.backgroundColor")).toString()
        horizontalList.chips?.gatewayChip?.shadow?.color = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.gatewayChip.shadow.color")).toString()
        horizontalList.chips?.gatewayChip?.shadow?.radius = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.gatewayChip.shadow.radius")).toString().toInt()
        horizontalList.chips?.gatewayChip?.shadow?.offsetWidth = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.gatewayChip.shadow.offsetWidth")).toString().toInt()
        horizontalList.chips?.gatewayChip?.shadow?.offsetHeight = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.gatewayChip.shadow.offsetHeight")).toString().toInt()
        horizontalList.chips?.gatewayChip?.shadow?.opacity = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.gatewayChip.shadow.opacity")).toString().toInt()

        horizontalList.chips?.goPayChip?.backgroundColor = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.backgroundColor")).toString()
        horizontalList.chips?.goPayChip?.labelTextFont = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.labelTextFont")).toString()
        horizontalList.chips?.goPayChip?.labelTextColor = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.labelTextColor")).toString()
        horizontalList.chips?.goPayChip?.selected?.shadow?.color = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.selected.shadow")).toString()
        horizontalList.chips?.goPayChip?.selected?.shadow?.radius = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.selected.radius")).toString().toInt()
        horizontalList.chips?.goPayChip?.selected?.shadow?.offsetWidth = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.selected.offsetWidth")).toString().toInt()
        horizontalList.chips?.goPayChip?.selected?.shadow?.offsetHeight = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.selected.offsetHeight")).toString().toInt()
        horizontalList.chips?.goPayChip?.selected?.shadow?.opacity = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.selected.opacity")).toString().toInt()
        horizontalList.chips?.goPayChip?.unSelected?.shadow?.color = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.unSelected.shadow")).toString()
        horizontalList.chips?.goPayChip?.unSelected?.shadow?.radius = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.unSelected.radius")).toString().toInt()
        horizontalList.chips?.goPayChip?.unSelected?.shadow?.offsetWidth = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.unSelected.offsetWidth")).toString().toInt()
        horizontalList.chips?.goPayChip?.unSelected?.shadow?.offsetHeight = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.unSelected.offsetHeight")).toString().toInt()
        horizontalList.chips?.goPayChip?.unSelected?.shadow?.opacity = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.unSelected.opacity")).toString().toInt()



        horizontalList.chips?.applePayChip?.backgroundColor = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.applePayChip.backgroundColor")).toString()
        horizontalList.chips?.applePayChip?.applePayTitleFont = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.applePayChip.applePayTitleFont")).toString()
        horizontalList.chips?.applePayChip?.applePayTitleColor = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.applePayChip.applePayTitleColor")).toString()
        horizontalList.chips?.applePayChip?.appleLogoTitleFont = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.applePayChip.appleLogoTitleFont")).toString()
        horizontalList.chips?.applePayChip?.appleLogoTitleColor = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.applePayChip.appleLogoTitleColor")).toString()
        horizontalList.chips?.applePayChip?.selected?.shadow?.color = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.selected.shadow")).toString()
        horizontalList.chips?.applePayChip?.selected?.shadow?.radius = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.selected.radius")).toString().toInt()
        horizontalList.chips?.applePayChip?.selected?.shadow?.offsetWidth = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.selected.offsetWidth")).toString().toInt()
        horizontalList.chips?.applePayChip?.selected?.shadow?.offsetHeight = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.selected.offsetHeight")).toString().toInt()
        horizontalList.chips?.applePayChip?.selected?.shadow?.opacity = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.selected.opacity")).toString().toInt()
        horizontalList.chips?.applePayChip?.unSelectedTheme?.shadow?.color = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.unSelectedTheme.shadow")).toString()
        horizontalList.chips?.applePayChip?.unSelectedTheme?.shadow?.radius = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.unSelectedTheme.radius")).toString().toInt()
        horizontalList.chips?.applePayChip?.unSelectedTheme?.shadow?.offsetWidth = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.unSelectedTheme.offsetWidth")).toString().toInt()
        horizontalList.chips?.applePayChip?.unSelectedTheme?.shadow?.offsetHeight = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.unSelectedTheme.offsetHeight")).toString().toInt()
        horizontalList.chips?.applePayChip?.unSelectedTheme?.shadow?.opacity = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.goPayChip.unSelectedTheme.opacity")).toString().toInt()



        horizontalList.chips?.savedCardChip?.backgroundColor = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.savedCardChip.backgroundColor")).toString()
        horizontalList.chips?.savedCardChip?.labelTextFont = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.savedCardChip.labelTextFont")).toString()
        horizontalList.chips?.savedCardChip?.labelTextColor = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.savedCardChip.labelTextColor")).toString()
        horizontalList.chips?.savedCardChip?.selected?.shadow?.color = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.savedCardChip.selected.shadow.color")).toString()
        horizontalList.chips?.savedCardChip?.selected?.shadow?.radius = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.savedCardChip.selected.shadow.radius")).toString().toInt()
        horizontalList.chips?.savedCardChip?.selected?.shadow?.offsetWidth = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.savedCardChip.selected.shadow.offsetWidth")).toString().toInt()
        horizontalList.chips?.savedCardChip?.selected?.shadow?.offsetHeight = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.savedCardChip.selected.shadow.offsetHeight")).toString().toInt()
        horizontalList.chips?.savedCardChip?.selected?.shadow?.opacity = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.savedCardChip.unSelected.shadow.opacity")).toString().toInt()
        horizontalList.chips?.savedCardChip?.unSelected?.shadow?.offsetWidth = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.savedCardChip.unSelected.shadow.offsetWidth")).toString().toInt()
        horizontalList.chips?.savedCardChip?.unSelected?.shadow?.offsetHeight = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.savedCardChip.unSelected.shadow.offsetHeight")).toString().toInt()
        horizontalList.chips?.savedCardChip?.unSelected?.shadow?.opacity = Color.parseColor(ThemeManager.getValue("HorizontalList.chips.savedCardChip.unSelected.shadow.opacity")).toString().toInt()

    }

        fun setObject13(){
        var  itemsList = ItemList()
            itemsList.backgroundColor = Color.parseColor(ThemeManager.getValue("itemsList.backgroundColor")).toString()
            itemsList.separatorColor = Color.parseColor(ThemeManager.getValue("itemsList.separatorColor")).toString()
            itemsList.item?.descriptionBackgroundColor = Color.parseColor(ThemeManager.getValue("itemsList.item.descriptionBackgroundColor")).toString()
            itemsList.item?.descriptionBackgroundColor = Color.parseColor(ThemeManager.getValue("itemsList.item.descriptionBackgroundColor")).toString()


    }
}