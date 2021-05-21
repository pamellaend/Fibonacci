package com.pamella.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var txtalg :EditText
    lateinit var saida: EditText
    lateinit var bot: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bot = findViewById(R.id.botao)
        txtalg = findViewById(R.id.digito)
        saida = findViewById(R.id.resultado)
        var algorismo: Int = txtalg.text.toString().toInt()




        bot.setOnClickListener {

            var algorismo:String = txtalg.text.toString()


                //val n = txtalg.text.toString().toInt()
                var t1 = 0
                var t2 = 1
                lateinit var saida2 :String

                for (i in 1..algorismo.toInt()) {
                    saida2 = "$t1 + "

                    val sum = t1 + t2
                    t1 = t2
                    t2 = sum
                }

            if (algorismo.isEmpty()) {
                txtalg.error = "Digite um valor"
            } else {
                saida.text.toString() = saida2
                saida.visibility = View.VISIBLE
            }

            }
        }
}


