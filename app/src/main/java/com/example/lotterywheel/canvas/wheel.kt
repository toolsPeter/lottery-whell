package com.example.lotterywheel.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View
import androidx.core.content.contentValuesOf
import androidx.core.graphics.red
import java.util.jar.Attributes

class wheel(context: Context,attrs:AttributeSet):View(context,attrs) {
    private lateinit var rectF:RectF
    private var counts:Int = 1
    private var startangle : Float = 0f
    private var whellangle : Float = 90f

    val red = Paint().apply {
        color = Color.parseColor("#FF0000")
        strokeWidth = 20f
        style = Paint.Style.FILL
        strokeCap = Paint.Cap.ROUND
    }
    val orange = Paint().apply {
        color = Color.parseColor("#FF7F00")
                strokeWidth = 20f
        style = Paint.Style.FILL
        strokeCap = Paint.Cap.ROUND
    }
    val yellow = Paint().apply {
        color = Color.parseColor("#FFFF00")
                strokeWidth = 20f
        style = Paint.Style.FILL
        strokeCap = Paint.Cap.ROUND
    }
    val green = Paint().apply {
        color = Color.parseColor("#00FF00")
                strokeWidth = 20f
        style = Paint.Style.FILL
        strokeCap = Paint.Cap.ROUND
    }
    val blue = Paint().apply {
        color = Color.parseColor("#00FFFF")
                strokeWidth = 20f
        style = Paint.Style.FILL
        strokeCap = Paint.Cap.ROUND
    }
    val indigo = Paint().apply {
        color = Color.parseColor("#0000FF")
                strokeWidth = 20f
        style = Paint.Style.FILL
        strokeCap = Paint.Cap.ROUND
    }
    val purple = Paint().apply {
        color = Color.parseColor("#8B00FF")
                strokeWidth = 20f
        style = Paint.Style.FILL
        strokeCap = Paint.Cap.ROUND
    }
    private var paints : Paint = red

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        rectF = RectF(w/8f,w/8f,w*7/8f,w*7/8f)
    }
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        for(i in 0 until counts){
            startangle = i.toFloat()/counts*360f
            whellangle = 360f/counts*1f
            val temp = i%7
            when(temp){
                0 -> paints = red
                1 -> paints = orange
                2 -> paints = yellow
                3 -> paints = green
                4 -> paints = blue
                5 -> paints = indigo
                6 -> paints = purple
            }
            canvas.drawArc(rectF,startangle,whellangle,true,paints)
        }
    }
    fun draw_wheel(count:Int){
        counts = count
        invalidate()
    }
}
