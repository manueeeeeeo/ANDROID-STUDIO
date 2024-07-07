package com.example.kotlinparaprincipiantes

import com.example.kotlinparaprincipiantes.ui.theme.MyClass

public fun main(){
    // Clases
    clases()
}

public fun clases(){
    val manu = MyClass("Alvaro", 18,  arrayOf(MyClass.Languague.Java, MyClass.Languague.Kotlin))
    println(manu.name)
    manu.code()
}
