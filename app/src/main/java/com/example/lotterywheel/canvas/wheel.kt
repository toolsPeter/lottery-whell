package com.example.lotterywheel.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import androidx.core.content.contentValuesOf
import androidx.core.graphics.red

class wheel(context: Context):View(context) {
    private val red = Paint().apply {
        color = Color.parseColor("#FF0000")
    }
    private val orange = Paint().apply {
        color = Color.parseColor("#FF7F00")
    }
    private val yellow = Paint().apply {
        color = Color.parseColor("#FFFF00")
    }
    private val green = Paint().apply {
        color = Color.parseColor("#00FF00")
    }
    private val blue = Paint().apply {
        color = Color.parseColor("#00FFFF")
    }
    private val indigo = Paint().apply {
        color = Color.parseColor("#0000FF")
    }
    private val purple = Paint().apply {
        color = Color.parseColor("#8B00FF")
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawCircle(100f,100f,50f,red)
    }
}