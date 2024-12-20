package com.alexis.alexiapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan
class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val et1= findViewById<EditText>(R.id.numero1)
        val et2= findViewById<EditText>(R.id.numero2)
        val total = findViewById<TextView>(R.id.textViewTotal)
        val buttonSuma=findViewById<Button>(R.id.btnSuma)
        buttonSuma.setOnClickListener{
            val nro1 = et1.text.toString().toInt()
            val nro2 = et2.text.toString().toInt()
            val suma = nro1+nro2
            total.text = "Suma: ${suma.toString()}";
        }

        val buttonResta=findViewById<Button>(R.id.btnResta)
        buttonResta.setOnClickListener{
            val nro1 = et1.text.toString().toInt()
            val nro2 = et2.text.toString().toInt()
            val resta = nro2-nro1
            total.text = "Resta: ${resta.toString()}";
        }
        val buttonMultiplicar=findViewById<Button>(R.id.btnMultiplicacion)
        buttonMultiplicar.setOnClickListener{
            val nro1 = et1.text.toString().toInt()
            val nro2 = et2.text.toString().toInt()
            val multiplicar = nro1 * nro2
            total.text = "Multiplicación: ${multiplicar.toString()}";
        }
        val buttonDividir=findViewById<Button>(R.id.btnDivision)
        buttonDividir.setOnClickListener{
            val nro1 = et1.text.toString().toInt()
            val nro2 = et2.text.toString().toInt()
            if (nro1==0){
                total.text = "No se puede dividir entre 0";
            }else {
                val division = nro1 / nro2
                total.text = "División: ${division.toString()}";
            }
        }


        val btn_sin = findViewById<Button>(R.id.btnSin)
        val btn_cos = findViewById<Button>(R.id.btnCos)
        val btn_tan = findViewById<Button>(R.id.btnTan)
        val entry_number = findViewById<EditText>(R.id.entryNumber)
        val result = findViewById<TextView>(R.id.resultView)

        btn_sin.setOnClickListener {
            if (entry_number.text.isEmpty()) {
                result.text = "Ingrese un número"
                return@setOnClickListener
            }
            val number = entry_number.text.toString().toDouble()
            val resultado = sin(Math.toRadians(number))
            result.text = "Sin de $number° = ${resultado}"
        }

        btn_cos.setOnClickListener {
            if (entry_number.text.isEmpty()) {
                result.text = "Ingrese un número"
                return@setOnClickListener
            }
            val number = entry_number.text.toString().toDouble()
            val resultado = cos(Math.toRadians(number))
            result.text = "Coseno de $number° = ${resultado}"
        }

        btn_tan.setOnClickListener {
            if (entry_number.text.isEmpty()) {
                result.text = "Ingrese un número"
                return@setOnClickListener
            }
            val valor = entry_number.text.toString().toDouble()
            // Comprobar si la tangente es indefinida
            if (valor % 90 == 0.0 && (valor/ 90) % 2 != 0.0) {
                result.text = "Tangente de $valor° es indefinida"
            } else {
                val resultado = tan(Math.toRadians(valor))

                result.text = "Tangente de $valor°: $resultado"
            }
        }


    }
}