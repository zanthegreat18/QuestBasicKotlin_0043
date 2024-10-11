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
}