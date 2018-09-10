package br.pedroso.minikourse

import java.time.LocalDateTime

fun main(args: Array<String>) {
    /**
     * Definindo uma classe
     */
    val person1 = Person("Felipe", 1987)
    println("Name: ${person1.name} Age: ${person1.age}")

    val person2 = Person("Bruna", 1989, false)
}

/**
 * Definindo uma classe com um atributo público e um atributo privado
 */
class Person(val name: String, private val birthYear: Int) {
    init {
        println("Initializing Person with name $name")
    }

    constructor(name: String, birthYear: Int, isMarried: Boolean) : this(name, birthYear) {
        this.isMarried = isMarried
    }

    // Definindo uma propriedade com o get customizado
    val age: Int
        get() {
            return LocalDateTime.now().year - birthYear
        }

    var isMarried: Boolean = false
        private set // Atribuição apenas dentro da classe

}

