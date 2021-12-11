package com.example.demandedepiecesetatcivil

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mRetourIcon : ImageView = findViewById(R.id.toolbar_imageview_back)
//        val mTitleTextView : TextView = findViewById(R.id.toolbar_textview_demande)
        val mMenuIcon : ImageView = findViewById(R.id.toolbar_imageview_menu)

        mRetourIcon.setOnClickListener {
            goBack()
        }

        mMenuIcon.setOnClickListener {
            showMenu()
        }

//        val mDemanderButton : Button = findViewById(R.id.main_button_demander)
//        mDemanderButton.text = "Déposer ma demande"
//
//        mDemanderButton.setOnClickListener {
//            enregistrerDemande()
//            Toast.makeText(this, "demande enregistrée", Toast.LENGTH_SHORT).show()
//        }
    }

    private fun showMenu() {
        TODO("Not yet implemented")
    }

    private fun goBack() {
        TODO("Not yet implemented")
    }

//    private fun enregistrerDemande() {
//        val resultText : TextView = findViewById(R.id.main_textview_infos)
//        val randomInt : Int = Random.nextInt(8) + 1
//        resultText.text = randomInt.toString()
//    }
}