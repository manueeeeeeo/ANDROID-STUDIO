package com.example.kotlinparaprincipiantes

public fun main(){
    arrays()
}

private fun arrays(){
    val name = "Manuel"
    val surname = "Sanchez"
    val company = "HP"
    val age = "20"

    val myArray = arrayListOf<String>()

    myArray.add(name)
    myArray.add(surname)
    myArray.add(company)
    myArray.add(age)

    println(myArray)

    // Añadir un conjunto de datos
    myArray.addAll(listOf("Hola", "Adios", "Bienvenido"))
    println(myArray)
}
