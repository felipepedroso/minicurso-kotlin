package br.pedroso.minikourse

import java.util.*

fun main(args: Array<String>) {
    var grade = generateRandomStudentGrade()
    printStudentEvaluation(grade)

    grade = generateRandomStudentGrade()
    printStudentEvaluation2(grade)

    grade = generateRandomStudentGrade()
    printStudentEvaluation3(grade)

    grade = generateRandomStudentGrade()
    printStudentEvaluation4(grade)
}

/**
 * Utilizando o when como substituto do if
 */
fun printStudentEvaluation(grade: Int) {
    when {
        grade <= 4 -> println("Reprovado")
        grade < 7 -> println("Recuperação")
        grade < 9 -> println("Aprovado")
        else -> println("Aprovado com honras.")
    }
}

/**
 * Utilizando o when como substituto do switch
 */
fun printStudentEvaluation2(grade: Int) {
    when (grade) {
        in 0..4 -> println("Reprovado")
        in 5 until 7 -> println("Recuperação")
        in 7 until 10 -> println("Aprovado")
        10 -> println("Aprovado com honras.")
        else -> println("Aluno esquisito.")
    }
}

/**
 * Utilizando o when como expressão de retorno da função
 */
fun printStudentEvaluation3(grade: Int) = when (grade) {
    in 0..4 -> println("Reprovado")
    in 5 until 7 -> println("Recuperação")
    in 7 until 10 -> println("Aprovado")
    10 -> println("Aprovado com honras.")
    else -> println("Aluno esquisito.")
}

/**
 * Utilizando o when como expressão para determinar o valor de evaluation
 */
fun printStudentEvaluation4(grade: Int) {
    val evaluation = when (grade) {
        in 0..4 -> "Reprovado"
        in 5 until 7 -> "Recuperação"
        in 7 until 10 -> "Aprovado"
        10 -> "Aprovado com honras."
        else -> "Aluno esquisito."
    }

    println(evaluation)
}


fun generateRandomStudentGrade() = Random().nextInt(11)