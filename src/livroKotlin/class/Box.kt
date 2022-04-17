package livroKotlin.`class`

class Box<T> {
    var contentBox: T? = null

    fun put(content: T?) {
        this.contentBox = content
        println(content)
    }

    fun retrive(): T? {
        return contentBox
    }

    fun isEmpty(): Boolean {
        return contentBox == null

    }

    fun checkLet(carro: String?) {
        val cheLet = carro?.let {
            (it == carro)
        }
    }

    fun listOfV() {
        val listOfExemple = listOf("joao", "raimundo", 2, 3)
        println(listOfExemple)
        val mutableListExemple = mutableListOf("joao", "jose", 4, 5)
        println(mutableListExemple)
        mutableListExemple.removeLast()
        mutableListExemple.removeFirst()
        println(mutableListExemple)

    }

}