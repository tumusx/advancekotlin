package exercices


fun bonus(cargo: String): Float? {
    var gerente: String = "Gerente"
    var coordenadors: String = "Coordenadores"
    var enginnerSoftware: String = "Engenheiros de Software"
    var estagiarios: String = "Estagiários"

    if (cargo == gerente) {
        return 2000f
    } else if (cargo == coordenadors) {
        return 1500f
    } else if (cargo == enginnerSoftware) {
        return 1000f
    } else if (cargo == estagiarios) {
        return 500f
    }
    return 0f
}

private fun bonusMelhorado(cargo: String): Float? {

     when (cargo) {
        "Gerente" -> {
            return 2000f
        }
        "Coordenador" -> {
            return 1500f
        }
        "Engenheiros de Software" -> {
            return 1000f
        }
        "Estágiario" -> {
            return 500f
        }
        else -> {
        return null
        }
    }
}


fun main() {
    println(bonus("Gerente"))
        println(bonusMelhorado("Joao"))
}