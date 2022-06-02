package com.ravisharma.piechart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = floatArrayOf(12f, 6f, 32f)
        val colors = intArrayOf(
            ContextCompat.getColor(this, R.color.red),
            ContextCompat.getColor(this, R.color.yellow),
            ContextCompat.getColor(this, R.color.green)
        )
        val colorStroke = intArrayOf(
            ContextCompat.getColor(this, R.color.redStroke),
            ContextCompat.getColor(this, R.color.yellowStroke),
            ContextCompat.getColor(this, R.color.greenStroke)
        )
        val name = arrayOf("兄弟", "姐妹", "情侣")

        val mPieChartView: PieChartView = findViewById(R.id.percentPieView)
        mPieChartView.setData(data, name, colors, colorStroke, 6)
        mPieChartView.startAnimation(2000)
    }
}