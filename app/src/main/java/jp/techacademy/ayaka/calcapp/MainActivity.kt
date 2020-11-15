package jp.techacademy.ayaka.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.design.widget.Snackbar
import android.util.Log


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, output::class.java)

        //EditTextに両方値が入っている場合
        if (editText.length() != 0 && editText2.length() != 0){
            intent.putExtra("VALUE1", editText.text.toString().toFloat())
            intent.putExtra("VALUE2", editText2.text.toString().toFloat())

            when(v!!.id) {
                R.id.button1 -> intent.putExtra("OPERATOR", "+")
                R.id.button2 -> intent.putExtra("OPERATOR", "-")
                R.id.button3 -> intent.putExtra("OPERATOR", "*")
                R.id.button4 -> intent.putExtra("OPERATOR", "/")
            }

            startActivity(intent)

        } else { //EditTextに値が入っていない場合

            Log.d("test","editText:${editText.text}")
            Log.d("test","editText2:${editText2.text}")

            Snackbar.make(button1, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                .show()
            Snackbar.make(button2, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                .show()
            Snackbar.make(button3, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                .show()
            Snackbar.make(button4, "何か数値を入力してください", Snackbar.LENGTH_LONG)
                .show()

            //Text.text = "何か数値を入力してください"
        }
    }
}
