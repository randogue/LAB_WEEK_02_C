package com.example.lab_week_02_c

import android.app.ComponentCaller
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StandardActivity : AppCompatActivity() {

    companion object { //this time im using this
        private const val DEBUG = "StandardAct"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_standard)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d("StandardAct", "oncreate fired")

        findViewById<Button>(
            R.id.button_standard
        ).setOnClickListener {
            val myIntent = Intent(
                this@StandardActivity,
                StandardActivity::class.java)
            startActivity(myIntent)
        }//end of click listener

    }//end of onCreate()


    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Log.d(DEBUG, "onNewIntent Fired")
    }
}