package company.tap.thememanager.models.horizontallist

/**
 * Created by AhlaamK on 8/16/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class GoPayChip (
        var backgroundColor:String?=null,
        var labelTextFont:String?=null,
        var labelTextColor:String?=null,
        var selected: SelectedTheme?=null,
        var unSelected: UnSelectedTheme?=null
)