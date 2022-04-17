package livroKotlin

import exercices.bonus
import livroKotlin.`class`.Box

class TestChapter1 {
}

fun main() {
    val chapter1 = Chaptet1()
    print(chapter1.configureFunctions(2, 3))
    println(chapter1.configureFor())

    val box = Box<Int>()
    val booBox = Box<Boolean>()

    box.put(3)
    booBox.put(true)
    println(booBox.isEmpty())
    box.listOfV()
}