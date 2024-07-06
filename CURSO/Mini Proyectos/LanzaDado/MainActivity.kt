package com.example.lanzadados

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.RotateAnimation
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var btnLanzar: Button
    private lateinit var txtResultado: TextView
    private lateinit var imgDado: ImageView
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLanzar = findViewById(R.id.btnLanzar)
        txtResultado = findViewById(R.id.txtResultado)
        imgDado = findViewById(R.id.imgDado)

        btnLanzar.setOnClickListener {
            lanzarDado()
        }
    }

    // Método para simular el lanzamiento del dado
    private fun lanzarDado() {
        val rotateAnimation = RotateAnimation(
            0f, 360f,
            RotateAnimation.RELATIVE_TO_SELF, 0.5f,
            RotateAnimation.RELATIVE_TO_SELF, 0.5f
        )
        rotateAnimation.duration = 100  // Duración de cada rotación en milisegundos
        rotateAnimation.repeatCount = 20  // Número de veces que se repite la animación
        imgDado.startAnimation(rotateAnimation) // Inicia la animación en la img del dado

        // Crea un Runnable para actualizar el resultado del dado repentinamente
        val runnable = object : Runnable {
            var count = 0

            override fun run() {
                if (count < 20) {
                    // Genera un número aleatorio temporal del 1 al 6 y lo muestra
                    val resultadoTemporal = Random.nextInt(1, 7)
                    txtResultado.text = resultadoTemporal.toString()
                    count++
                    // Ejecuta de nuevo el runnable después de 50 milisegundos
                    handler.postDelayed(this, 50)
                } else {
                    // Después de 20 actualizaciones, genera el resultado final
                    val resultadoFinal = Random.nextInt(1, 7)
                    txtResultado.text = resultadoFinal.toString()
                    imgDado.clearAnimation() // Dtenemos la animación de rotación
                }
            }
        }

        // Inicia la ejecuación del Runnable
        handler.post(runnable)
    }
}
