package company.tap.thememanager.models.emailcard


/**
 * Created by OLAMONIR on 8/13/20.

Copyright (c) 2020  Tap Payments.
All rights reserved.
 **/

data class EmailCard (

	val commonAttributes : CommonAttributes? = null,
	val iconImage : IconImage? = null,
	val clearImage : ClearImage? = null,
	val textFields : TextFields? = null
)