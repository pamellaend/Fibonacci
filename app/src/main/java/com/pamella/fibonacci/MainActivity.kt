package com.pamella.fibonacci

import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var txtalg :EditText
    lateinit var saida: TextView
    lateinit var bot: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bot = findViewById(R.id.botao)
        txtalg = findViewById(R.id.digito)
        saida = findViewById(R.id.resultado)


        bot.setOnClickListener {
            var indice = txtalg?.text.toString()

            if (indice.isEmpty()) {
                txtalg.error = "Informe um valor"
            } else {
                saida.text = CFib(indice.toInt()).toString()
                saida.visibility = View.VISIBLE
            }
        }
    }

    fun CFib (valor : Int) : List<Long> {

        val Fibo = mutableListOf<Long>()
        var posicao = valor - 1
        var anterior :Long = 0
        var atual :Long = 1

        for (i in 0..posicao) {

            if (i == 0 ){
                Fibo.add(0)
            } else if (i== 1){
                Fibo.add(1)
            }else {
                var soma :Long= atual + anterior
                Fibo.add(soma)
                anterior = atual
                atual = soma
            }
        }
        return Fibo
    }
        }



