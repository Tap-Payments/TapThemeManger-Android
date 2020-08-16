package company.tap.thememanager.models.horizontallist

/**
 * Created by AhlaamK on 8/16/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class SaveCardChip (
        var backgroundColor:String?=null,
        var labelTextFont:String?=null,
        var labelTextColor:String?=null,
        val selected: SelectedTheme?=null,
        val unSelected: UnSelectedTheme?=null
)