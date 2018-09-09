package br.pedroso.minikourse

import java.time.LocalDateTime

fun main(args: Array<String>) {
    /**
     * Definindo uma classe
     */
    val person1 = Person("Felipe", 1987)
    println("Name: ${person1.name} Age: ${person1.age}")

    /**
     * Interfaces
     */
    val shape1: Shape = Circle(10.0)
    val shape2: Shape = Square(10.0)

    shape1.printArea()
    shape2.printArea()

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
 * Definindo uma classe com um atributo público e um atributo privado
 */
class Person(val name: String, private val birthYear: Int) {
    init {
        println("Initializing Person with name $name")
    }

    // Definindo uma propriedade com o get customizado
    val age: Int
        get() {
            return LocalDateTime.now().year - birthYear
        }
}

/**
 * Definindo uma interface
 */
interface Shape {
    fun getArea(): Double

    fun printArea() {
        val formattedArea = "%.2f".format(getArea())
        println("${javaClass.simpleName} area: $formattedArea")
    }
}

/**
 * Implementando a interface
 */
class Circle(private val radius: Double) : Shape {
    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}

/**
 * Criando uma classe open que implementa a interface
 */
open class Rectangle(private val width: Double, private val height: Double) : Shape {
    override fun getArea() = width * height
}

/**
 * Criando uma classe sem propriedades
 */
class Square(side: Double) : Rectangle(side, side)

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

