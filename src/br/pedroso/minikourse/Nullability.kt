package br.pedroso.minikourse

fun main(args: Array<String>) {
    val nonNullableVal: String
    //nonNullableVal = null // Não compila
    nonNullableVal = "Some String"
    println(nonNullableVal)

    val nullableVal: String? = null
    //println(nullableVal?.length) // Não compila

    /**
     * Solução 1: Safe Calls (?.)
     */
    printSizeWithSafeCall(nullableVal)

    /**
     * Solução 2: IF
     */
    printSizeWithIf(nullableVal)

    /**
     * Solução 3: Elvis Operator (?:)
     */
    printSizeWithElvisOperator(nullableVal)

    /**
     * Solução 4: Not-Null Operator (!!)
     */
    printWithNotNullOperator(nullableVal)
}

fun printSizeWithSafeCall(str: String?) {
    println(str?.length)  // Imprime null
}

fun printSizeWithIf(str: String?) {
    if (str != null) {
        println(str.length) // Não precisa do "?."
    } else {
        println("Empty string.")
    }
}

fun printSizeWithElvisOperator(str: String?) =
        println(str?.length ?: "Empty string.")

fun printWithNotNullOperator(str: String?) {
    println(str!!.length) // Se str for nulo, vai estourar uma exception
}
