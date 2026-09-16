package com.example.foodexpress

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony
import android.renderscript.ScriptGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.foodexpress.databinding.ActivityStartBinding

// StartActivity holo ekta screen, jeta AppCompatActivity extend kore
class StartActivity : AppCompatActivity() {

    // ViewBinding use korchi jate XML er view gula easy access korte pari
    // by lazy mane holo binding object tokhon create hobe jokhon prothom dorkar hobe
    private val binding : ActivityStartBinding by lazy{    //screen inable korchi
        ActivityStartBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // setContentView diye kon layout show korbo ta set korlam
        // binding.root mane holo activity_start.xml er main layout
        setContentView(binding.root)

        // nextButton holo XML er ekta button
        // click korle nicher code run hobe
        binding.nextButton.setOnClickListener {
            // Intent diye LoginActivity te jump korar plan banailam
            val intent = Intent(this, LoginActivity::class.java)

            // startActivity diye actual vabe LoginActivity open korlam
            startActivity(intent)
        }
    }
}