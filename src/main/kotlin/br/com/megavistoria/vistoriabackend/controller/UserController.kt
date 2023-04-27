package br.com.megavistoria.vistoriabackend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController {
    @GetMapping
    fun listUsers(): String{
        return "List users"
    }
//    fun listUsers() = "List users"
}