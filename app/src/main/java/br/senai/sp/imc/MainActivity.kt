package br.senai.sp.imc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = findViewById<Button>(R.id.calcular)

        calcular.setOnClickListener() {
            val peso = findViewById<EditText>(R.id.peso).text.toString().toDouble()
            val altura = findViewById<EditText>(R.id.altura).text.toString().toDouble()
            val imc = peso/(altura*altura)
            val resultado = findViewById<TextView>(R.id.resultadoImc)
            val status = findViewById<TextView>(R.id.resultadoStatus)

            if (imc<=18.5) {
                status.text = "Você está abaixo do peso"
                status.setTextColor(Color.RED)
                resultado.text = "Seu IMC é ${imc}"
            }else if (imc>18.5 && imc<=25) {
                status.text = "Você está no peso ideal, parabens!"
                status.setTextColor(Color.GREEN)
                resultado.text = "Seu IMC é ${imc}"
            }else if (imc>25 && imc<=30) {
                status.text = "Você está em sobrepeso, fica esperto mam"
                resultado.text = "Seu IMC é ${imc}"
            }else if (imc>30 && imc<=35) {
                status.text = "Você está com obesidade grau I, ta na hora de rependar aquela pizza no fim de semana"
                resultado.text = "Seu IMC é ${imc}"
            }else if (imc>35 && imc<=40) {
                status.text = "Você está com obesidade grau II, é melhor ir numa nutricionista heim mam"
                resultado.text = "Seu IMC é ${imc}"
            }else if (imc>40) {
                status.text = "Você está com obesidade grau III, se possível vá a um médico e cuide da sua saúde"
                status.setTextColor(Color.RED)
                resultado.text = "Seu IMC é ${imc}"

            }else {

            }



        }
    }
}