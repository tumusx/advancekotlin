import java.awt.Color
import java.util.*

//TODO criando uma classe com construtor que tem 2 parametros = tamanho e largura e verificando se ela
//TODO é um de tamanho iguals
//TODO foi-se criado um metodo de acesso personalizado em kotlin
class livroKt(val height: Int, val width: Int) {
    //TODO a propriedade nao precisa de um campo para armazenar o seu valor. ela apenas tem um
    val responseEquilaetro: Boolean
        get() {
            return height == width
        }
}

fun main() {
    val livroSk = livroKt(2, 2)
    println(livroSk.responseEquilaetro)
    val enumClass = Colors.listaColors

    println(enumClass)
    println(acessColors(Colors.BLACK))
    println(orderCheck())
}


private fun lacosWhile(color: Colors) {
    val colors = Colors.listaColors[2]
    val colorsType = Colors.BLUE
    do {
        println("A cor é blue")
    } while (colors != Colors.BLUE)

}

private fun acessColors(colors: Colors) =
    when (colors) {
        Colors.WHITE -> "Branco escolhido"
        Colors.PURPLE -> "Roxo escolhido"
        Colors.GREEN -> "Verde escolhido"
        Colors.RED -> "Vermelho escolhido"
        Colors.VIOLET -> "Violeta escolhido"
        Colors.BLUE -> "Azul escolhido"
        Colors.BLACK -> "Preto escolhido"
    }

private fun orderCheck() {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for ((letter, binary) in binaryReps)
        println("$letter = $binary")

}

enum class Colors(val nomeColor: String, val ageColor: Int) {
    RED("vermelho", 20), BLUE("azul", 19),
    BLACK("preto", 302), PURPLE("roxo", 19),
    WHITE("branco", 302), GREEN("verde", 20),
    VIOLET("violeta", 20);

    companion object {
        val listaColors = mutableListOf(
            Colors.RED, BLACK, Colors.BLUE,
            Colors.PURPLE, Colors.GREEN, Colors.WHITE,
            Colors.VIOLET
        )
    }
}