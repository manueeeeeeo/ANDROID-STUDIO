package com.example.kotlinparaprincipiantes.ui.theme

class MyClass(val name: String, val age: Int, val languages: Array<Languague>, val friends: Array<MyClass>? = null) {
  // Creamos esta lista de lenguajes para que solo puedan introducir esos al crear la clase  
  enum class Languague{
        Kotlin,
        Java,
        Python,
        JavaScript
    }

  // Método para imprimir todos los lenguajes en los que programa
    fun code(){
        for(language in languages){
            println("Programo en $language")
        }
    }
}
