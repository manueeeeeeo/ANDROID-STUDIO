package com.example.kotlinparaprincipiantes

import kotlin.random.Random

public fun main(){
    bucles()
}

private fun bucles(){
    // Bucle For
    val myArray = listOf("Hola", "Binvenidos", "Adios")
    val myMap = mutableMapOf("Manuel" to 1, "Jose" to 2, "Ana" to 4)

    for (myString in myArray){
        println(myString)
    }

    for (myElement in myMap){
        println("${myElement.key}-${myElement.value}")
    }

    for (x in 0..10){ // Incluye el ultimo
        println(x)
    }

    for (x in 0 until 10){ // No incluye el ultimo
        println(x)
    }

    for (x in 0..10 step 2){ // Hacer saltos de x numeros
        println(x)
    }

    for (x in 10 downTo 0){ // Hacer cuenta regresiva
        println(x)
    }

    val myNumericArray = (0..20) // Crear una variable con rango

    // Bucke While
    var x = 0

    while(x < 10){
        println(x)
        x++
    }
}
