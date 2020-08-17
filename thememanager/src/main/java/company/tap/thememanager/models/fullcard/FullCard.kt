package company.tap.thememanager.models.fullcard

/**
 * Created by OLAMONIR on 8/13/20.

Copyright (c) 2020  Tap Payments.
All rights reserved.
 **/

data class FullCard (

	val commonAttributes : CommonAttributes? = null,
	val iconImage : IconImage? = null,
	val scanImage : ScanImage? = null,
	val textFields : TextFields? = null,
	val saveCardOption : SaveCardOption? = null
)