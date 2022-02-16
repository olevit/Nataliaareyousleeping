package com.example.nataliaareyousleeping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        right_button_image.setOnClickListener {
            val phrases = listOf(
                "Вже 6 година ранку.",
                "Вставай, ми там все покидали.",
                "Ми кинули все, Наталю, чесно.",
                "Наталю, ти що знову лежиш?",
                "А годинник йде...",
                "Хлопа хоч собі знайшла?",
                "Нагодуй нас!!!",
                "Вже діточок час народжувати...")

            val shuffledList = phrases.shuffled()
            second_text.text = shuffledList[0]
            third_text.text = shuffledList[1]
            forth_text.text = shuffledList[2]
        }
    }
}
