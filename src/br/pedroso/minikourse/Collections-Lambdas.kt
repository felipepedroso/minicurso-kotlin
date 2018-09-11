package br.pedroso.minikourse

import java.time.LocalDateTime

fun main(args: Array<String>) {
    filter()


}

fun filter() {
    val result = userList.filter { it.name.startsWith("C") }.sortedBy { it.name }.map { it.name }
    println(result)
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

