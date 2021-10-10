package com.paragniist.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSubmit = findViewById<Button>(R.id.btn_submit)
        btnSubmit.setOnClickListener{

            val intent =Intent(this, AnotherActivity::class.java)
            intent.putExtra("key1","Value1")
            intent.putExtra("key2",1.337)
            startActivity(intent)

        }
    /*    Log.e("onCreate method", "is called")*/

    }

   /* override fun onStart() {
        super.onStart()
        Log.e("onStart method", "is called...")
    }*/

 /*   override fun onResume() {
        super.onResume()
        Log.e("onResume method", "is called...")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause method", "is called...")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop method", "is called...")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart method", "is called...")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy method", "is called...")
    }*/

}