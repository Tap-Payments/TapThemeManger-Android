package company.tap.thememanager.models

/**
 * Created by AhlaamK on 8/13/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class goPay (
        val loginBar:LoginBar?= null,
        val passwordView:PasswordView?= null,
        val passwordField:PasswordField?= null

)

class PasswordView (
        val backgroundColor:String?= null
)

class PasswordField (
        val backgroundColor: String? = null,
        val textFont: String? = null,
        val textColor: String? = null,
        val placeHolderColor: String? = null,
        val showPasswordIcon: String? = null,
        val hidePasswordIcon: String? = null,
        val underline: underLinegoPay? = null

        )

class underLinegoPay (
        val empty:EmptyTheme?=null,
        val filled:FilledTheme?=null

)

class FilledTheme(
        val backgroundColor: String? = null)



class EmptyTheme (
        val backgroundColor: String? = null)

class LoginBar (
        val backgroundColor: String? = null,
        val underline: UnderLineTheme? = null,
        val title: TitleTheme? = null,
        val hintLabel: HintLabelTheme? = null

        )

class HintLabelTheme (
        val textFont: String? = null,
        val textColor: String? = null

)

class TitleTheme (
        val selected: selectedTitleTheme? = null,
        val otherSegmentSelected: otherSegmentSelectedTitleTheme? = null
)

class otherSegmentSelectedTitleTheme (
        val textFont: String? = null,
        val textColor: String? = null

        )

class selectedTitleTheme (
        val textFont: String? = null,
        val textColor: String? = null

        )

class UnderLineTheme(
        val selected: SelectedUnderLineTheme? = null,
        val unselected: UnSelectedUnderLineTheme? = null
)
