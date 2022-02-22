package br.senai.sp.imc

import java.text.DecimalFormat

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

//internal fun definirImc(peso: Double, altura:Double): Double {
//    var imc = peso/(altura*altura)
//    return imc
//}

internal fun definirStatus(imc: Double): String {

    var status = ""

    if (imc <= 18.5) {
        status = "Você está abaixo do peso"
//        resultado.text = "Seu IMC é ${dois.format(imc)}"
    } else if (imc > 18.5 && imc <= 25) {
        status = "Você está no peso ideal, parabens!"
//        resultado.text = "Seu IMC é ${dois.format(imc)}"
    } else if (imc > 25 && imc <= 30) {
        status = "Você está em sobrepeso, fica esperto mam"
//        resultado.text = "Seu IMC é ${dois.format(imc)}"
    } else if (imc > 30 && imc <= 35) {
        status = "Você está com obesidade grau I, ta na hora de rependar aquela pizza no fim de semana"
//        resultado.text = "Seu IMC é ${dois.format(imc)}"
    } else if (imc > 35 && imc <= 40) {
        status = "Você está com obesidade grau II, é melhor ir numa nutricionista heim mam"
//        resultado.text = "Seu IMC é ${dois.format(imc)}"
    } else if (imc > 40) {
        status = "Você está com obesidade grau III, se possível vá a um médico e cuide da sua saúde"
//        resultado.text = "Seu IMC é ${dois.format(imc)}"
    }
    return status
}



val definirImc = { peso: Double, altura: Double -> peso / (altura * altura) }