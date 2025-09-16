package com.example.lab_week_02_c

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    companion object {
        private const val DEBUG = "MainAct"
    }
    override fun onCreate(savedInstanceState: Bundle?) {//oncreate
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d(DEBUG, "onCreate Fired")


        val buttonClickListener = View.OnClickListener {
            view ->
            when (view.id) {
                R.id.button_standard -> startActivity(//btn std
                    Intent (
                        this@MainActivity,
                        StandardActivity::class.java
                    )
                )//--btn std
                R.id.button_single_top -> startActivity(//btn stp
                    Intent (
                        this@MainActivity,
                        SingleTopActivity::class.java
                    )
                )//--btn stp
            }
        }//--clicklistener
    }//--oncreate
}