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

fun main() {
    checkGeometric()
}