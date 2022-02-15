package br.senai.sp.imc

import android.graphics.Color
import android.widget.TextView
import java.text.DecimalFormat

internal fun definirImc(imc: Double, resultado: TextView, status: TextView) {
    val dois = DecimalFormat("#,##0.00")
    if (imc <= 18.5) {
        status.text = "Você está abaixo do peso"
        status.setTextColor(Color.RED)
        resultado.text = "Seu IMC é ${dois.format(imc)}"
    } else if (imc > 18.5 && imc <= 25) {
        status.text = "Você está no peso ideal, parabens!"
        status.setTextColor(Color.GREEN)
        resultado.text = "Seu IMC é ${dois.format(imc)}"
    } else if (imc > 25 && imc <= 30) {
        status.text = "Você está em sobrepeso, fica esperto mam"
        resultado.text = "Seu IMC é ${dois.format(imc)}"
    } else if (imc > 30 && imc <= 35) {
        status.text =
            "Você está com obesidade grau I, ta na hora de rependar aquela pizza no fim de semana"
        resultado.text = "Seu IMC é ${dois.format(imc)}"
    } else if (imc > 35 && imc <= 40) {
        status.text =
            "Você está com obesidade grau II, é melhor ir numa nutricionista heim mam"
        resultado.text = "Seu IMC é ${dois.format(imc)}"
    } else if (imc > 40) {
        status.text =
            "Você está com obesidade grau III, se possível vá a um médico e cuide da sua saúde"
        status.setTextColor(Color.RED)
        resultado.text = "Seu IMC é ${dois.format(imc)}"

    } else {

    }

}


internal fun validarCampos(): Boolean {

    var erroNao = true

    if (txtPeso.text.isBlank()) {
        txtPeso.setError("Campo Obrigatório")
        erroNao = false
    }
    if (txtAltura.text.isBlank()) {
        txtAltura.setError("Campo Obrigatório")
        erroNao = false
    }
    return erroNao
}


val calcularImc = { peso: Double, altura: Double -> peso / (altura * altura) }