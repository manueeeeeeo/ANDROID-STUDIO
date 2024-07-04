package com.example.kotlinparaprincipiantes

import kotlin.random.Random

public fun main(){
  // En este archivo hay mini programas y minijuegos para practicar
    practica()
}

private fun practica(){
    // Saber si es par o impar
    var num = 9
    if (num%2==0){
        println("$num es un número par")
    }else{
        println("$num es un número impar")
    }

    // Todas las posibilidades de operaciones
    var n1 = 4
    var n2 = 5

    var suma = n1+n2
    var resta = n1-n2
    var multi = n1*n2
    var div = n1/n2
    var rest = n1%n2
    println("La suma es $suma")
    println("La resta es $resta")
    println("La multiplicación es $multi")
    println("La división es $div")
    println("El resto es $rest")

    // Calcular el exponente
    var n = 2
    var expo = 5
    var result = 1
    for (i in 0 until expo){
        result*=n
    }
    println("$n elevado a $expo es: $result")

    // Calcular factorial
    var numero = 12
    var fact = 1
    var copia = numero
    for(i in 0 until copia){
        fact*=numero
        numero-=1
    }
    println("El factorial de $copia es: $fact")

    // Saber par o impar en un bucle del 1 al 50
    for(i in 1..50){
        if(i%2==0){
            println("$i -> Es par")
        }else{
            println("$i -> Es imapr")
        }
    }

    // Juego de adivinar el número
    var adivinanza = Random.nextInt(1, 100 +1)
    var intentos = 10
    while(true){
        println("Digame un número del 1 al 100: ")
        var inte = readLine()!!.toInt()
        if (inte > adivinanza){
            println("Es un número más bajo")
            intentos--
        }else if(inte < adivinanza){
            println("Es un número más alto")
            intentos--
        }
        if(inte == adivinanza){
            break
        }
    }
    println("EL NÚMERO ERA $adivinanza")
    if(intentos>0){
        println("Le han quedado $intentos intentos, lo ha adivinado")
    }else{
        println("HA PERDIDO")
    }
}
