package livroKotlin

import kotlin.math.max

class Chaptet1 {

    fun configureFor() {
        var numberOne = 20
        println("configureFor")
        do {
            println(numberOne--)
        } while (numberOne > 15)
    }

    fun configureFunctions(numberI: Int, numberTwo: Int) {
        val maxMin = max(numberI, numberTwo)
        println("configureFunctions")
        println(maxMin)

        if (numberI == numberTwo) {
            println("é igual")
        } else {
            println("não é igual")
        }

    }

}