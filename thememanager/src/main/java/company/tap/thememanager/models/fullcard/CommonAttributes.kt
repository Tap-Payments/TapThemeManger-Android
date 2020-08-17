package company.tap.thememanager.models.fullcard

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
        val separatorColor : String? = null,
        val cvvPlaceHolder : String? = null,
        val shadow : Shadow? = null,
        var widthMargin : Int? = null
)