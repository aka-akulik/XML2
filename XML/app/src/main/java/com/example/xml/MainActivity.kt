package com.example.xml

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextMessage: EditText
    private lateinit var buttonSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.editTextName)
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextMessage = findViewById(R.id.editTextMessage)
        buttonSend = findViewById(R.id.buttonSend)

        buttonSend.setOnClickListener {
            val name = editTextName.text.toString()
            val email = editTextEmail.text.toString()
            val message = editTextMessage.text.toString()

            if (name.isEmpty() || email.isEmpty() || message.isEmpty()) {
                Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Сообщение отправлено", Toast.LENGTH_SHORT).show()
                clearForm()
            }
        }
    }

    private fun clearForm() {
        editTextName.text.clear()
        editTextEmail.text.clear()
        editTextMessage.text.clear()
    }

    fun resetForm(view: android.view.View) {
        clearForm()
    }
}