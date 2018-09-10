package br.pedroso.minikourse

fun main(args: Array<String>) {
    val human = Human("Felipe", 1987)
    val human2 = Human("Felipe", 1987)
    val human3 = Human("Fulano", 1999)

    println(human) // Imprime Human(name=Felipe, birthYear=1987, isMarried=false)
    println(human == human2) // Imprime true
}

data class Human(val name: String, val birthYear: Int, val isMarried: Boolean = false)