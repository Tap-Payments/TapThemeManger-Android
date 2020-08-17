package company.tap.thememanager.models.inlinecard

/**
 * Created by OLAMONIR on 8/13/20.

Copyright (c) 2020  Tap Payments.
All rights reserved.
 **/


data class CommonAttributes (
	var backgroundColor : String? = null,
	var borderColor : String? = null,
	var cornerRadius : Int? = null,
	var borderWidth : Int? = null,
	var itemSpacing : Int? = null,
	var cvvPlaceHolder : String? = null,
	var shadow : Shadow? = null,
	var widthMargin : Int? = null
)