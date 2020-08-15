package company.tap.thememanager.models

/**
 * Created by AhlaamK on 8/13/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class AmountSectionView(
        val originalAmountLabelFont: String? = null,
        val originalAmountLabelColor: String? = null,
        val convertedAmountLabelFont: String? = null,
        val convertedAmountLabelColor: String? = null,
        val itemsLabelFont: String? = null,
        val itemsLabelColor: String? = null,
        val itemsNumberButtonBackgroundColor: String? = null,
        val itemsNumberButtonBorder: ButtonBorder? = null,
        val itemsNumberButtonCorner: Int? = null,
        val backgroundColor: Int? = null

)

data class ButtonBorder(
        val color: String? = null,
        val width: Int? = null

)