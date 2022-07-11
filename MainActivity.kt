package com.suraj.paintapp

import android.graphics.Color
import android.graphics.Color.RED
import android.graphics.Paint
import android.graphics.Path
import android.hardware.camera2.params.RggbChannelVector.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.suraj.paintapp.PaintView.Companion.colorList
import com.suraj.paintapp.PaintView.Companion.currentBrush
import com.suraj.paintapp.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {
    companion object {
        var path = Path()
        var paintBrush = Paint()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val redBtn:ImageButton = findViewById(R.id.redColor)
        val buleBtn:ImageButton = findViewById(R.id.buleColor)
        val blackBtn:ImageButton = findViewById(R.id.blackColor)
        val eraser:ImageButton = findViewById(R.id.whiteColor)

        redBtn.setOnClickListener {
            Toast.makeText(this,"Red",Toast.LENGTH_LONG).show()
            paintBrush.setColor(Color.RED)
            currentColor(paintBrush.color)
        }
        buleBtn.setOnClickListener {
            Toast.makeText(this,"Bule",Toast.LENGTH_LONG).show()
            paintBrush.setColor(Color.BLUE)
            currentColor(paintBrush.color)
        }
        blackBtn.setOnClickListener {
            Toast.makeText(this,"Black",Toast.LENGTH_LONG).show()
            paintBrush.setColor(Color.BLACK)
            currentColor(paintBrush.color)
        }
        eraser.setOnClickListener {
            Toast.makeText(this,"Erased",Toast.LENGTH_LONG).show()
            pathList.clear()
           colorList.clear()
           path.reset()
        }
    }
    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }
}