package com.kalmar.myfirstapplication

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

private const val MY_OWN_LOG_TAG = "MyOwnLog"
private const val IMAGE_BEFORE_TEXT = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bigRedButton: Button = findViewById(R.id.big_red_button)
        bigRedButton.setOnClickListener {
            val toast = Toast.makeText(this, getString(R.string.marvin_message), Toast.LENGTH_LONG)
            val toastContainer = toast.view as LinearLayout

            val toastTextView = toastContainer.getChildAt(0) as TextView
            toastTextView.textSize = 16f

            toastContainer.orientation = LinearLayout.HORIZONTAL
            val marvinImage = ImageView(this)
            marvinImage.setImageResource(R.drawable.marvin)
            toastContainer.addView(marvinImage, IMAGE_BEFORE_TEXT)

            toast.show()

        }
    }

}