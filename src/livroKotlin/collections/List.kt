package livroKotlin.collections

class List {

    fun exemplo() {
        val mutableExemplo = mutableListOf("Joao", "Raimundo", "Joaquina", 3)
        val mutableList: MutableList<Any> = mutableListOf()

        mutableList.add(0, 5)
        mutableList.add(1, "Joao")
        println("antes de remover: $mutableList")
        mutableList.remove("Joao")
        println("depois de remover $mutableList")

        println("antes de remover: $mutableExemplo")
        mutableExemplo.removeFirst()
        mutableExemplo.removeLast()
        println("Depois de remover x elementos: $mutableExemplo")

        mutableExemplo.removeAll(mutableExemplo)
        println("depois de remover todos os elementos: $mutableExemplo")

        val listImutable = listOf("Jose", "Maria", "Joao")

        println(listImutable.size)
        listImutable.forEach{
            println(it)
        }
    }
}