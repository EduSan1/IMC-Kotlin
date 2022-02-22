package br.senai.sp.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

//        declara a variavel = procura o elemento <desse tipo>(r id e o id do componente da pagina atual)
//        val nomeTextView = findViewById<TextView>(R.id.nome)

//        variavel criada antes = intent.getStringExtra("chave criada na pagina de origem dos dados")
//        nomeTextView.text = intent.getStringExtra("nome")

        val imcTextView = findViewById<TextView>(R.id.imc)
        val statusTextView = findViewById<TextView>(R.id.status)

        val intent: Intent = getIntent()

        val actionBar = supportActionBar
        actionBar!!.setDefaultDisplayHomeAsUpEnabled(true)

        imcTextView.text = intent.getStringExtra("imc")
        statusTextView.text = intent.getStringExtra("status")

    }
}