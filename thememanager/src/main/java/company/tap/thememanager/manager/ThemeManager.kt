package company.tap.thememanager.manager

import android.content.Context
import android.content.res.Resources
import android.util.Log
import android.widget.Toast
import com.koushikdutta.ion.Ion
import org.json.JSONException
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
object ThemeManager {

    private lateinit var theme: JSONObject


    //// decide if we load json from path or assets

    fun loadTapTheme(resources: Resources, resId: Int) {
        val resourceReader = resources.openRawResource(resId)
        val writer = StringWriter()
        val reader = BufferedReader(InputStreamReader(resourceReader, StandardCharsets.UTF_8))
        var line = reader.readLine()
        while (line != null) {
            writer.write(line)
            line = reader.readLine()
        }
        try {
            theme = JSONObject(writer.toString())
        } catch ( e : JSONException) {
            Log.e("APP", "unexpected JSON exception", e);
            // Do something to recover ... or kill the app.
        }
    }

    fun loadTapTheme(context: Context, url: String) {
        Ion.with(context)
                .load(url)
                .asJsonObject()
                .setCallback { e, result ->
                    if (e != null) {
                        Toast.makeText(context, e.message, Toast.LENGTH_SHORT).show()
                    } else {
                        theme = JSONObject(result.toString())
                        Toast.makeText(context, "Theme switched", Toast.LENGTH_SHORT).show()
                    }
                }
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
//        baseTheme = view.get(valueKey) as String
        return view.get(valueKey) as T
    }



}