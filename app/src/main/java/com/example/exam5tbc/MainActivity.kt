package com.example.exam5tbc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.username)
        val email = findViewById<EditText>(R.id.email)
        val phone = findViewById<EditText>(R.id.phone)
        val fullName = findViewById<EditText>(R.id.full_name)
        val birthday = findViewById<EditText>(R.id.birthday)
        val gender = findViewById<EditText>(R.id.gender)

        val fieldIdTxt = findViewById<TextView>(R.id.field_idTxt)
//        val hintTxt = findViewById<TextView>(R.id.hintTxt)
//        val field_typeTxt = findViewById<TextView>(R.id.field_typeTxt)
//        val keyboardTxt = findViewById<TextView>(R.id.keyboardTxt)
//        val requiredTxt = findViewById<TextView>(R.id.requiredTxt)
//        val is_activeTxt = findViewById<TextView>(R.id.is_activeTxt)

        val nextButton = findViewById<ImageButton>(R.id.nextButton)

        val map: MutableMap<String, String> = mutableMapOf(Pair("Key", "Value"))

            nextButton.setOnClickListener{
                if(email.text.isEmpty())
                    Toast.makeText(this, "არ არის შევსბული ფილდი: email", Toast.LENGTH_SHORT).show()
                else if (phone.text.isEmpty())
                    Toast.makeText(this, "არ არის შევსბული ფილდი: phone", Toast.LENGTH_SHORT).show()
                else if (fullName.text.isEmpty())
                    Toast.makeText(this, "არ არის შევსბული ფილდი: full_name", Toast.LENGTH_SHORT).show()
                else {
                    map["username"] = username.text.toString()
                    map["email"] = email.text.toString()
                    map["phone"] = phone.text.toString()
                    map["fullName"] = fullName.text.toString()
                    map["birthday"] = birthday.text.toString()
                    map["gender"] = gender.text.toString()
                }
                fieldIdTxt.text = map.toString()
        }

    }


}