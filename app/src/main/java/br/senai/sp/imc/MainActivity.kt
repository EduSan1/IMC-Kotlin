package br.senai.sp.imc

import android.content.Intent
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

                val imc = definirImc(peso, altura)
                val status =  definirStatus(imc)
                val resultado = findViewById<TextView>(R.id.resultadoImc)
                val statusa = findViewById<TextView>(R.id.resultadoStatus)
                val dois = DecimalFormat("#,##0.00")
                val intent = Intent(this, ResultadoActivity::class.java)
                val imctxt = dois.format(imc).toString()

                intent.putExtra("imc",imctxt)
                intent.putExtra("status",status)

                startActivity(intent)
            }

        }
    }

}