package com.tugas.project1

// Conditional Expression
// Condotional expression adalah expression yang memiliki nilai true atau false
// Conditional expression menggunakan if-else, when, dan try-catch

fun ConditionalStatement() {
    println("=== Conditional Expression ===")
    // if-else
    val number = 10
    if (number > 0) {
        println("Angka positif")
    } else {
        println("Angka negatif")
    }

    // when
    val day = 1
    when (day) {
        1 -> println("Senin")
        2 -> println("Selasa")
        3 -> println("Rabu")
        4 -> println("Kamis")
        5 -> println("Jumat")
        6 -> println("Sabtu")
        7 -> println("Minggu")
        else -> println("Tidak valid")
    }

    // Try-catch
    val value = "10"
    try {
        val result = value.toInt()
        println("Result: $result")
    } catch (e: NumberFormatException) {
        println("Invalid Number")
    }
}
