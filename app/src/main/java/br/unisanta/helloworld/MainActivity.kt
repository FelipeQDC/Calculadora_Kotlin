package br.unisanta.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  edtValor1 = findViewById<EditText>(R.id.edt_valor1)
        val  edtValor2 = findViewById<EditText>(R.id.edt_valor2)
        val  btn = findViewById<Button>(R.id.button)
        val  btn2 = findViewById<Button>(R.id.button2)
        val  btn3 = findViewById<Button>(R.id.button3)
        val  btn4 = findViewById<Button>(R.id.button4)
        btn.setOnClickListener{
            if(edtValor1.text.toString() != "" && edtValor2.text.toString() != ""){  val Valor1 = edtValor1.text.toString().toInt()
                val Valor2 = edtValor2.text.toString().toInt()
                val soma = Valor1 + Valor2
                Toast.makeText(this, "O valor da soma é $soma", Toast.LENGTH_SHORT).show()
            }
            else{  Toast.makeText(this, "Preencha os dois valores", Toast.LENGTH_SHORT).show()}
        }
        btn2.setOnClickListener{
            if(edtValor1.text.toString() != "" && edtValor2.text.toString() != ""){  val Valor1 = edtValor1.text.toString().toInt()
                val Valor2 = edtValor2.text.toString().toInt()
                val subtracao = Valor1 - Valor2
                Toast.makeText(this, "O valor da subtração é $subtracao", Toast.LENGTH_SHORT).show()
            }  else{  Toast.makeText(this, "Preencha os dois valores", Toast.LENGTH_SHORT).show()}
        }
        btn3.setOnClickListener{
            if(edtValor1.text.toString() != "" && edtValor2.text.toString() != ""){   val Valor1 = edtValor1.text.toString().toInt()
                val Valor2 = edtValor2.text.toString().toInt()
                val Mult = Valor1 * Valor2
                Toast.makeText(this, "O valor da multiplicação é $Mult", Toast.LENGTH_SHORT).show()
            }  else{  Toast.makeText(this, "Preencha os dois valores", Toast.LENGTH_SHORT).show()}
        }
        btn4.setOnClickListener{
            if(edtValor1.text.toString() != "" && edtValor2.text.toString() != ""){ val Valor1 = edtValor1.text.toString().toFloat()
                val Valor2 = edtValor2.text.toString().toFloat()
                val Div = Valor1 / Valor2
                Toast.makeText(this, "O valor da Divisão é $Div", Toast.LENGTH_SHORT).show()
            }  else{  Toast.makeText(this, "Preencha os dois valores", Toast.LENGTH_SHORT).show()}
        }
    }
}