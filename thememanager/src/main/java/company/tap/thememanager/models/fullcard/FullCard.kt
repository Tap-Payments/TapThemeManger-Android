package company.tap.thememanager.models.fullcard

/**
 * Created by OLAMONIR on 8/13/20.

Copyright (c) 2020  Tap Payments.
All rights reserved.
 **/

data class FullCard (

	val commonAttributes : CommonAttributes,
	val iconImage : IconImage,
	val scanImage : ScanImage,
	val textFields : TextFields,
	val saveCardOption : SaveCardOption
)