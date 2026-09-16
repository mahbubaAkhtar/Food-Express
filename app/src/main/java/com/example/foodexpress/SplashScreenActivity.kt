package com.example.foodexpress

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)
        // Handler diye ekta delayed task run korlam
        /*Delayed task holo ekta kaj ke future time e kichu run korar jonno schedule kore.
        Foe example: Splash screen dekhabe  → 3 second pore MainActivity  te chole jabe */
        Handler().postDelayed({
            // Intent banailam, current activity theke MainActivity te jabar jonno
            val intent = Intent(this, StartActivity::class.java)

            // Ei intent diye MainActivity open korlam
            startActivity(intent)

            // Current activity (splash screen) close kore dilam
            finish()

//  Ei pura kaj 3000 milliseconds = 3 second pore hobe
        }, 3000)
    }
}