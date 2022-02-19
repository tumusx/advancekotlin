package exercices

class exerciceMutableVariable {
}

private fun configureSum() {
    var name: String = "Kanye West Ye"
    var textVar: String
    val sneakTam: UInt = 41u
    val pibBrazil: Float = 1.8690F
    val populationBrazil: Float = 211f

    var resultSum: Float = (pibBrazil / populationBrazil)
    println("Welcome to system")
    println(resultSum)

}

private fun exerciceAleat(){
    var stringLengh : String = "Joao raimundo"
    println("Tamanho da string eh: ${stringLengh.length}")


}

private fun confiMax( numberN : Int? = null,
                      numberM : Int? = null,
                      numberY : Int? = null){

    var result : Int? = null

    result = (numberN!! * numberM!! * numberY!!)
    println("o valor do cubo eh : ${result}")

    
}

fun main() {
    confiMax(5, 6, 9)
    exerciceAleat()
    exerciceAleat()
    configureSum()
}