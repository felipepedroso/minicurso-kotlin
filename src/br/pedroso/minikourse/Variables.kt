package br.pedroso.minikourse

fun main(args: Array<String>) {
    // Criando uma variável imutável, que não pode ser alterada depois de inicializada
    val a = 42
    val b: Int = 35
    val c = a + b

    println("$a + $b = $c")

    // Criando uma variável mutável, que pode ser alterada depois de inicializada
    var frutaPreferida = "Abacaxi"

    println("Antes: $frutaPreferida")

    frutaPreferida = "Maracujá"

    println("Antes: $frutaPreferida")

}