package com.kalmar.myfirstapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

private const val MY_OWN_LOG_TAG = "MyOwnLog"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MY_OWN_LOG_TAG, "Стелется по ветру")
    }

    override fun onStart() {
        super.onStart()
//        Log.d(MY_OWN_LOG_TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_OWN_LOG_TAG, "Дым над вершиной Фудзи.")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_OWN_LOG_TAG, "В небо уносится")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_OWN_LOG_TAG,"И пропадает бесследно,")
    }

    override fun onRestart() {
        super.onRestart()
//    Log.d(MY_OWN_LOG_TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_OWN_LOG_TAG, "Словно кажет мне путь.")
    }
}