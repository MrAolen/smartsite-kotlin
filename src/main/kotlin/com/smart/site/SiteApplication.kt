package com.smart.site

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SiteApplication

fun main(args: Array<String>) {
    SpringApplication.run(SiteApplication::class.java, *args)
}
