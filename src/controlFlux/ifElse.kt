package controlFlux

private fun controlFluxIf() {
    val totalLimits = 20
    val controlLimits: Int
    if (totalLimits > 20) {
        println("maior que 20")
    } else {
        println("numero nao é maior que 20")
    }
}

private fun maiorIdade(idade: Int) {
    if (idade > 18) {
        println("maior de idade")

    } else {
        print("menor de idade")
    }
}


fun saudacao(dia: Boolean) = if (dia) {
    "bom dia"
} else {
    "boa noite"
}


fun main() {
    saudacao(dia = true)
    maiorIdade(20)
    controlFluxIf()
}