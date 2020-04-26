package company.tap.thememanager

import android.content.res.Resources
import android.graphics.Color
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.StringWriter
import java.nio.charset.StandardCharsets

/**
 *
 * Created by Mario Gamal on 4/26/20
 * Copyright © 2020 Tap Payments. All rights reserved.
 *
 */
@Suppress("UNCHECKED_CAST")
class TapThemeManager {

    private lateinit var theme: JSONObject

    fun loadTapTheme(resources: Resources, resId: Int) {
        val resourceReader = resources.openRawResource(resId)
        val writer = StringWriter()
        val reader = BufferedReader(InputStreamReader(resourceReader, StandardCharsets.UTF_8))
        var line = reader.readLine()
        while (line != null) {
            writer.write(line)
            line = reader.readLine()
        }
        theme = JSONObject(writer.toString())
    }

    fun <T> getValue(path: String): T {
        val pathComponent = path.split('.')
        var view = theme.getJSONObject(pathComponent[0])
        if (pathComponent.size > 2) {
            for (i in 1..pathComponent.size - 2) {
                view = view.getJSONObject(pathComponent[i])
            }
        }
        val valueKey = pathComponent[pathComponent.lastIndex]
        return view.get(valueKey) as T
    }
}