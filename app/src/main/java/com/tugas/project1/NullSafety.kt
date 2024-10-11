package com.tugas.project1

fun nullSafety() {
// nevernull memiliki tipe string
var neverNull: String = "This can't be null"

// Melemparkan kesalahan total
// neverNull = null

// nullable memiliki tipe string yang dapat dibatalkan
var nullable: String? = "You can keep a null here"

// Ini ok
nullable = null

// Mengecek kondisi null
if (neverNull == null) {
    println("inferredNonNull is null")
} else {
    println("infeeredNonNull is not null")
}

// Safe call operator
println(neverNull.length) // 18
println(nullable?.length) // null

}
