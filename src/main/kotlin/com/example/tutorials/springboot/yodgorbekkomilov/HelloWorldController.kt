package com.example.tutorials.springboot.yodgorbekkomilov

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/hello")
class HelloWorldController {

    @GetMapping
    fun helloWorld():String = "Hello This is a Rest Ending Point"



}