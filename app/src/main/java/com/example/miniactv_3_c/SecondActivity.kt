package com.example.miniactv_3_c

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (intent.extras != null) {
            textView = findViewById(R.id.shared_text_view)
            textView.text = intent.getStringExtra(Intent.EXTRA_TEXT)
        }
    }
}