package br.pedroso.minikourse

fun main(args: Array<String>) {
    /**
     * Números
     */

    val byteValue: Byte = 127
    val intValue = 42
    val intValueUsingHex = 0x2A
    val longValue = 42L
    val doubleValue = 42.0e10
    val floatValue = 42.0F

    // Conversão implícita
    val convertedLong = intValue
    println(convertedLong)

    // Conversão explícita
    val convertedInt: Int = floatValue.toInt()
    println(convertedInt)

    /**
     * String e Char
     */

    val stringValue = "Minicurso de Kotlin"
    val stringValueWithTemplate = "Minicurso de Kotlin $intValue"
    val stringValueWithComplexTemplate = "Minicurso de Kotlin ${intValue + intValueUsingHex}" // "Minicurso de Kotlin 84"
    val charValue = stringValue[0] // 'M'

    println("String value: $stringValue")
    println("Char value: $charValue")

    val parsedInt = "42".toInt()
    println("Parsing string to integer: $parsedInt")

    /**
     * Boolean
     */

    val booleanValue = true

    println("The boolean value: $booleanValue")

    /**
     * Arrays
     */

    val array = arrayOf(1, 2, 3, 4, 5)

    array.forEach { println(it) }
    println("Array size: ${array.size}")
    println(array[3])
}