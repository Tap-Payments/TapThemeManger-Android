package company.tap.thememanager.models.actionbutton

/**
 * Created by AhlaamK on 8/13/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class ActionButton (
        var Common: CommonTheme?= null,
        var Invalid: InvalidTheme?= null,
        var Valid: ValidTheme?= null,
        var BackgroundColor: BackgroundColorTheme?= null

        )


