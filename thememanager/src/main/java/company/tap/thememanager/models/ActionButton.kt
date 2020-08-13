package company.tap.thememanager.models

/**
 * Created by AhlaamK on 8/13/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class ActionButton (
        val Common:CommonTheme?= null,
        val Invalid:InvalidTheme?= null,
        val Valid:ValidTheme?= null,
        val BackgroundColor:BackgroundColorTheme?= null

        )

class BackgroundColorTheme (
        val Otp: String? = null,
        val default: String? = null

        )

class ValidTheme (
        val goLoginBackgroundColor: String? = null,
        val paymentBackgroundColor: String? = null

        )

class InvalidTheme {
val backgroundColor :String?=null
}

class CommonTheme (
        val titleLabelFont: String? = null,
        val titleLabelColor: String? = null,
        val assets: AssetsTheme? = null

        )

class AssetsTheme (
        val loading: String? = null,
        val error: String? = null,
        val success: String? = null

        )