package com.practice.counter_app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private  var count=0
    private fun increaseCounter():Int{
        count++
        return  count
    }
    private fun decreaseCounter():Int{
        count--
        return count
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //step 2
        val btn:Button=findViewById(R.id.button)
        val btn1:Button=findViewById(R.id.button1)

        val result:TextView=findViewById(R.id.textView)

        //step 3
        btn.setOnClickListener{
            result.setText(""+increaseCounter())

        }
        btn1.setOnClickListener(){
           result.setText(""+decreaseCounter())
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
