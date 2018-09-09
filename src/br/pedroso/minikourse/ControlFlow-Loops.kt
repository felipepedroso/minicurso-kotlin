package br.pedroso.minikourse

fun main(args: Array<String>) {

    printWithForInclusive()

    printWithForExclusive()

    printForWithStep()

    printForDownTo()

    printDoWhile()

    printWhile()

    printRange()

    printArray()

    printArrayWithIndexes()

    printReverseArray()
}


/**
 * Usando for para imprimir números de 1 até 10
 */
fun printWithForInclusive() {
    for (i in 1..10) {
        println(i)
    }
    printSeparator()
}

/**
 * Usando for para imprimir números de 1 até 9. A palavra 'until' torna o intervalo com o final exclusivo.
 */
fun printWithForExclusive() {
    for (i in 1 until 10) {
        println(i)
    }
    printSeparator()
}

/**
 * Usando o for para imprimir todos números ímpares entre 1 e 10
 */
fun printForWithStep() {
    for (i in 1..10 step 2) {
        println(i)
    }
    printSeparator()
}

/**
 * Usando a palavra downTo para fazer um range regressivo
 */
fun printForDownTo() {
    for (i in 10 downTo 1) {
        println(i)
    }
    printSeparator()
}

/**
 * Imprimindo contagem de 1 até 10 usando do..while
 */
fun printDoWhile() {
    var i = 1
    do {
        println(i++)
    } while (i <= 10)

    printSeparator()
}

/**
 * Imprimindo contagem de 1 até 10 usando while
 */
fun printWhile() {
    var i = 1
    while (i <= 10) {
        println(i++)
    }
    printSeparator()
}

/**
 * Imprimindo contagem usando o método forEach de um range
 */
fun printRange() {
    (1..10).forEach { println(it) }
    printSeparator()
}

/**
 * Imprimindo os valores de um array
 */
fun printArray() {
    for (fruit in fruits) {
        println(fruit)
    }

    printSeparator()
}

/**
 * Imprimindo os valores e índices do array
 */
fun printArrayWithIndexes() {
    for ((index, value) in fruits.withIndex()) {
        println("[$index]: $value")
    }
    printSeparator()
}

/**
 * Imprimindo o array com a ordem invertida
 */
fun printReverseArray() {
    for (fruit in fruits.reversedArray()) {
        println(fruit)
    }
    printSeparator()
}

fun printSeparator() {
    (1..100).forEach { print("-") }
    println()
}

val fruits = arrayOf(
        "Abacaxi",
        "Maçã",
        "Morango",
        "Uva",
        "Banana",
        "Pêra"
)
