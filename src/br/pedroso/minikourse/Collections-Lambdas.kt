package br.pedroso.minikourse

import java.time.LocalDateTime

fun main(args: Array<String>) {
    // Filtrando pessoas maiores de 18 anos
    val adults = userList.filter { it.age >= 18}
    println("Lista de Adultos: $adults")

    // Calculando a idade média de todos os usuários
    val averageAge = userList.map { it.age }.average()
    println(averageAge)

    // Agrupando as pessoas pelo estado civil
    val groupsMaritalStatus = userList.groupBy { it.isMarried }
    println(groupsMaritalStatus)

    // Descobrindo a pessoa mais nova
    val youngestPerson = userList.minBy { it.age }
    println(youngestPerson)

    // Descobrindo a pessoa mais velha
    val oldestPerson = userList.maxBy { it.age }
    println(oldestPerson)

    // Ordenando a lista de usuários pelo nome
    val usersSortedByName = userList.sortedBy { it.name }
    println(usersSortedByName)

    // Ordenando a lista pelo nome de forma descrescente
    val usersSortedByDescendingName = userList.sortedByDescending { it.name }
    println(usersSortedByDescendingName)

    // Obtendo um set com nomes (sem repetição)
    val uniqueNames = userList.map { it.name }.toSet()
    println(uniqueNames)

    // Exibindo os caracteres usados para escrever os nomes das pessoas
    val uniqueCharacters = userList
            .flatMap { it.surname.toList() }
            .map { it.toUpperCase() }
            .toSet()
            .sorted()
    println(uniqueCharacters)
}

val userList = listOf(
        User("Felipe", "Pedroso", 1987, false),
        User("João", "Silva", 1990, false),
        User("Maria", "Antonieta", 1976, true),
        User("Carlos", "Nascimento", 1963, true),
        User("Mariana", "Pereira", 2000, false),
        User("Camila", "Figueiredo", 1943, true),
        User("Enzo", "Gabriel", 2016, false),
        User("Enzo", "Rafael", 2015, false),
        User("Valentina", "Guimarães", 1998, true),
        User("Rafael", "Pereira", 1964, false),
        User("João", "Batista", 1916, true),
        User("Manoela", "Figueiredo", 1945, false),
        User("Ulisses", "Mascarenhas", 1951, true)
)

data class User(val name: String, val surname: String, val birthYear: Int, val isMarried: Boolean) {
    val age: Int
        get() {
            return LocalDateTime.now().year - birthYear
        }
}

