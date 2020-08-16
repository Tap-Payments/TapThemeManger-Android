package company.tap.thememanager.models.amountsectionview

/**
 * Created by AhlaamK on 8/13/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class AmountSectionView(
        var originalAmountLabelFont: String? = null,
        var originalAmountLabelColor: String? = null,
        var convertedAmountLabelFont: String? = null,
        var convertedAmountLabelColor: String? = null,
        var itemsLabelFont: String? = null,
        var itemsLabelColor: String? = null,
        var itemsNumberButtonBackgroundColor: String? = null,
        var itemsNumberButtonBorder: ButtonBorder? = null,
        var itemsNumberButtonCorner: Int? = null,
        var backgroundColor: Int? = null

)
