package br.pedroso.minikourse

fun main(args: Array<String>) {
    /**
     * Interfaces
     */
    val shape1: Shape = Circle(10.0)
    val shape2: Shape = Square(10.0)

    shape1.printArea()
    shape2.printArea()
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