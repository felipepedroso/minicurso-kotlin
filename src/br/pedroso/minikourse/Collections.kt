package br.pedroso.minikourse

fun main(args: Array<String>) {
    lists()
    mutableLists()
    sets()
    maps()
}

fun lists() {
    printTitle("List")

    // Criando uma lista imutável
    var list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    printListStatus(list)

    val position = 3
    println("List element at position $position: ${list[3]}") // Imprime o elemento na terceira posição
    val number = 10
    println("Does the list contains the number $number? ${list.contains(number)}") // Imprime se a lista contém o valor "10" (false)

    list = listOf()  // Cria uma lista vazia
    printListStatus(list)
}


fun mutableLists() {
    printTitle("MutableList")

    // Criando uma lista mutável.
    val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    printListStatus(list)

    // Adicionando um novo elemento
    val newValue = 10
    list.add(newValue)
    printListStatus(list)

    // Removendo um elemento no índice 0
    list.removeAt(0)
    printListStatus(list)

    // Removendo o elemento adicionado anteriormente
    list.remove(newValue)
    printListStatus(list)

    // Limpando a lista
    list.clear()
    printListStatus(list)
}

fun sets() {
    printTitle("Set")

    // Criando um set não mutável
    val set = setOf(1, 1, 2, 3, 4, 5, 6, 7, 8, 4, 5, 8)

    printSetStatus(set)

    printTitle("MutableSet")

    // Convertendo um set para mutável
    val mutableSet = set.toMutableSet()

    printSetStatus(mutableSet)

    // Tentando adicionar um elemento que já existe no set
    mutableSet.add(1)

    printSetStatus(mutableSet)
}

fun maps() {
    printTitle("Maps")

    // Criando um map não mutável
    val map = mapOf(
            "First" to 1,
            "Second" to 2,
            "Third" to 3,
            "Fourth" to 4,
            "Fifth" to 5
    )

    printMapStatus(map)

    // Verificando se uma chave existe e exibindo seu valor
    val key = "Third"
    println("Map contains key '$key': ${map.containsKey(key)}")
    println("Value with key '$key': ${map[key]}")

    printSeparator("-")

    printTitle("MutableMaps")

    // Convertendo um map para mutável
    val mutableMap = map.toMutableMap()
    printMapStatus(mutableMap)

    // Adicionando um novo elemento no map
    mutableMap["Sixth"] = 6
    printMapStatus(mutableMap)

    // Removendo um elemento no mapa
    mutableMap.remove("Second")
    printMapStatus(mutableMap)
}

fun printListStatus(list: List<Int>) {
    println("List elements: $list")
    println("Is list empty? ${list.isEmpty()}")
    println("List size: ${list.size}")
    printSeparator("-")
}

fun printSetStatus(set: Set<Int>) {
    println("Set elements: $set")
    println("Is set empty? ${set.isEmpty()}")
    println("Set size: ${set.size}")
    printSeparator("-")
}

fun printMapStatus(map: Map<String, Int>) {
    println("Map elements: $map")
    println("Map keys: ${map.keys}")
    println("Map values: ${map.values}")
    println("Is map empty? ${map.isEmpty()}")
    println("Map size: ${map.size}")
    printSeparator("-")
}

fun printTitle(title: String) {
    printSeparator("=")
    println(title)
    printSeparator("=")
}

fun printSeparator(separator: String = "-") {
    (1..10).forEach { print(separator) }
    println()
}
