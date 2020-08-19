package company.tap.thememanager.manager

import android.graphics.Color
import androidx.annotation.ColorInt
import androidx.core.graphics.toColorInt
import company.tap.thememanager.models.Colors
import company.tap.thememanager.models.TapBottomSheet
import company.tap.thememanager.models.TapDragHandler
import company.tap.thememanager.models.TapSeparatorLine
import company.tap.thememanager.models.emailcard.EmailCard
import company.tap.thememanager.models.fullcard.FullCard
import company.tap.thememanager.models.inlinecard.CommonAttributes
import company.tap.thememanager.models.inlinecard.InlineCard
import company.tap.thememanager.models.inlinecard.Shadow
import company.tap.thememanager.models.phonecard.PhoneCard
import company.tap.thememanager.models.recentcards.RecentCards

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


  fun setObjectGlobalValues():Colors{
      var  colors = Colors()
      colors.apricot30 = (ThemeManager.getValue("GlobalValues.Colors.apricot30")as String).toColorInt()
      colors.black = (ThemeManager.getValue("GlobalValues.Colors.black")as String).toColorInt()
      colors.black50 = (ThemeManager.getValue("GlobalValues.Colors.black50")as String).toColorInt()
      colors.brownGrey = (ThemeManager.getValue("GlobalValues.Colors.brownGrey")as String).toColorInt()
      colors.brownGreyFive = (ThemeManager.getValue("GlobalValues.Colors.brownGreyFive")as String).toColorInt()
      colors.brownGreyThree = (ThemeManager.getValue("GlobalValues.Colors.brownGreyThree")as String).toColorInt()
      colors.brownGreyTwo = (ThemeManager.getValue("GlobalValues.Colors.brownGreyTwo")as String).toColorInt()
      colors.cherryRed = (ThemeManager.getValue("GlobalValues.Colors.cherryRed")as String).toColorInt()
      colors.cherryRed10 = (ThemeManager.getValue("GlobalValues.Colors.cherryRed10")as String).toColorInt()
      colors.cherryRed20 = (ThemeManager.getValue("GlobalValues.Colors.cherryRed20")as String).toColorInt()
      colors.clear = (ThemeManager.getValue("GlobalValues.Colors.clear")as String).toColorInt()
      colors.deepSkyBlue = (ThemeManager.getValue("GlobalValues.Colors.deepSkyBlue")as String).toColorInt()
      colors.white = (ThemeManager.getValue("GlobalValues.Colors.white")as String).toColorInt()
      colors.lightPeach = (ThemeManager.getValue("GlobalValues.Colors.lightPeach")as String).toColorInt()
      colors.greyishBrown = (ThemeManager.getValue("GlobalValues.Colors.greyishBrown")as String).toColorInt()
      colors.veryLightPinkTwo = (ThemeManager.getValue("GlobalValues.Colors.veryLightPinkTwo")as String).toColorInt()
      colors.whiteTwo = (ThemeManager.getValue("GlobalValues.Colors.whiteTwo")as String).toColorInt()
      colors.white30 = (ThemeManager.getValue("GlobalValues.Colors.white30")as String).toColorInt()
      colors.lightPeriwinkle = (ThemeManager.getValue("GlobalValues.Colors.lightPeriwinkle")as String).toColorInt()
      colors.white80 = (ThemeManager.getValue("GlobalValues.Colors.white80")as String).toColorInt()
      colors.vibrantGreen = (ThemeManager.getValue("GlobalValues.Colors.vibrantGreen")as String).toColorInt()
      colors.vibrantGreenTwo = (ThemeManager.getValue("GlobalValues.Colors.vibrantGreenTwo")as String).toColorInt()
      colors.paleLilac = (ThemeManager.getValue("GlobalValues.Colors.paleLilac")as String).toColorInt()
      colors.orange = (ThemeManager.getValue("GlobalValues.Colors.orange")as String).toColorInt()
      colors.reddishOrange20 = (ThemeManager.getValue("GlobalValues.Colors.reddishOrange20")as String).toColorInt()
      colors.deepSkyBlue15 = (ThemeManager.getValue("GlobalValues.Colors.deepSkyBlue15")as String).toColorInt()
      colors.veryLightPinkThree = (ThemeManager.getValue("GlobalValues.Colors.veryLightPinkThree")as String).toColorInt()
      colors.azure = (ThemeManager.getValue("GlobalValues.Colors.azure")as String).toColorInt()
      colors.brownGreySix = (ThemeManager.getValue("GlobalValues.Colors.brownGreySix")as String).toColorInt()
      colors.brownGreySeven = (ThemeManager.getValue("GlobalValues.Colors.brownGreySeven")as String).toColorInt()
      colors.white78 = (ThemeManager.getValue("GlobalValues.Colors.white78")as String).toColorInt()
      colors.brownGreyFour = (ThemeManager.getValue("GlobalValues.Colors.brownGreyFour")as String).toColorInt()
  return colors
  }



    public fun setObject1InlineCard():InlineCard{
        val inlineCard = InlineCard()
        inlineCard.commonAttributes?.backgroundColor = (ThemeManager.getValue("inlineCard.commonAttributes.backgroundColor")as String).toString()
        inlineCard.commonAttributes?.borderColor = (ThemeManager.getValue("inlineCard.commonAttributes.borderColor")as String).toString()
        inlineCard.commonAttributes?.cornerRadius = (ThemeManager.getValue("inlineCard.commonAttributes.cornerRadius")as String).toColorInt()
        inlineCard.commonAttributes?.borderWidth = (ThemeManager.getValue("inlineCard.commonAttributes.borderWidth")as String).toColorInt()
        inlineCard.commonAttributes?.itemSpacing = (ThemeManager.getValue("inlineCard.commonAttributes.itemSpacing")as String).toColorInt()
        inlineCard.commonAttributes?.cvvPlaceHolder = (ThemeManager.getValue("inlineCard.commonAttributes.cvvPlaceHolder")as String).toString()

        inlineCard.commonAttributes?.shadow?.color = (ThemeManager.getValue("inlineCard.commonAttributes.shadow.color")as String).toString()
        inlineCard.commonAttributes?.shadow?.radius = (ThemeManager.getValue("inlineCard.commonAttributes.shadow.radius")as String).toColorInt()
        inlineCard.commonAttributes?.shadow?.offsetWidth = (ThemeManager.getValue("inlineCard.commonAttributes.shadow.offsetWidth")as String).toColorInt()
        inlineCard.commonAttributes?.shadow?.offsetHeight = (ThemeManager.getValue("inlineCard.commonAttributes.shadow.offsetHeight")as String).toColorInt()
        inlineCard.commonAttributes?.widthMargin = (ThemeManager.getValue("inlineCard.commonAttributes.widthMargin")as String).toColorInt()

        inlineCard.iconImage?.image = (ThemeManager.getValue("inlineCard.iconImage.image")as String).toString()
        inlineCard.iconImage?.width = (ThemeManager.getValue("inlineCard.iconImage.width")as String).toColorInt()

        inlineCard.scanImage?.image = (ThemeManager.getValue("inlineCard.scanImage.image")as String).toString()
        inlineCard.scanImage?.selected = (ThemeManager.getValue("inlineCard.scanImage.selected")as String).toString()
        inlineCard.scanImage?.width = (ThemeManager.getValue("inlineCard.scanImage.width")as String).toColorInt()


        inlineCard.clearImage?.image = (ThemeManager.getValue("inlineCard.clearImage.image")as String).toString()
        inlineCard.clearImage?.width = (ThemeManager.getValue("inlineCard.clearImage.width")as String).toColorInt()


        inlineCard.textFields?.textColor = (ThemeManager.getValue("inlineCard.textFields.textColor")as String).toColorInt()
        inlineCard.textFields?.errorTextColor = (ThemeManager.getValue("inlineCard.textFields.errorTextColor")as String).toString()
        inlineCard.textFields?.font = (ThemeManager.getValue("inlineCard.textFields.font")as String).toString()
        inlineCard.textFields?.placeHolderColor = (ThemeManager.getValue("inlineCard.textFields.placeHolderColor")as String).toString()


        inlineCard.saveCardOption?.labelTextColor = (ThemeManager.getValue("inlineCard.saveCardOption.labelTextColor")as String).toString()
        inlineCard.saveCardOption?.labelTextFont = (ThemeManager.getValue("inlineCard.saveCardOption.labelTextFont")as String).toColorInt()
        inlineCard.saveCardOption?.switchTintColor = (ThemeManager.getValue("inlineCard.saveCardOption.switchTintColor")as String).toString()
        inlineCard.saveCardOption?.switchThumbColor = (ThemeManager.getValue("inlineCard.saveCardOption.switchThumbColor")as String).toString()
        inlineCard.saveCardOption?.switchOnThumbColor = (ThemeManager.getValue("inlineCard.saveCardOption.switchOnThumbColor")as String).toString()

        return inlineCard
    }


    fun setObject2PhoneCard(): PhoneCard{
        val phoneCard = PhoneCard()

        phoneCard.commonAttributes?.backgroundColor = (ThemeManager.getValue("phoneCard.commonAttributes.backgroundColor")as String).toString()
        phoneCard.commonAttributes?.borderColor = (ThemeManager.getValue("phoneCard.commonAttributes.borderColor")as String).toString()
        phoneCard.commonAttributes?.cornerRadius = (ThemeManager.getValue("phoneCard.commonAttributes.cornerRadius")as String).toColorInt()
        phoneCard.commonAttributes?.borderWidth = (ThemeManager.getValue("phoneCard.commonAttributes.borderWidth")as String).toColorInt()
        phoneCard.commonAttributes?.itemSpacing = (ThemeManager.getValue("phoneCard.commonAttributes.itemSpacing")as String).toColorInt()
        phoneCard.commonAttributes?.shadow?.color = (ThemeManager.getValue("phoneCard.commonAttributes.shadow.color")as String).toString()
        phoneCard.commonAttributes?.shadow?.radius = (ThemeManager.getValue("phoneCard.commonAttributes.shadow.radius")as String).toColorInt()
        phoneCard.commonAttributes?.shadow?.offsetWidth = (ThemeManager.getValue("phoneCard.commonAttributes.shadow.offsetWidth")as String).toColorInt()
        phoneCard.commonAttributes?.shadow?.offsetHeight = (ThemeManager.getValue("phoneCard.commonAttributes.shadow.offsetHeight")as String).toColorInt()
        phoneCard.commonAttributes?.shadow?.opacity = (ThemeManager.getValue("phoneCard.commonAttributes.shadow.opacity")as String).toColorInt()
        phoneCard.commonAttributes?.widthMargin = (ThemeManager.getValue("phoneCard.commonAttributes.widthMargin")as String).toColorInt()


        phoneCard.iconImage?.image = (ThemeManager.getValue("phoneCard.iconImage.image")as String).toString()
        phoneCard.iconImage?.width = (ThemeManager.getValue("phoneCard.iconImage.width")as String).toColorInt()

        phoneCard.clearImage?.image = (ThemeManager.getValue("phoneCard.clearImage.image")as String).toString()
        phoneCard.clearImage?.width = (ThemeManager.getValue("phoneCard.clearImage.width")as String).toColorInt()


        phoneCard.textFields?.textColor = (ThemeManager.getValue("phoneCard.textFields.textColor")as String).toString()
        phoneCard.textFields?.errorTextColor = (ThemeManager.getValue("phoneCard.textFields.errorTextColor")as String).toString()
        phoneCard.textFields?.font = (ThemeManager.getValue("phoneCard.textFields.font")as String).toString()
        phoneCard.textFields?.placeHolderColor = (ThemeManager.getValue("phoneCard.textFields.placeHolderColor")as String).toString()

        return phoneCard
    }


    fun setObject3EmailCard() : EmailCard{
        val emailCard = EmailCard()

        emailCard.commonAttributes?.backgroundColor = (ThemeManager.getValue("emailCard.commonAttributes.backgroundColor")as String).toString()
        emailCard.commonAttributes?.borderColor = (ThemeManager.getValue("emailCard.commonAttributes.borderColor")as String).toString()
        emailCard.commonAttributes?.cornerRadius = (ThemeManager.getValue("emailCard.commonAttributes.cornerRadius")as String).toColorInt()
        emailCard.commonAttributes?.borderWidth = (ThemeManager.getValue("emailCard.commonAttributes.borderWidth")as String).toColorInt()
        emailCard.commonAttributes?.itemSpacing = (ThemeManager.getValue("emailCard.commonAttributes.itemSpacing")as String).toColorInt()
        emailCard.commonAttributes?.shadow?.color = (ThemeManager.getValue("emailCard.commonAttributes.shadow.color")as String)
        emailCard.commonAttributes?.shadow?.radius = (ThemeManager.getValue("emailCard.commonAttributes.shadow.radius")as String).toColorInt()
        emailCard.commonAttributes?.shadow?.offsetWidth = (ThemeManager.getValue("emailCard.commonAttributes.shadow.offsetWidth")as String).toColorInt()
        emailCard.commonAttributes?.shadow?.offsetHeight = (ThemeManager.getValue("emailCard.commonAttributes.shadow.offsetHeight")as String).toColorInt()
        emailCard.commonAttributes?.shadow?.opacity = (ThemeManager.getValue("emailCard.commonAttributes.shadow.opacity")as String).toColorInt()
        emailCard.commonAttributes?.widthMargin = (ThemeManager.getValue("emailCard.commonAttributes.widthMargin")as String).toColorInt()


        emailCard.iconImage?.image = (ThemeManager.getValue("emailCard.iconImage.image")as String).toString()
        emailCard.iconImage?.width = (ThemeManager.getValue("emailCard.iconImage.width")as String).toColorInt()

        emailCard.clearImage?.image = (ThemeManager.getValue("emailCard.clearImage.image")as String).toString()
        emailCard.clearImage?.width = (ThemeManager.getValue("emailCard.clearImage.width")as String).toColorInt()


        emailCard.textFields?.textColor = (ThemeManager.getValue("emailCard.textFields.textColor")as String).toString()
        emailCard.textFields?.errorTextColor = (ThemeManager.getValue("emailCard.textFields.errorTextColor")as String).toString()
        emailCard.textFields?.font = (ThemeManager.getValue("emailCard.textFields.font")as String).toString()
        emailCard.textFields?.placeHolderColor = (ThemeManager.getValue("emailCard.textFields.placeHolderColor")as String).toString()

        return emailCard
    }


    fun setObject4fullCard() : FullCard{
        val fullCard = FullCard()

        fullCard.commonAttributes?.backgroundColor = (ThemeManager.getValue("fullCard.commonAttributes.backgroundColor")as String).toString()
        fullCard.commonAttributes?.borderColor = (ThemeManager.getValue("fullCard.commonAttributes.borderColor")as String).toString()
        fullCard.commonAttributes?.cornerRadius = (ThemeManager.getValue("fullCard.commonAttributes.cornerRadius")as String).toColorInt()
        fullCard.commonAttributes?.borderWidth = (ThemeManager.getValue("fullCard.commonAttributes.borderWidth")as String).toColorInt()
        fullCard.commonAttributes?.itemSpacing = (ThemeManager.getValue("fullCard.commonAttributes.itemSpacing")as String).toColorInt()
        fullCard.commonAttributes?.shadow?.color = (ThemeManager.getValue("fullCard.commonAttributes.shadow.color")as String).toString()
        fullCard.commonAttributes?.shadow?.radius = (ThemeManager.getValue("fullCard.commonAttributes.shadow.radius")as String).toColorInt()
        fullCard.commonAttributes?.shadow?.offsetWidth = (ThemeManager.getValue("fullCard.commonAttributes.shadow.offsetWidth")as String).toColorInt()
        fullCard.commonAttributes?.shadow?.offsetHeight = (ThemeManager.getValue("fullCard.commonAttributes.shadow.offsetHeight")as String).toColorInt()
        fullCard.commonAttributes?.shadow?.opacity = (ThemeManager.getValue("fullCard.commonAttributes.shadow.opacity")as String).toColorInt()
        fullCard.commonAttributes?.widthMargin = (ThemeManager.getValue("fullCard.commonAttributes.widthMargin")as String).toColorInt()


        fullCard.iconImage?.image = (ThemeManager.getValue("fullCard.iconImage.image")as String).toString()
        fullCard.iconImage?.width = (ThemeManager.getValue("fullCard.iconImage.width")as String).toColorInt()

        fullCard.textFields?.textColor = (ThemeManager.getValue("fullCard.textFields.textColor")as String).toString()
        fullCard.textFields?.errorTextColor = (ThemeManager.getValue("fullCard.textFields.errorTextColor")as String).toString()
        fullCard.textFields?.font = (ThemeManager.getValue("fullCard.textFields.font")as String).toColorInt()
        fullCard.textFields?.placeHolderColor = (ThemeManager.getValue("fullCard.textFields.placeHolderColor")as String).toString()


        fullCard.saveCardOption?.labelTextColor = (ThemeManager.getValue("fullCard.saveCardOption.labelTextColor")as String).toString()
        fullCard.saveCardOption?.labelTextFont = (ThemeManager.getValue("fullCard.saveCardOption.labelTextFont")as String).toColorInt()
        fullCard.saveCardOption?.switchTintColor = (ThemeManager.getValue("fullCard.saveCardOption.switchTintColor")as String).toString()
        fullCard.saveCardOption?.switchThumbColor = (ThemeManager.getValue("fullCard.saveCardOption.switchThumbColor")as String).toString()
        fullCard.saveCardOption?.switchOnThumbColor = (ThemeManager.getValue("fullCard.saveCardOption.switchOnThumbColor")as String).toString()
        return fullCard
    }


    fun setObject5RecentCards() : RecentCards{

        val recentCards = RecentCards()

        recentCards.backGroundColor = (ThemeManager.getValue("recentCards.backGroundColor")as String)
        recentCards.collectionView?.spaceBetweenCells = (ThemeManager.getValue("recentCards.collectionView.spaceBetweenCells") as String).toInt()
        recentCards.collectionView?.backgroundColor = (ThemeManager.getValue("recentCards.collectionView.backgroundColor"))as String
        recentCards.collectionView?.height =(ThemeManager.getValue("recentCards.collectionView.height") as String).toInt()
        recentCards.collectionView?.borderColor = (ThemeManager.getValue("recentCards.collectionView.borderColor"))as String
        recentCards.collectionView?.cornerRadius =(ThemeManager.getValue("recentCards.collectionView.cornerRadius") as String).toInt()
        recentCards.collectionView?.borderWidth =(ThemeManager.getValue("recentCards.collectionView.borderWidth") as String).toInt()
        recentCards.headerView?.buttons?.textColor = (ThemeManager.getValue("recentCards.headerView.buttons.textColor"))as String
        recentCards.headerView?.buttons?.font =(ThemeManager.getValue("recentCards.headerView.buttons.font") as String).toInt()
        recentCards.headerView?.buttons?.backGroundColor = (ThemeManager.getValue("recentCards.headerView.buttons.backGroundColor"))as String
        recentCards.headerView?.backGroundColor = (ThemeManager.getValue("recentCards.headerView.backGroundColor"))as String
        recentCards.chipUI?.commonAttributes?.backgroundColor = (ThemeManager.getValue("recentCards.chipUI.commonAttributes.backgroundColor"))as String
        recentCards.chipUI?.commonAttributes?.glowingBackgroundColor = (ThemeManager.getValue("recentCards.chipUI.commonAttributes.glowingBackgroundColor"))as String
        recentCards.chipUI?.commonAttributes?.borderColor = (ThemeManager.getValue("recentCards.chipUI.commonAttributes.borderColor"))as String
        recentCards.chipUI?.commonAttributes?.cornerRadius =(ThemeManager.getValue("recentCards.chipUI.commonAttributes.cornerRadius") as String).toInt()
        recentCards.chipUI?.commonAttributes?.chipHeight =(ThemeManager.getValue("recentCards.chipUI.commonAttributes.chipHeight") as String).toInt()

        recentCards.chipUI?.commonAttributes?.shadow?.color = (ThemeManager.getValue("recentCards.chipUI.commonAttributes.shadow.color"))as String
        recentCards.chipUI?.commonAttributes?.shadow?.radius=(ThemeManager.getValue("recentCards.chipUI.commonAttributes.shadow.radius") as String).toInt()
        recentCards.chipUI?.commonAttributes?.shadow?.offsetWidth=(ThemeManager.getValue("recentCards.chipUI.commonAttributes.shadow.offsetWidth") as String).toInt()
        recentCards.chipUI?.commonAttributes?.shadow?.offsetHeight=(ThemeManager.getValue("recentCards.chipUI.commonAttributes.shadow.offsetHeight") as String).toInt()
        recentCards.chipUI?.commonAttributes?.shadow?.opacity=(ThemeManager.getValue("recentCards.chipUI.commonAttributes.shadow.opacity") as String).toInt()

        recentCards.chipUI?.commonAttributes?.glowingShadow?.color = (ThemeManager.getValue("recentCards.chipUI.commonAttributes.glowingShadow.color"))as String
        recentCards.chipUI?.commonAttributes?.glowingShadow?.radius=(ThemeManager.getValue("recentCards.chipUI.commonAttributes.glowingShadow.radius") as String).toInt()
        recentCards.chipUI?.commonAttributes?.glowingShadow?.offsetWidth=(ThemeManager.getValue("recentCards.chipUI.commonAttributes.glowingShadow.offsetWidth") as String).toInt()
        recentCards.chipUI?.commonAttributes?.glowingShadow?.offsetHeight=(ThemeManager.getValue("recentCards.chipUI.commonAttributes.glowingShadow.offsetHeight") as String).toInt()
        recentCards.chipUI?.commonAttributes?.glowingShadow?.opacity=(ThemeManager.getValue("recentCards.chipUI.commonAttributes.glowingShadow.opacity") as String).toInt()

        recentCards.chipUI?.commonAttributes?.widthMargin=(ThemeManager.getValue("recentCards.chipUI.commonAttributes.widthMargin") as String).toInt()

        recentCards.chipUI?.rightAccessory?.width=(ThemeManager.getValue("recentCards.chipUI.rightAccessory.width") as String).toInt()

        recentCards.chipUI?.leftAccessory?.width=(ThemeManager.getValue("recentCards.chipUI.leftAccessory.width") as String).toInt()

        recentCards.chipUI?.contentLabel?.textColor = (ThemeManager.getValue("recentCards.chipUI.contentLabel?.textColor"))as String
        recentCards.chipUI?.contentLabel?.textFont=(ThemeManager.getValue("recentCards.chipUI.contentLabel.textFont") as String).toInt()
        return recentCards
    }



    fun setObject6TapBottomSheet() : TapBottomSheet{
        var tapBottomSheet = TapBottomSheet()
        tapBottomSheet.dimmedColor = (ThemeManager.getValue("tapBottomSheet.dimmedColor"))as String
        return tapBottomSheet
    }


    fun setObject7TapSeparationLine(): TapSeparatorLine{
        var tapSeparationLine = TapSeparatorLine()
        tapSeparationLine.backgroundColor = (ThemeManager.getValue("tapSeparationLine.backgroundColor"))as String
        tapSeparationLine.height =(ThemeManager.getValue("tapSeparationLine.height ") as String).toInt()
        tapSeparationLine.initialTrailingConstraint =(ThemeManager.getValue("tapSeparationLine.initialTrailingConstraint ") as String).toInt()

        return tapSeparationLine
    }


    fun setObject8TapDragHandler() : TapDragHandler{
        var tapDragHandler = TapDragHandler()
        tapDragHandler.image = (ThemeManager.getValue("tapDragHandler.image"))as String
        tapDragHandler.backgroundColor = (ThemeManager.getValue("tapDragHandler.backgroundColor"))as String
        tapDragHandler.width =(ThemeManager.getValue("tapDragHandler.width ") as String).toInt()
        tapDragHandler.height =(ThemeManager.getValue("tapDragHandler.height ") as String).toInt()
        tapDragHandler.corner =(ThemeManager.getValue("tapDragHandler.corner ") as String).toInt()
        return tapDragHandler
    }




}