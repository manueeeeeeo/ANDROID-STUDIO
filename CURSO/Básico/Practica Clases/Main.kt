package com.example.kotlinparaprincipiantes

public fun main(){
    // Declaro el objeto que simula ser un perro
    val perro1 = Perro("Sasha", 1, arrayOf(Perro.Vacuna.Rabia, Perro.Vacuna.Parasitos), "Yorkshire Toy", "España")
    // Vemos la información del perro
    perro1.imprimir_Info()
    // Vemos todas las vacunas
    perro1.ver_Vacunas()
    // Damos de comer al perro
    perro1.darDeComer()
}
