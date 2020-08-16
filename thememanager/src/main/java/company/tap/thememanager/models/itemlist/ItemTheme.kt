package company.tap.thememanager.models.itemlist

/**
 * Created by AhlaamK on 8/16/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class ItemTheme (
        var descriptionBackgroundColor: String? = null,
        var backgroundColor: String? = null,
        var titleLabelFont: String? = null,
        var titleLabelColor: String? = null,
        var descLabelFont: String? = null,
        var priceLabelFont: String? = null,
        var priceLabelColor: String? = null,
        var calculatedPriceLabelFont: String? = null,
        var calculatedPriceLabelColor: String? = null,
        var count: CountTheme? = null
)