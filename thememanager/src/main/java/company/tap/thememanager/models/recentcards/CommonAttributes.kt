package company.tap.thememanager.models.recentcards


/**
 * Created by OLAMONIR on 8/13/20.

Copyright (c) 2020  Tap Payments.
All rights reserved.
 **/

data class CommonAttributes (

	var backgroundColor : String,
	var glowingBackgroundColor : String,
	var borderColor : String,
	var cornerRadius : Int,
	var borderWidth : Int,
	var itemSpacing : Int,
	var chipHeight : Int,
	var shadow : Shadow,
	var glowingShadow : GlowingShadow,
	var widthMargin : Int
)