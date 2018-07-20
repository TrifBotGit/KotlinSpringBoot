package com.example.demo.controller

import com.example.demo.dao.UserDAO
import com.example.demo.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
open class UserController {

    @Autowired
    lateinit var userDAO: UserDAO

    @GetMapping("/save/{id}")
    fun save (@PathVariable id : Long){
        var user = User(id, "test")
        userDAO.save(user)
    }

}