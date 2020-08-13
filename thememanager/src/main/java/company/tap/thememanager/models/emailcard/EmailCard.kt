package company.tap.thememanager.models.emailcard


/**
 * Created by OLAMONIR on 8/13/20.

Copyright (c) 2020  Tap Payments.
All rights reserved.
 **/

data class EmailCard (

	val commonAttributes : CommonAttributes,
	val iconImage : IconImage,
	val clearImage : ClearImage,
	val textFields : TextFields
)