//package company.tap.thememanager.manager
//
//import androidx.core.graphics.toColorInt
//import company.tap.thememanager.models.inlinecard.InlineCard
//
///**
// * Created by OLAMONIR on 8/16/20.
//
//Copyright (c) 2020  Tap Payments.
//All rights reserved.
// **/
//
//open SetObject1InlineCard {
////    init {
//        val inlineCard = InlineCard()
//        inlineCard.commonAttributes?.backgroundColor = (ThemeManager.getValue("inlineCard.commonAttributes.backgroundColor")as String).toString()
//        inlineCard.commonAttributes?.borderColor = (ThemeManager.getValue("inlineCard.commonAttributes.borderColor")as String).toString()
//        inlineCard.commonAttributes?.cornerRadius = (ThemeManager.getValue("inlineCard.commonAttributes.cornerRadius")as String).toColorInt()
//        inlineCard.commonAttributes?.borderWidth = (ThemeManager.getValue("inlineCard.commonAttributes.borderWidth")as String).toColorInt()
//        inlineCard.commonAttributes?.itemSpacing = (ThemeManager.getValue("inlineCard.commonAttributes.itemSpacing")as String).toColorInt()
//        inlineCard.commonAttributes?.cvvPlaceHolder = (ThemeManager.getValue("inlineCard.commonAttributes.cvvPlaceHolder")as String).toString()
//
//        inlineCard.commonAttributes?.shadow?.color = (ThemeManager.getValue("inlineCard.commonAttributes.shadow.color")as String).toString()
//        inlineCard.commonAttributes?.shadow?.radius = (ThemeManager.getValue("inlineCard.commonAttributes.shadow.radius")as String).toColorInt()
//        inlineCard.commonAttributes?.shadow?.offsetWidth = (ThemeManager.getValue("inlineCard.commonAttributes.shadow.offsetWidth")as String).toColorInt()
//        inlineCard.commonAttributes?.shadow?.offsetHeight = (ThemeManager.getValue("inlineCard.commonAttributes.shadow.offsetHeight")as String).toColorInt()
//        inlineCard.commonAttributes?.widthMargin = (ThemeManager.getValue("inlineCard.commonAttributes.widthMargin")as String).toColorInt()
//
//        inlineCard.iconImage?.image = (ThemeManager.getValue("inlineCard.iconImage.image")as String).toString()
//        inlineCard.iconImage?.width = (ThemeManager.getValue("inlineCard.iconImage.width")as String).toColorInt()
//
//        inlineCard.scanImage?.image = (ThemeManager.getValue("inlineCard.scanImage.image")as String).toString()
//        inlineCard.scanImage?.selected = (ThemeManager.getValue("inlineCard.scanImage.selected")as String).toString()
//        inlineCard.scanImage?.width = (ThemeManager.getValue("inlineCard.scanImage.width")as String).toColorInt()
//
//
//        inlineCard.clearImage?.image = (ThemeManager.getValue("inlineCard.clearImage.image")as String).toString()
//        inlineCard.clearImage?.width = (ThemeManager.getValue("inlineCard.clearImage.width")as String).toColorInt()
//
//
//        inlineCard.textFields?.textColor = (ThemeManager.getValue("inlineCard.textFields.textColor")as String).toString()
//        inlineCard.textFields?.errorTextColor = (ThemeManager.getValue("inlineCard.textFields.errorTextColor")as String).toString()
//        inlineCard.textFields?.font = (ThemeManager.getValue("inlineCard.textFields.font")as String).toString()
//        inlineCard.textFields?.placeHolderColor = (ThemeManager.getValue("inlineCard.textFields.placeHolderColor")as String).toString()
//
//
//        inlineCard.saveCardOption?.labelTextColor = (ThemeManager.getValue("inlineCard.saveCardOption.labelTextColor")as String).toString()
//        inlineCard.saveCardOption?.labelTextFont = (ThemeManager.getValue("inlineCard.saveCardOption.labelTextFont")as String).toColorInt()
//        inlineCard.saveCardOption?.switchTintColor = (ThemeManager.getValue("inlineCard.saveCardOption.switchTintColor")as String).toString()
//        inlineCard.saveCardOption?.switchThumbColor = (ThemeManager.getValue("inlineCard.saveCardOption.switchThumbColor")as String).toString()
//        inlineCard.saveCardOption?.switchOnThumbColor = (ThemeManager.getValue("inlineCard.saveCardOption.switchOnThumbColor")as String).toString()
//
////    }
//
//}