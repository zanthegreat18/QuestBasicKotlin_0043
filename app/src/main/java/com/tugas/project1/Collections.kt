package com.tugas.project1

// List adalah kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya data yang dimasukan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan listof
// List Mutable menggunakan mutableListof


fun ContohList()  {
println("=== List ===")
// List Read-Only
val readOnlyAbjad = listOf("A", "B", "C")
println(readOnlyAbjad)

// List Mutable
val shape: MutableList<String> = mutableListOf("Lingkaran", "Segitiga", "Persegi", "Segitiga")
println(shape)

// Menghapus data dari list mutable
shape.remove("Persegi")
println(shape)

// Mengubah data dari list mutable
shape[0] = "Persegi Panjang"
println(shape)

// List Read-Only
val shapesLocked: List<String> = shape
println(shapesLocked)
}

// Set adalah kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
// Set bersifat unordered, artinya data yang dimasukan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukan dapat diubah dan tidak dapat diubah
// Set Read-Only menggunakan setOf
// Set Mutable menggunakan mutableSetOf

fun ContohSet() {
println()
println("=== Set ==")

// Set Read-Only
val readOnlyAbjad = setOf("A", "B", "C")
println(readOnlyAbjad)

// Set Mutable
val shape: MutableSet<String> = mutableSetOf("Lingkaran", "Segitiga", "Persegi", "Segitiga")
println(shape)

// Menambahkan data ke set mutable
shape.add("Rectangle")
println(shape)

// Menghapus data dari set mutable
shape.remove("Segitiga")
println(shape)

// Set Read-Only
val shapesLocked: Set<String> = shape
println(shapesLocked)
}

// Map adalah kumpulan data yang memiliki pasangan key dan value
// Map bersifat unordered, artinya data yang dimasukan tidak memiliki posisi tertentu
// Map bersifat mutable dan read only, artinya data yang dimasukan dapat diubah dan tidak dapat diubah
// Map Read-Only menggunakan mapOf
// Map Mutable menggunakan mutableMapOf

fun ContohMap() {

println()
println("=== Map ===")

// Map Read-Only
val readOnlyShape: Map<String, Int> = mapOf("Lingkaran" to 1, "Segitiga" to 2, "Persegi" to 3)
println(readOnlyShape)

// Map Mutable
val shape: MutableMap<String, Int> = mutableMapOf("Lingkaran" to 1, "Segitiga" to 2, "Persegi" to 3)
println(shape)

// Menambahkan data ke map mutable
shape["Rectangle"] = 4
println(shape)

// Menghapus data dari map mutable
shape.remove("Segitiga")
println(shape)

// Mengubah data dari map mutable
shape["Persegi"] = 5
println(shape)

// Map Read-Only
val shapesLocked: Map<String, Int> = shape
println(shapesLocked)
}

