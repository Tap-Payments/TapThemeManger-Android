package company.tap.thememanager.models.itemlist

/**
 * Created by AhlaamK on 8/16/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class ItemTheme (
        val descriptionBackgroundColor: String? = null,
        val backgroundColor: String? = null,
        val titleLabelFont: String? = null,
        val titleLabelColor: String? = null,
        val descLabelFont: String? = null,
        val priceLabelFont: String? = null,
        val priceLabelColor: String? = null,
        val calculatedPriceLabelFont: String? = null,
        val calculatedPriceLabelColor: String? = null,
        val count: CountTheme? = null
)