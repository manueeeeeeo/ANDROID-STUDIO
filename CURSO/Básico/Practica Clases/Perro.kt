package com.example.kotlinparaprincipiantes

class Perro(val nombre: String, val edad: Int, val vacunas: Array<Vacuna>? = null, val raza: String, val pais: String) {
    enum class Vacuna{
        Rabia,
        Papiloma,
        Tetanos,
        Parasitos,
        Gripe
    }

    fun imprimir_Info(){
        println("=======================")
        println("=========PERRO=========")
        println("=======================\n")
        println("Nombre: $nombre\nRaza: $raza\nEdad: $edad")
    }

    fun ver_Vacunas(){
        println("\n=======================")
        println("========VACUNAS========")
        println("=======================\n")
        if(vacunas!=null){
            for(vacuna in vacunas){
                println("-$vacuna")
            }
        }
    }

    fun darDeComer(){
        println("\nHas decidido dar de comer al perro")
        Thread.sleep(3000)
        println("Dandole de comer.....")
        Thread.sleep(4000)
        println("Casi terminando......")
        Thread.sleep(3000)
        println("El perro se ha comido todo")
    }
}
