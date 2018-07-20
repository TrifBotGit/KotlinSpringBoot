package com.example.demo.dao.impl

import com.example.demo.dao.UserDAO
import com.example.demo.dao.UserRepository
import com.example.demo.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
open class UserDAOImpl : UserDAO {

    @Autowired
    private lateinit var userRepository: UserRepository

    override fun save(user : User) : Unit{
        userRepository.save(user)
    }
}