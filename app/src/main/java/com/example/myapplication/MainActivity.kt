package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var nameInput: EditText

    private lateinit var surnameInput: EditText

    private lateinit var emailInput: EditText

    private lateinit var passwordInput: EditText

//    private lateinit var checkboxInput: EditText

    private lateinit var registrationButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameInput = findViewById(R.id.nameInput)

        surnameInput = findViewById(R.id.surnameInput)

        emailInput = findViewById(R.id.emailInput)

        passwordInput = findViewById(R.id.passwordInput)

//        checkboxInput = findViewById(R.id.checkboxInput)

        registrationButton = findViewById(R.id.registrationButton)



        registrationButton.setOnClickListener {

            val name = nameInput.text.toString()

            val surname = surnameInput.text.toString()

            val mail = emailInput.text.toString()

            val password = passwordInput.text.toString()

            val register = registrationButton.text.toString()


            if(name.isEmpty()){

                nameInput.error = "some"
                return@setOnClickListener

            }


        }




        }


    }




