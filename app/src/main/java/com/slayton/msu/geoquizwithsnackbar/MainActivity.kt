package com.slayton.msu.geoquizwithsnackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener {
            val snackbar = Snackbar.make(
                it,
                R.string.correct_snackbar,
                Snackbar.LENGTH_LONG)
                snackbar.show()
        }

        falseButton.setOnClickListener{
            val snackbar = Snackbar.make(
                it,
                R.string.incorrect_snackbar,
                Snackbar.LENGTH_LONG)
            snackbar.setTextColor(Color.BLACK)
            snackbar.setBackgroundTint(Color.RED)
            snackbar.show()
        }

    }
}