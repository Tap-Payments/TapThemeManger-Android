package company.tap.thememanager.models

/**
 * Created by AhlaamK on 8/13/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
data class CardPhoneList (
        val backgroundColor: String? = null,
        val maxWidth: Int? = null,
        val insets: Int? = null,
        val underline: underTheme? = null,
        val icon: iconTheme? = null


)

class iconTheme (
        val selected: GenericSelectTheme? = null,
        val otherSegmentSelected: GenericOtherSelectTheme? = null,
        val unselected: GenericUnSelectTheme? = null
)

class GenericUnSelectTheme (
        val backgroundColor:String?=null,
        val alpha:String?=null
)

class GenericOtherSelectTheme (
        val backgroundColor:String?=null,
        val alpha:String?=null
)

class GenericSelectTheme(
       val backgroundColor:String?=null,
       val alpha:String?=null
)
class underTheme (
        val unselected:UnSelectedUnderLineTheme?=null,
        val selected:SelectedUnderLineTheme?=null
)

class SelectedUnderLineTheme (
        val backgroundColor:String?=null

)

class UnSelectedUnderLineTheme (
        val backgroundColor:String?=null

)
