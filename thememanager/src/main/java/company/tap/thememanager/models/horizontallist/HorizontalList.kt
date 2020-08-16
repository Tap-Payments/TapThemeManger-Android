package company.tap.thememanager.models.horizontallist

/**
 * Created by AhlaamK on 8/13/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class HorizontalList(
        var backgroundColor: String? = null,
        var itemSpacing: Int? = null,
        var margin: Int? = null,
        var  headers: tapHeaders? = null,
        var chips: tapChips? = null

        )