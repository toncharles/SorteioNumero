package br.com.washingtoncharles.sorteionumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBotao(view: View){
        //Log.i("BOTAO","Botão foi pressionado")
        var texto = findViewById(R.id.textoSorteio) as TextView
        var numero = findViewById(R.id.numeroExibicao) as TextView
        var numeroSorteado = Random().nextInt(11)
        texto.setText("O número sorteado foi:")
        numero.setText("$numeroSorteado")

    }
}
