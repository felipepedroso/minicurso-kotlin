package br.pedroso.minikourse

fun main(args: Array<String>) {
    /**
     * Classes abstratas
     */

    val animal1: Animal = Dog()
    val animal2: Animal = Cat()
    animal1.doSound()
    animal2.doSound()

    /**
     * Smart Casts
     */
    // animal1.howl() // Não compila, precisamos fazer um cast

    (animal1 as Dog).howl()

    if (animal1 is Dog) {
        animal1.howl()
    }

    when (animal2) {
        is Dog -> animal2.howl()
        is Cat -> animal2.pur()
        else -> animal2.doSound()
    }
}

/**
 * Criando uma classe abstrata
 */
abstract class Animal {
    protected abstract val sound: String

    fun doSound() {
        println("${javaClass.simpleName} says $sound.")
    }
}

class Dog : Animal() {
    override val sound = "AU"

    fun howl() {
        println("${javaClass.simpleName} says AUUUUUUUUUU")
    }
}

class Cat : Animal() {
    override val sound = "MIAU"

    fun pur() {
        println("${javaClass.simpleName} says RRRRRRRRRR")
    }
}

