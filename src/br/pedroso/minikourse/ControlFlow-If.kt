package br.pedroso.minikourse

import java.util.*

fun main(args: Array<String>) {
    var number = generateRandomNumber()
    printParityWithIf(number)

    number = generateRandomNumber(100)
    printParityWithExpressionIf(number)

    number = generateRandomNumber(1000)
    printParityWithExpressionIf2(number)

    number = generateRandomNumber(10000)
    printParityWithExpressionIf3(number)
}

/**
 * If Convencional
 */
fun printParityWithIf(number: Int) {
    if (number % 2 == 0) {
        println("$number é um número par")
    } else {
        println("$number é um número ímpar.")
    }
}

/**
 * Utilizando if como expressão para determinar o valor de 'parity'
 */
fun printParityWithExpressionIf(number: Int) {
    val parity = if (number % 2 == 0) {
        "par"
    } else {
        "ímpar"
    }

    println("$number é um número $parity.")
}

/**
 * Outra maneira de utilizar if como expressão para determinar o valor de 'parity'
 */
fun printParityWithExpressionIf2(number: Int) {
    val parity = if (number % 2 == 0) "par" else "ímpar"
    println("$number é um número $parity.")
}

fun printParityWithExpressionIf3(number: Int) = if (number % 2 == 0) {
    println("$number é um número par")
} else {
    println("$number é um número ímpar.")
}

fun generateRandomNumber(upperBound: Int = 10) = Random().nextInt(upperBound) + 1
