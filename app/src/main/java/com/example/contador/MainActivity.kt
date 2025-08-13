package com.example.contador

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var contador = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtContador = findViewById<TextView>(R.id.txtContador)
        val btnAumentar = findViewById<Button>(R.id.btnAumentar)
        val btnDiminuir = findViewById<Button>(R.id.btnDiminuir)

        btnAumentar.setOnClickListener{
            contador++
            txtContador.text = contador.toString();
            btnDiminuir.isEnabled = true
        }

        btnDiminuir.setOnClickListener{
            if(btnDiminuir.isEnabled){
                contador--
                txtContador.text = contador.toString();
                if(contador==0) btnDiminuir.isEnabled = false
            }
        }
    }
}