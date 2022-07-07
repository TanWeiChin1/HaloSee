package my.edu.tarc.halosee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    //Model level
    override fun onCreate(savedInstanceState: Bundle?) {
        //Local level
        super.onCreate(savedInstanceState)

        //Display UI
        //R = resources (res folder)
        setContentView(R.layout.activity_main)

        //Declare Variable to link program and UI
        //val = value, var = variable
        val textViewMessage =  findViewById<TextView>(R.id.textViewMessage)
        //val textViewMessage2 : TextView = findViewById(R.id.textViewMessage)

        val buttonShowMessage: Button = findViewById(R.id.buttonShowMessage)
        val imageViewQR : ImageView = findViewById(R.id.imageViewQR)

        buttonShowMessage.setOnClickListener{
            //textViewMessage.text = "Halo"
            //textViewMessage.text = getString(R.string.greeting)
            textViewMessage.text = String.format("%s",getString(R.string.greeting))
            imageViewQR.visibility = View.VISIBLE
        }
    }
}