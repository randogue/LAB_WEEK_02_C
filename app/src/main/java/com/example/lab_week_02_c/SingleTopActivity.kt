package com.example.lab_week_02_c

import android.app.ComponentCaller
import android.content.Intent
import android.os.Bundle
import android.os.Debug
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SingleTopActivity : AppCompatActivity() {

    companion object {
        private const val DEBUG = "SingleTopAct"
    }

    override fun onCreate(savedInstanceState: Bundle?) {//oncreate
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_single_top)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val myBtn = findViewById<Button>(R.id.button_single_top)
        myBtn.setOnClickListener {
            val myIntent = Intent(
                this@SingleTopActivity,
                SingleTopActivity::class.java
            )
            startActivity(myIntent)
        }

    }//--oncreate


    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Log.d(DEBUG, "newIntent Fired")
    }
}