package company.tap.thememanager.models.actionbutton

/**
 * Created by AhlaamK on 8/13/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class ActionButton (
        val Common: CommonTheme?= null,
        val Invalid: InvalidTheme?= null,
        val Valid: ValidTheme?= null,
        val BackgroundColor: BackgroundColorTheme?= null

        )


