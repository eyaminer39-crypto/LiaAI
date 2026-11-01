package com.eyamin.lia

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.EditText
import android.widget.Button

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.rgb(20, 18, 48))

        val title = TextView(this)
        title.text = "Lia AI"
        title.textSize = 36f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "হ্যালো! আমি লিয়া।\nআমি তোমার ব্যক্তিগত AI সহকারী।"
        subtitle.textSize = 20f
        subtitle.setTextColor(Color.WHITE)
        subtitle.gravity = Gravity.CENTER
        subtitle.setPadding(0, 30, 0, 30)

        val input = EditText(this)
        input.hint = "এখানে কিছু লিখো..."
        input.setSingleLine(true)
        input.setTextColor(Color.BLACK)
        input.setHintTextColor(Color.GRAY)
        input.setBackgroundColor(Color.WHITE)

        val button = Button(this)
        button.text = "Send"

        val reply = TextView(this)
        reply.text = "আমি তোমার কথা শুনছি!"
        reply.textSize = 18f
        reply.setTextColor(Color.WHITE)
        reply.setPadding(0, 30, 0, 0)

        button.setOnClickListener {
            val message = input.text.toString()
            if (message.isNotBlank()) {
                reply.text = "তুমি লিখেছো: $message"
                input.text.clear()
            }
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(input)
        layout.addView(button)
        layout.addView(reply)

        setContentView(layout)
    }
}
