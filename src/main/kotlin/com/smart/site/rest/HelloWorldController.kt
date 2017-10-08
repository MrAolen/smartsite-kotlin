package com.smart.site.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HelloWorldController {

    @GetMapping("/")
    fun helloWorld() = "HelloWorld !"

}