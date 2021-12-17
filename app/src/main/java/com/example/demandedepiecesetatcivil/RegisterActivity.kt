package com.example.demandedepiecesetatcivil

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class RegisterActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // ...
        // Initialize Firebase Auth
        var auth: FirebaseAuth = Firebase.auth

        val mPrenomsEditText: EditText = findViewById(R.id.register_edittext_prenom)
        val mNomEditText: EditText = findViewById(R.id.register_edittext_nom)
        val mDatedenaissanceEditText: EditText =
            findViewById(R.id.register_edittext_datedenaissance)
        val mLieudenaissanceEditText: EditText =
            findViewById(R.id.register_edittext_lieudenaissance)
        val mUsernameEditText: EditText = findViewById(R.id.register_edittext_username)
        val mPasswordEditText: EditText = findViewById(R.id.register_edittext_motdepasse)

        val mRegisterButton: Button = findViewById(R.id.register_button_register)

        mRegisterButton.setOnClickListener {
            inscrireUser()
            Toast.makeText(this, "inscription effectuée avec succès", Toast.LENGTH_SHORT).show()
        }
    }

//    public override fun onStart() {
//        super.onStart()
//        // Check if user is signed in (non-null) and update UI accordingly.
//        val currentUser = auth.currentUser
//        if(currentUser != null){
//            reload();
//        }
//    }
}

//private fun createAccount(email: String, password: String) {
//    // [START create_user_with_email]
//    auth.createUserWithEmailAndPassword(email, password)
//        .addOnCompleteListener(this) { task ->
//            if (task.isSuccessful) {
//                // Sign in success, update UI with the signed-in user's information
//                Log.d(TAG, "createUserWithEmail:success")
//                val user = auth.currentUser
//                updateUI(user)
//            } else {
//                // If sign in fails, display a message to the user.
//                Log.w(TAG, "createUserWithEmail:failure", task.exception)
//                Toast.makeText(baseContext, "Authentication failed.",
//                    Toast.LENGTH_SHORT).show()
//                updateUI(null)
//            }
//        }
//    // [END create_user_with_email]
//}

//abstract class DocSnippets() {
@SuppressLint("StaticFieldLeak")
lateinit var db: FirebaseFirestore
//    companion object {
//
//        private val TAG = "DocSnippets"
//
//        private val EXECUTOR = ThreadPoolExecutor(
//            2, 4,
//            60, TimeUnit.SECONDS, LinkedBlockingQueue()
//        )
//    }

//fun setup() {
//    // [START get_firestore_instance]
//    db = Firebase.firestore
//    // [END get_firestore_instance]
//
//    // [START set_firestore_settings]
//    val settings = firestoreSettings {
//        isPersistenceEnabled = true
//    }
//    db.firestoreSettings = settings
//    // [END set_firestore_settings]
//}

//private fun setupCacheSize() {
//    // [START fs_setup_cache]
//    val settings = firestoreSettings {
//        cacheSizeBytes = FirebaseFirestoreSettings.CACHE_SIZE_UNLIMITED
//    }
//    db.firestoreSettings = settings
//    // [END fs_setup_cache]
//}
//}

@RequiresApi(Build.VERSION_CODES.O)
private fun inscrireUser() {

    val datedenaissance = LocalDate.parse("mDatedenaissanceEditText", DateTimeFormatter.ISO_DATE)

    val etudiant = Etudiant(
        "mPrenomsEditText",
        "mNomEditText",
        datedenaissance,
        "mLieudenaissanceEditText",
        "mUsernameEditText",
        "mPasswordEditText"

    )
    db.collection("utilisateurs").document("userid").set(etudiant)
}