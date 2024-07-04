package com.example.kotlinparaprincipiantes

public fun main(){
    condicionWhen()
}

private fun condicionWhen(){
    //When con string, es como una especie de switch
    var country = "España"
    when(country){
        "España" -> {
            println("El idioma es español")
        }
        "Mexico" -> {
            println("El idioma es español")
        }
        "Francia" ->{
            println("El idioma es frances")
        }
        "EEUU" -> {
            println("El idioma es ingles")
        }else -> {
            println("Ese pais no existe")
        }
    }

    // When con int
    var edad = 12
    when(edad){
        0, 1, 2, 3 -> {
            println("ES UN BEBE")
        }
        in 4..9 -> {
            println("ES UN NIÑO YA")
        }
        in 10..18 -> {
            println("ERES ADOLESCENTE")
        }
        in 19..99 -> {
            println("ERES YA VIEJO")
        }
    }
}
