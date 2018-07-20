package com.example.demo.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class User (@Id var id: Long = 0, var name : String= "test"){

    fun fromDto() : Unit{
        throw NotImplementedError();
    }

    fun toDto() : Unit{
        throw NotImplementedError();
    }
}