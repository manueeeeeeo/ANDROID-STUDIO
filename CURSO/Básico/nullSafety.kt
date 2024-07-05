package com.example.kotlinparaprincipiantes

import kotlin.random.Random

public fun main(){
    nullSafety()
}

private fun nullSafety(){
    var myString = "Manuel"
    // myString = null Esto daría un error de compilación
    println(myString)

    // Variable null safety
    var mySafetyString: String? = "Manuel null safety"
    mySafetyString = null
    println(mySafetyString)

    mySafetyString = "Suscribete"
    println(mySafetyString)

    if(mySafetyString != null){
        println(mySafetyString!!) // !! redundancia por si es nulo
    }

    // Safe call
    println(mySafetyString.length)
}
