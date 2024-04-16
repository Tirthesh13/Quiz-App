package com.example.quizeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btn_start)
        val edName : EditText = findViewById(R.id.ed_name)

        btnStart.setOnClickListener{
            if (edName.text.isEmpty()){
                Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME,edName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}
