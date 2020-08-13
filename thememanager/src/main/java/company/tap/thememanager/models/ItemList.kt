package company.tap.thememanager.models

/**
 * Created by AhlaamK on 8/13/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class ItemList (
        val backgroundColor: String? = null,
        val separatorColor: String? = null,
        val item: ItemTheme? = null

)

class ItemTheme (
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

class CountTheme (
        val backgroundColor: String? = null,
        val countLabelFont: String? = null,
        val countLabelColor: String? = null
 )
