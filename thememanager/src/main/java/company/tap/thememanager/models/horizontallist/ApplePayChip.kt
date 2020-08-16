package company.tap.thememanager.models.horizontallist

/**
 * Created by AhlaamK on 8/16/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class ApplePayChip(
        var backgroundColor:String?=null,
        var applePayTitleFont:String?=null,
        var applePayTitleColor:String?=null,
        var appleLogoTitleFont: String?=null,
        var appleLogoTitleColor: String?=null,
        var selected: SelectedTheme?=null,
        var unSelectedTheme: UnSelectedTheme?=null
)