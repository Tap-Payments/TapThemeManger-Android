package company.tap.thememanager.models.goPay

import company.tap.thememanager.models.cardphonelist.SelectedUnderLineTheme
import company.tap.thememanager.models.cardphonelist.UnSelectedUnderLineTheme

/**
 * Created by AhlaamK on 8/16/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class UnderLineTheme(
        val selected: SelectedUnderLineTheme? = null,
        val unselected: UnSelectedUnderLineTheme? = null
)