package br.pedroso.minikourse

fun main(args: Array<String>) {
    val a = 42
    val b = 12

    printSum(a, b)
    printMultiply(a, b)
    printMultiply(b = 10, a = 15) // Chamando a função com parâmetros nomeados
    println("Max: ${max(a, b)}")

    val average = average(a, b, 44, 99, 123)
    println("Average: $average")

    printName()
    printName("Felipe")
}


/**
 * Declaração simples de função
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

/**
 * Funções com uma expressão no corpo
 */
fun multiply(a: Int, b: Int) = a * b

fun max(a: Int, b: Int) = if (a > b) a else b

/**
 * Função sem retorno (Unit implícito)
 */
fun printSum(a: Int, b: Int) {
    val sum = sum(a, b)
    println("$a + $b = $sum")
}

/**
 * Função sem retorno (Unit explícito)
 */
fun printMultiply(a: Int, b: Int): Unit =
        println("$a * $b = ${multiply(a, b)}")

/**
 * Função com número de argumentos variáveis
 */
fun average(vararg numbers: Int): Float {
    if (numbers.isNotEmpty()) {
        val totalSum = numbers.sum()

        return totalSum.toFloat() / numbers.size.toFloat()
    }

    return 0F
}

/**
 * Função com valor padrão
 */
fun printName(name: String = "Anônimo") {
    println(name)
}

