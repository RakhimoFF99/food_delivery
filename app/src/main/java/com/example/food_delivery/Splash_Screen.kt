package com.example.food_delivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash_Screen : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
<<<<<<< HEAD
=======

>>>>>>> adbff7b1c377d5841e428b4e2a467cbe333bf9ab
        handler = Handler()
        handler.postDelayed({
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
<<<<<<< HEAD
        },2000) // delaying 2 seconds to open

=======
        },2000 ) // delaying  3 seconds to open
>>>>>>> adbff7b1c377d5841e428b4e2a467cbe333bf9ab
    }
}