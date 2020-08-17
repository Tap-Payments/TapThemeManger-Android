package company.tap.thememanager.manager

import android.graphics.Color
import company.tap.thememanager.models.amountsectionview.AmountSectionView
import company.tap.thememanager.models.Colors
import company.tap.thememanager.models.MerchantHeaderView
import androidx.core.graphics.toColorInt
import company.tap.thememanager.models.actionbutton.ActionButton
import company.tap.thememanager.models.cardphonelist.CardPhoneList
import company.tap.thememanager.models.goPay.goPay
import company.tap.thememanager.models.hints.Hints
import company.tap.thememanager.models.horizontallist.HorizontalList
import company.tap.thememanager.models.itemlist.ItemList
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


  fun setObjectGlobalValues(){
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


        inlineCard.textFields?.textColor = (ThemeManager.getValue("inlineCard.textFields.textColor")as String).toString()
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


    fun setObject2PhoneCard(){
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

    }


    fun setObject3EmailCard(){
        val emailCard = EmailCard()

        emailCard.commonAttributes?.backgroundColor = (ThemeManager.getValue("emailCard.commonAttributes.backgroundColor")as String).toString()
        emailCard.commonAttributes?.borderColor = (ThemeManager.getValue("emailCard.commonAttributes.borderColor")as String).toString()
        emailCard.commonAttributes?.cornerRadius = (ThemeManager.getValue("emailCard.commonAttributes.cornerRadius")as String).toColorInt()
        emailCard.commonAttributes?.borderWidth = (ThemeManager.getValue("emailCard.commonAttributes.borderWidth")as String).toColorInt()
        emailCard.commonAttributes?.itemSpacing = (ThemeManager.getValue("emailCard.commonAttributes.itemSpacing")as String).toColorInt()
        emailCard.commonAttributes?.shadow?.color = (ThemeManager.getValue("emailCard.commonAttributes.shadow.color")as String).toString()
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
    }


    fun setObject4fullCard(){
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

    }


    fun setObject5RecentCards(){

        val recentCards = RecentCards()

        recentCards.backGroundColor = (ThemeManager.getValue("recentCards.backGroundColor")as String)as String
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
    }



    fun setObject6TapBottomSheet(){
        var tapBottomSheet = TapBottomSheet()
        tapBottomSheet.dimmedColor = (ThemeManager.getValue("tapBottomSheet.dimmedColor"))as String
    }


    fun setObject7TapSeparationLine(){
        var tapSeparationLine = TapSeparatorLine()
        tapSeparationLine.backgroundColor = (ThemeManager.getValue("tapSeparationLine.backgroundColor"))as String
        tapSeparationLine.height =(ThemeManager.getValue("tapSeparationLine.height ") as String).toInt()
        tapSeparationLine.initialTrailingConstraint =(ThemeManager.getValue("tapSeparationLine.initialTrailingConstraint ") as String).toInt()

    }


    fun setObject8TapDragHandler(){
        var tapDragHandler = TapDragHandler()
        tapDragHandler.image = (ThemeManager.getValue("tapDragHandler.image"))as String
        tapDragHandler.backgroundColor = (ThemeManager.getValue("tapDragHandler.backgroundColor"))as String
        tapDragHandler.width =(ThemeManager.getValue("tapDragHandler.width ") as String).toInt()
        tapDragHandler.height =(ThemeManager.getValue("tapDragHandler.height ") as String).toInt()
        tapDragHandler.corner =(ThemeManager.getValue("tapDragHandler.corner ") as String).toInt()
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
            itemsList.backgroundColor = Color.parseColor(ThemeManager.getValue("ItemList.backgroundColor")).toString()
            itemsList.separatorColor = Color.parseColor(ThemeManager.getValue("ItemList.separatorColor")).toString()
            itemsList.item?.descriptionBackgroundColor = Color.parseColor(ThemeManager.getValue("ItemList.item.descriptionBackgroundColor")).toString()
            itemsList.item?.backgroundColor = Color.parseColor(ThemeManager.getValue("ItemList.item.backgroundColor")).toString()
            itemsList.item?.titleLabelFont = Color.parseColor(ThemeManager.getValue("ItemList.item.titleLabelFont")).toString()
            itemsList.item?.titleLabelColor = Color.parseColor(ThemeManager.getValue("ItemList.item.titleLabelColor")).toString()
            itemsList.item?.descLabelFont = Color.parseColor(ThemeManager.getValue("ItemList.item.descLabelFont")).toString()
            itemsList.item?.priceLabelFont = Color.parseColor(ThemeManager.getValue("ItemList.item.priceLabelFont")).toString()
            itemsList.item?.priceLabelColor = Color.parseColor(ThemeManager.getValue("ItemList.item.priceLabelColor")).toString()
            itemsList.item?.calculatedPriceLabelFont = Color.parseColor(ThemeManager.getValue("ItemList.item.calculatedPriceLabelFont")).toString()
            itemsList.item?.calculatedPriceLabelColor = Color.parseColor(ThemeManager.getValue("ItemList.item.calculatedPriceLabelColor")).toString()
            itemsList.item?.count?.backgroundColor = Color.parseColor(ThemeManager.getValue("ItemList.item.count.backgroundColor")).toString()
            itemsList.item?.count?.countLabelFont = Color.parseColor(ThemeManager.getValue("ItemList.item.count.countLabelFont")).toString()
            itemsList.item?.count?.countLabelColor = Color.parseColor(ThemeManager.getValue("ItemList.item.count.countLabelColor")).toString()

        }


    fun setObject14(){
        var  cardPhoneList = CardPhoneList()
        cardPhoneList.backgroundColor = Color.parseColor(ThemeManager.getValue("CardPhoneList.backgroundColor")).toString()
        cardPhoneList.maxWidth = Color.parseColor(ThemeManager.getValue("CardPhoneList.maxWidth")).toString().toInt()
        cardPhoneList.insets = Color.parseColor(ThemeManager.getValue("CardPhoneList.insets")).toString().toInt()
        cardPhoneList.underline?.selected?.backgroundColor = Color.parseColor(ThemeManager.getValue("CardPhoneList.underline.selected.backgroundColor")).toString()
        cardPhoneList.underline?.unselected?.backgroundColor = Color.parseColor(ThemeManager.getValue("CardPhoneList.underline.unselected.backgroundColor")).toString()
        cardPhoneList.icon?.selected?.backgroundColor = Color.parseColor(ThemeManager.getValue("CardPhoneList.icon.selected.backgroundColor")).toString()
        cardPhoneList.icon?.selected?.alpha = Color.parseColor(ThemeManager.getValue("CardPhoneList.icon.selected.alpha")).toString()
        cardPhoneList.icon?.otherSegmentSelected?.backgroundColor = Color.parseColor(ThemeManager.getValue("CardPhoneList.icon.otherSegmentSelected.backgroundColor")).toString()
        cardPhoneList.icon?.otherSegmentSelected?.alpha = Color.parseColor(ThemeManager.getValue("CardPhoneList.icon.otherSegmentSelected.alpha")).toString()
        cardPhoneList.icon?.unselected?.backgroundColor = Color.parseColor(ThemeManager.getValue("CardPhoneList.icon.unselected.backgroundColor")).toString()
        cardPhoneList.icon?.unselected?.alpha = Color.parseColor(ThemeManager.getValue("CardPhoneList.icon.unselected.alpha")).toString()
    }

    fun setObject15(){
        var  hints = Hints()
        hints.Warning?.textFont = Color.parseColor(ThemeManager.getValue("Hints.Warning.textFont")).toString()
        hints.Warning?.textColor = Color.parseColor(ThemeManager.getValue("Hints.Warning.textColor")).toString()
        hints.Warning?.backgroundColor = Color.parseColor(ThemeManager.getValue("Hints.Warning.backgroundColor")).toString()
        hints.Warning?.borderColor = Color.parseColor(ThemeManager.getValue("Hints.Warning.borderColor")).toString()
        hints.Warning?.actionButtonTextColor = Color.parseColor(ThemeManager.getValue("Hints.Warning.actionButtonTextColor")).toString()
        hints.Warning?.actionButtonTextFont = Color.parseColor(ThemeManager.getValue("Hints.Warning.actionButtonTextFont")).toString()


        hints.Error?.textFont = Color.parseColor(ThemeManager.getValue("Hints.Error.textFont")).toString()
        hints.Error?.textColor = Color.parseColor(ThemeManager.getValue("Hints.Error.textColor")).toString()
        hints.Error?.backgroundColor = Color.parseColor(ThemeManager.getValue("Hints.Error.backgroundColor")).toString()
        hints.Error?.borderColor = Color.parseColor(ThemeManager.getValue("Hints.Error.borderColor")).toString()
        hints.Error?.actionButtonTextColor = Color.parseColor(ThemeManager.getValue("Hints.Error.actionButtonTextColor")).toString()
        hints.Error?.actionButtonTextFont = Color.parseColor(ThemeManager.getValue("Hints.Error.actionButtonTextFont")).toString()


        hints.Default?.textFont = Color.parseColor(ThemeManager.getValue("Hints.Default.textFont")).toString()
        hints.Default?.textColor = Color.parseColor(ThemeManager.getValue("Hints.Default.textColor")).toString()
        hints.Default?.backgroundColor = Color.parseColor(ThemeManager.getValue("Hints.Default.backgroundColor")).toString()
        hints.Default?.borderColor = Color.parseColor(ThemeManager.getValue("Hints.Default.borderColor")).toString()
        hints.Default?.actionButtonTextColor = Color.parseColor(ThemeManager.getValue("Hints.Default.actionButtonTextColor")).toString()
        hints.Default?.actionButtonTextFont = Color.parseColor(ThemeManager.getValue("Hints.Default.actionButtonTextFont")).toString()


        hints.Scanned?.textFont = Color.parseColor(ThemeManager.getValue("Hints.Scanned.textFont")).toString()
        hints.Scanned?.textColor = Color.parseColor(ThemeManager.getValue("Hints.Scanned.textColor")).toString()
        hints.Scanned?.backgroundColor = Color.parseColor(ThemeManager.getValue("Hints.Scanned.backgroundColor")).toString()
        hints.Scanned?.borderColor = Color.parseColor(ThemeManager.getValue("Hints.Scanned.borderColor")).toString()
        hints.Scanned?.actionButtonTextColor = Color.parseColor(ThemeManager.getValue("Hints.Scanned.actionButtonTextColor")).toString()
        hints.Scanned?.actionButtonTextFont = Color.parseColor(ThemeManager.getValue("Hints.Scanned.actionButtonTextFont")).toString()


        hints.GoPayLogin?.textFont = Color.parseColor(ThemeManager.getValue("Hints.GoPayLogin.textFont")).toString()
        hints.GoPayLogin?.textColor = Color.parseColor(ThemeManager.getValue("Hints.GoPayLogin.textColor")).toString()
        hints.GoPayLogin?.backgroundColor = Color.parseColor(ThemeManager.getValue("Hints.GoPayLogin.backgroundColor")).toString()
        hints.GoPayLogin?.borderColor = Color.parseColor(ThemeManager.getValue("Hints.GoPayLogin.borderColor")).toString()
        hints.GoPayLogin?.actionButtonTextColor = Color.parseColor(ThemeManager.getValue("Hints.GoPayLogin.actionButtonTextColor")).toString()
        hints.GoPayLogin?.actionButtonTextFont = Color.parseColor(ThemeManager.getValue("Hints.GoPayLogin.actionButtonTextFont")).toString()


    }

    fun setObject16(){
        var goPay = goPay()
        goPay.loginBar?.backgroundColor = Color.parseColor(ThemeManager.getValue("goPay.loginBar.backgroundColor")).toString()
        goPay.loginBar?.underline?.selected?.backgroundColor = Color.parseColor(ThemeManager.getValue("goPay.loginBar.underline.selected.backgroundColor")).toString()
        goPay.loginBar?.underline?.unselected?.backgroundColor = Color.parseColor(ThemeManager.getValue("goPay.loginBar.underline.unselected.backgroundColor")).toString()
        goPay.loginBar?.title?.selected?.textColor = Color.parseColor(ThemeManager.getValue("goPay.loginBar.title.selected.textColor")).toString()
        goPay.loginBar?.title?.selected?.textFont = Color.parseColor(ThemeManager.getValue("goPay.loginBar.title.selected.textFont")).toString()
        goPay.loginBar?.title?.otherSegmentSelected?.textColor = Color.parseColor(ThemeManager.getValue("goPay.loginBar.title.otherSegmentSelected.textColor")).toString()
        goPay.loginBar?.title?.otherSegmentSelected?.textFont = Color.parseColor(ThemeManager.getValue("goPay.loginBar.title.otherSegmentSelected.textFont")).toString()
        goPay.loginBar?.hintLabel?.textFont = Color.parseColor(ThemeManager.getValue("goPay.loginBar.hintLabel.textFont")).toString()
        goPay.loginBar?.hintLabel?.textColor = Color.parseColor(ThemeManager.getValue("goPay.loginBar.hintLabel.textColor")).toString()

        goPay.passwordView?.backgroundColor = Color.parseColor(ThemeManager.getValue("goPay.passwordView.backgroundColor")).toString()

        goPay.passwordField?.backgroundColor = Color.parseColor(ThemeManager.getValue("goPay.passwordField.backgroundColor")).toString()
        goPay.passwordField?.textFont = Color.parseColor(ThemeManager.getValue("goPay.passwordField.textFont")).toString()
        goPay.passwordField?.textColor = Color.parseColor(ThemeManager.getValue("goPay.passwordField.textColor")).toString()
        goPay.passwordField?.placeHolderColor = Color.parseColor(ThemeManager.getValue("goPay.passwordField.placeHolderColor")).toString()
        goPay.passwordField?.showPasswordIcon = Color.parseColor(ThemeManager.getValue("goPay.passwordField.showPasswordIcon")).toString()
        goPay.passwordField?.hidePasswordIcon = Color.parseColor(ThemeManager.getValue("goPay.passwordField.hidePasswordIcon")).toString()
        goPay.passwordField?.underline?.empty?.backgroundColor = Color.parseColor(ThemeManager.getValue("goPay.passwordField.underline.empty.backgroundColor")).toString()
        goPay.passwordField?.underline?.filled?.backgroundColor = Color.parseColor(ThemeManager.getValue("goPay.passwordField.underline.filled.backgroundColor")).toString()
    }

    fun setObject17(){
         var actionButton = ActionButton()
        actionButton.Common?.titleLabelFont = Color.parseColor(ThemeManager.getValue("ActionButton.Common.titleLabelFont")).toString()
        actionButton.Common?.titleLabelColor = Color.parseColor(ThemeManager.getValue("ActionButton.Common.titleLabelColor")).toString()
        actionButton.Common?.assets?.error = Color.parseColor(ThemeManager.getValue("ActionButton.Common.assets.error")).toString()
        actionButton.Common?.assets?.loading = Color.parseColor(ThemeManager.getValue("ActionButton.Common.assets.loading")).toString()
        actionButton.Common?.assets?.success = Color.parseColor(ThemeManager.getValue("ActionButton.Common.assets.success")).toString()


        actionButton.Invalid?.backgroundColor = Color.parseColor(ThemeManager.getValue("ActionButton.Invalid.backgroundColor")).toString()

        actionButton.Valid?.goLoginBackgroundColor = Color.parseColor(ThemeManager.getValue("ActionButton.Valid.goLoginBackgroundColor")).toString()
        actionButton.Valid?.paymentBackgroundColor = Color.parseColor(ThemeManager.getValue("ActionButton.Valid.paymentBackgroundColor")).toString()

        actionButton.BackgroundColor?.Otp = Color.parseColor(ThemeManager.getValue("ActionButton.BackgroundColor.Otp")).toString()
        actionButton.BackgroundColor?.default = Color.parseColor(ThemeManager.getValue("ActionButton.BackgroundColor.default")).toString()
    }
}