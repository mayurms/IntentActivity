package com.example.intentimplementkt

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //        Explicit Intent
        val explicitButton = findViewById<Button>(R.id.button)

        explicitButton.setOnClickListener{
            val explicitIntent = Intent(this,SecondActivity::class.java)

            startActivity(explicitIntent)
            finish()
        }

        //        Implicit Intent
        val url ="https://www.google.com/"
        val implicitButton = findViewById<Button>(R.id.Impbutton)
        
        implicitButton.setOnClickListener{
            val ImplicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

            startActivity(ImplicitIntent)
        }


    }
}