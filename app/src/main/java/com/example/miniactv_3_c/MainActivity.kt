package com.example.miniactv_3_c

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (intent?.action == Intent.ACTION_SEND && intent.type == "text/plain") {
            handleSharedText(intent)
        }
    }

    private fun handleSharedText(intent: Intent) {
        val sharedText = intent.getStringExtra(Intent.EXTRA_TEXT)
        if (sharedText != null) {
            val endIntent = Intent()
            endIntent.setClass(this, SecondActivity::class.java)
            endIntent.putExtra(Intent.EXTRA_TEXT, sharedText)
            startActivity(endIntent)
            finish()
        } else {
            Toast.makeText(this, "No se ha podido obtener el texto compartido", Toast.LENGTH_SHORT).show()
        }
    }
}