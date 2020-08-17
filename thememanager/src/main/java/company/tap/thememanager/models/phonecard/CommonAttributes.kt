package company.tap.thememanager.models.phonecard

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
        val shadow : Shadow? = null,
        var widthMargin : Int? = null
)