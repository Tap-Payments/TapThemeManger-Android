package company.tap.thememanager.models.hints

import company.tap.thememanager.models.hints.*

/**
 * Created by AhlaamK on 8/13/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class Hints (
        val Warning: WarningTheme?=null,
        val Error: ErrorTheme?=null,
        val Default: DefaultTheme?=null,
        val Scanned: ScannedTheme?=null,
        val GoPayLogin: GoPayLoginTheme?=null
)
