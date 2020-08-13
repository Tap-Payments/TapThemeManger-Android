package company.tap.thememanager.models

/**
 * Created by AhlaamK on 8/13/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class Hints (
        val Warning:WarningTheme?=null,
        val Error:ErrorTheme?=null,
        val Default:DefaultTheme?=null,
        val Scanned:ScannedTheme?=null,
        val GoPayLogin:GoPayLoginTheme?=null
)

class GoPayLoginTheme (
        val textFont: String? = null,
        val textColor: String? = null,
        val backgroundColor: String? = null,
        val borderColor: String? = null,
        val actionButtonTextColor: String? = null,
        val actionButtonTextFont: String? = null
)


class ScannedTheme (
        val textFont: String? = null,
        val textColor: String? = null,
        val backgroundColor: String? = null,
        val borderColor: String? = null,
        val actionButtonTextColor: String? = null,
        val actionButtonTextFont: String? = null
)

class DefaultTheme (
        val textFont: String? = null,
        val textColor: String? = null,
        val backgroundColor: String? = null,
        val borderColor: String? = null,
        val actionButtonTextColor: String? = null,
        val actionButtonTextFont: String? = null
)

class ErrorTheme (
        val textFont: String? = null,
        val textColor: String? = null,
        val backgroundColor: String? = null,
        val borderColor: String? = null,
        val actionButtonTextColor: String? = null,
        val actionButtonTextFont: String? = null
)
class WarningTheme(
        val textFont: String? = null,
        val textColor: String? = null,
        val backgroundColor: String? = null,
        val borderColor: String? = null,
        val actionButtonTextColor: String? = null,
        val actionButtonTextFont: String? = null


        )
