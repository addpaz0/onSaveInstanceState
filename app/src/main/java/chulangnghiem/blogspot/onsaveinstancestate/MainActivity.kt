package chulangnghiem.blogspot.onsaveinstancestate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var dem: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtInt.setOnClickListener {
            dem++
            txtInt.text=dem.toString()
        }

    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val userNumber: Int = dem
        outState.putInt("saveInt", dem)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        val userInt: Int = savedInstanceState.getInt("saveInt", 0)
        dem = userInt
        txtInt.text = dem.toString()
    }
}