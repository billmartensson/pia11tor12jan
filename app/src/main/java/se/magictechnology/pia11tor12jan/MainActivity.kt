package se.magictechnology.pia11tor12jan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var usernameET : EditText
    lateinit var passwordET : EditText

    var currentsum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameET = findViewById(R.id.loginUsernameET)
        passwordET = findViewById(R.id.loginPasswordET)

        findViewById<Button>(R.id.loginButton).setOnClickListener {

            val username = usernameET.text.toString()
            val password = passwordET.text.toString()

            if(username == "" || password == "") {
                findViewById<TextView>(R.id.loginErrorText).visibility = View.VISIBLE
            } else {
                findViewById<TextView>(R.id.loginErrorText).visibility = View.GONE
            }

        }

        findViewById<TextView>(R.id.loginHeaderText).setOnClickListener {
            findViewById<TextView>(R.id.loginDescriptionText).text = "Klickat!!"
        }



        findViewById<Button>(R.id.addButton).setOnClickListener {

            var addET = findViewById<EditText>(R.id.addingET)

            var addString = addET.text.toString()

            /*
            var addNumber = addString.toIntOrNull()

            if(addNumber != null) {
                currentsum = currentsum + addNumber
            }
            */

            addString.toIntOrNull()?.let {
                currentsum = currentsum + it
            }


            findViewById<TextView>(R.id.sumTextview).text = currentsum.toString()
        }


    }


}