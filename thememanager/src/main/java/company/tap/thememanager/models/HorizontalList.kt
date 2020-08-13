package company.tap.thememanager.models

/**
 * Created by AhlaamK on 8/13/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class HorizontalList(
        val backgroundColor: String? = null,
        val itemSpacing: Int? = null,
        val margin: Int? = null,
        val  headers: tapHeaders? = null,
        val chips: tapChips? = null

        )

class tapChips (
        val radius:Int?=null,
        val currencyChip:CurrencyChips?=null,
        val gatewayChip:GatewayChips?=null,
        val goPayChip:GoPayChip?=null,
        val applePayChip:ApplePayChip?=null,
        val savedCardChip:SaveCardChip?=null


)

class SaveCardChip (
        val backgroundColor:String?=null,
        val labelTextFont:String?=null,
        val labelTextColor:String?=null,
        val selected:SelectedTheme?=null,
        val unSelected:UnSelectedTheme?=null
)

class ApplePayChip(
        val backgroundColor:String?=null,
        val labelTextFont:String?=null,
        val labelTextColor:String?=null,
        val selected:SelectedTheme?=null,
        val unSelected:UnSelectedTheme?=null
)
class GoPayChip (
        val backgroundColor:String?=null,
        val labelTextFont:String?=null,
        val labelTextColor:String?=null,
        val selected:SelectedTheme?=null,
        val unSelected:UnSelectedTheme?=null
)
class GatewayChips (
        val backgroundColor:String?=null,
        val shadow:ShadowTheme?=null

)

class CurrencyChips (
        val backgroundColor:String?=null,
        val labelTextFont:String?=null,
        val labelTextColor:String?=null,
        val selected:SelectedTheme?=null,
        val unSelected:UnSelectedTheme?=null

)

class UnSelectedTheme (
        val shadow:ShadowTheme?=null
)

class SelectedTheme (
        val shadow:ShadowTheme?=null
)

class ShadowTheme (
        val color:String?=null,
        val radius:Int?=null,
        val offsetWidth:Int?=null,
        val offsetHeight:Int?=null,
        val opacity:Int?=null
)
class tapHeaders
(
        val gatewayHeader: String? = null,
        val backgroundColor: String? = null,
        val leftButton: leftButtonAttr? = null

)

class leftButtonAttr (
        val labelTextFont:String?=null,
        val labelTextColor:String?=null

)
