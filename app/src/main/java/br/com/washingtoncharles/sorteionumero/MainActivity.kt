package br.com.washingtoncharles.sorteionumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view: View){
        //Log.i("BOTAO","Botão foi pressionado")
        var texto = findViewById(R.id.textoExibicao) as TextView
        texto.setText("Texto alterado")

    }
}
