package company.tap.thememanager.models.recentcards


/**
 * Created by OLAMONIR on 8/13/20.

Copyright (c) 2020  Tap Payments.
All rights reserved.
 **/

data class CommonAttributes (

	var backgroundColor : String? = null,
	var glowingBackgroundColor : String? = null,
	var borderColor : String? = null,
	var cornerRadius : Int? = null,
	var borderWidth : Int? = null,
	var itemSpacing : Int? = null,
	var chipHeight : Int? = null,
	var shadow : Shadow? = null,
	var glowingShadow : GlowingShadow? = null,
	var widthMargin : Int? = null
)