package br.pedroso.minikourse

fun main(args: Array<String>) {
    val num1 = 100
    val num2 = 90

    // Utilizando a função de soma
    val addition: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(addition(num1, num2))
    println(addition.invoke(num1, num2))
    println(calculate(num1, num2, addition))

    // Utilizando a função de subtração
    val subtraction = { a: Int, b: Int -> a - b }
    println(calculate(num1, num2, subtraction))

    // Utilizando a função de multiplicação
    val multiplication = { a: Int, b: Int -> a * b }
    println(calculate(num1, num2, multiplication))

    // Utilizando a função de divisão
    val division = { a: Int, b: Int -> a / b }
    println(calculate(num1, num2, division))

    // Calculando com um "lambda anônimo"
    var result: Int = calculate(num1, num2) { a, b ->
        (a * a) + (b * b)
    }

    println(result)

    // Calculando com uma função declarada
    result = calculate(num1, num2, ::otherFunnyOperation)

    println(result)
}


fun calculate(a: Int, b: Int, calcFunction: (Int, Int) -> Int): Int {
    return calcFunction.invoke(a, b)
}

fun otherFunnyOperation(a: Int, b: Int): Int {
    return (a + a) * (b + b)
}