package com.example.kotlinparaprincipiantes

import kotlin.random.Random

public fun main(){
    mapsYDiccionarios()
}

private fun mapsYDiccionarios(){
    // SON COMO UN ARRAY PERO CON UNA CLAVE Y CON UN VALOR

    // Declarar un map
    var myMap: Map<String,Int> = mapOf()
    println(myMap)

    // Añadir elementos
    myMap = mutableMapOf("Manuel" to 1, "Jose" to 2, "Alvaro" to 4)
    println(myMap)

    // Añadir un solo valor
    myMap["Ana"] = 9
    myMap.put("Maria", 7)
    println(myMap)

    // Actualizar un valor
    myMap.put("Manuel", 12)
    println(myMap)

    // Acceder a los valores
    println(myMap["Manuel"])

    // Borrar datos
    myMap.remove("Maria")
    println(myMap)
}
