package com.example.demandedepiecesetatcivil

import java.time.LocalDate

data class Etudiant(
    var prenoms: String? = null,
    var nom: String? = null,
    var datedenaissance: LocalDate,
    //    @field:JvmField // use this annotation if your Boolean field is prefixed with 'is'
    //    val isCapital: Boolean? = null,
    var lieudenaissance: String? = null,
    var username: String? = null,
    var password: String? = null
)