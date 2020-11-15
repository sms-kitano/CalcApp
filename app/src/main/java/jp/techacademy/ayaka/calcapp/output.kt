package jp.techacademy.ayaka.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_output.*

class output : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        val value1 = intent.getFloatExtra("VALUE1",0.0f)
        val value2 = intent.getFloatExtra("VALUE2",0.0f)

        val operator1 = intent.getStringExtra("OPERATOR")

        when(operator1) {
            "+" -> textView_output.text = "${value1 + value2}"
            "-" -> textView_output.text = "${value1 - value2}"
            "*" -> textView_output.text = "${value1 * value2}"
            "/" -> textView_output.text = "${value1 / value2}"
        }

    }
}
