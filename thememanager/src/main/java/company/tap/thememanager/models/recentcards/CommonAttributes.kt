package company.tap.thememanager.models.recentcards


/**
 * Created by OLAMONIR on 8/13/20.

Copyright (c) 2020  Tap Payments.
All rights reserved.
 **/

data class CommonAttributes (

	val backgroundColor : String,
	val glowingBackgroundColor : String,
	val borderColor : String,
	val cornerRadius : Int,
	val borderWidth : Int,
	val itemSpacing : Int,
	val chipHeight : Int,
	val shadow : Shadow,
	val glowingShadow : GlowingShadow,
	val widthMargin : Int
)