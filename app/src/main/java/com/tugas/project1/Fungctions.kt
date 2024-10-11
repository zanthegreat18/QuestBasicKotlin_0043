package com.tugas.project1

fun withoutParameter() {
println("=== Without Parameter ===")
println("Hello World")
}

fun withParameter(name: String) {
println("=== With Parameter ===")
println("Hello $name")
}

// Named argument
// Named argument adalah fitur yang memungkinkan kita untuk menentukan parameter dengan nama yang akan dikirimkan ke fungsi
fun withNamedArgument(name: String, age: Int) {
println()
println("== withNamedArgument ==")
println("Hello $name, your $age years old")
}

// Default parameter value
// Default parameter value adalah fitur yang memungkinkan kita untuk menentukan nilai default dari parameter
fun withDefaultParameter(name: String = "zan", age: Int = 20) {
println()
println("== withDefaultParameter ==")
println("Hello $name, your $age years old")
}

