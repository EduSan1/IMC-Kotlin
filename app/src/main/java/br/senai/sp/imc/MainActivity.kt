package br.senai.sp.imc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

lateinit var txtAltura: EditText
lateinit var txtPeso: EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)

        calcular.setOnClickListener() {

            txtPeso = findViewById(R.id.peso)
            txtAltura = findViewById(R.id.altura)


            if (validarCampos()) {
                val peso = txtPeso.text.toString().toDouble()
                val altura = txtAltura.text.toString().toDouble()

                val imc = calcularImc(peso, altura)
                val resultado = findViewById<TextView>(R.id.resultadoImc)
                val status = findViewById<TextView>(R.id.resultadoStatus)

                definirImc(imc,resultado,status)


            }

        }
    }

}