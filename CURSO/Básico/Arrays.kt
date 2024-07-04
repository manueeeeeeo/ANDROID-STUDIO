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

    // Acceso a los datos
    val myCom = myArray[2]
    println(myCom)

    // Modificación de datos
    myArray[5] = "La Campana"
    println(myArray)

    // Eliminacion de datos
    myArray.removeAt(1)
    println(myArray)

    // Opreciones con Arrays
    // RECORRER ARRAYS

    myArray.forEach {
        println(it)
    }

    // OPERACIONES ADICCIONALES
    myArray.count() // ->CONTAR LAS COSAS QUE TIENE EL ARRAY

    myArray.clear() // -> LIMPIAR EL ARRAY

    myArray.first() // Obtener primer elemento
    myArray.last() // Obtener ultimo elemento

    myArray.sort() // Ordenar los elementos
}
