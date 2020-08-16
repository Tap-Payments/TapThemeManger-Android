package company.tap.thememanager.models.horizontallist

/**
 * Created by AhlaamK on 8/16/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class tapChips (
        var radius:Int?=null,
        var currencyChip: CurrencyChips?=null,
        var gatewayChip: GatewayChips?=null,
        var goPayChip: GoPayChip?=null,
        var applePayChip: ApplePayChip?=null,
        var savedCardChip: SaveCardChip?=null


)