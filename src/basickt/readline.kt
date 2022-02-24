package basickt


private fun checkGeometric() {
    val number1: String? = readLine()
    val number2: String? = readLine()

    number1?.toInt()
    number2?.toInt()

    if (number1 == number2) {
        println("eh um quadrado")
    } else {
        println("Nao representa um quadrado")
    }
}

private fun checkGeometricRectangle() {
    val number1: String? = readLine()
    val number2: String? = readLine()
    val number3: String? = readLine()

    number1?.toInt()
    number2?.toInt()
    number3?.toInt()

    if (number1 == number2 && number1 == number3 && number2 == number3) {
        println("eh um triangulo equilatero")
    } else {
        println("nao eh um triangulo equilatero")
    }
}

private fun checkAge() {
    val idade: String = readLine().toString()

    if (idade < "18") {
        println("voce nao pode entrar")
    } else {
        println("documentos verificados")
    }
}

fun main() {
    checkAge()
    checkGeometric()
    checkGeometricRectangle()
}