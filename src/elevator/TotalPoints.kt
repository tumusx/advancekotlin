package elevator

internal fun points(games: List<String>): Int {
    games.sumBy {
        val (x, y) = it.split(":")
        when {
            x > y -> 3
            x < y -> 0
            else -> 1
        }
    }
    return 0
}

fun main() {
    val stringN = "joao raimundo"
    stringN.split(stringN[2])
    val raimundo = "${stringN.capitalize().subSequence(0, 2)}."
    println(raimundo)
}