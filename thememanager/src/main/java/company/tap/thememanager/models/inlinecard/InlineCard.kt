package company.tap.thememanager.models.inlinecard

/**
 * Created by OLAMONIR on 8/13/20.

Copyright (c) 2020  Tap Payments.
All rights reserved.
 **/

data class InlineCard (

	val commonAttributes : CommonAttributes,
	val iconImage : IconImage,
	val scanImage : ScanImage,
	val clearImage : ClearImage,
	val textFields : TextFields,
	val saveCardOption : SaveCardOption
)