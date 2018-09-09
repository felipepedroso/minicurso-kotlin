package br.pedroso.minikourse

import java.time.LocalDateTime

fun main(args: Array<String>) {
    val person1 = Person("Felipe", 1987)
    println("Name: ${person1.name} Age: ${person1.age}")


    val shape1: Shape = Circle(10.0)
    val shape2: Shape = Square(10.0)

    println("${shape1.javaClass.simpleName} area: ${shape1.getArea()}")
    println("${shape2.javaClass.simpleName} area: ${shape2.getArea()}")
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
 * TODO: Criando uma classe com
 */
class Square(side: Double) : Rectangle(side, side)

/**
 * TODO: Criando uma classe abstrata
 */

