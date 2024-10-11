package com.tugas.project1

// Data class
// Data class adalah class yang digunakan untuk menyimpan data
// Data class menyediakan fungsi untuk meng-override fungsi equals(), hashCode(), toString(), copy(), dan componentN()
// Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa perubahan

data class DataClass(
val id: Int,
var email: String
)

fun main () {
val data = DataClass(1, "zan@gmail.com")
println(data)

// Fungsi Equals
val data2 = DataClass(1, "Ojan@gmail.com")
println(data == data2) //False

// Fungsi Copy
val data3 = data.copy()
println(data3)

// Fungsi copy dengan perubahan
val data4 = data.copy(email = "Kocaklu@gmail.com")
println(data4)
}