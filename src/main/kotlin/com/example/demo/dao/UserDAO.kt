package com.example.demo.dao

import com.example.demo.model.User

interface UserDAO {

    fun save(user : User): Unit
}