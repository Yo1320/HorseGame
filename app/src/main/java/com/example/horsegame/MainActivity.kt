package com.example.horsegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initScreenGame()
    }
    private fun initScreenGame(){
        setSizeBoard()
        hide_message()
    }
    private fun setSizeBoard(){

    }
    Private fun hide_message(){
        var lyMessage
    }
}