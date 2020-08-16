package company.tap.thememanager.models.horizontallist

/**
 * Created by AhlaamK on 8/16/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class tapChips (
        val radius:Int?=null,
        val currencyChip: CurrencyChips?=null,
        val gatewayChip: GatewayChips?=null,
        val goPayChip: GoPayChip?=null,
        val applePayChip: ApplePayChip?=null,
        val savedCardChip: SaveCardChip?=null


)