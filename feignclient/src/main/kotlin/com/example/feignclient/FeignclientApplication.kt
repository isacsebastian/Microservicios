package com.example.feignclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FeignclientApplication

fun main(args: Array<String>) {
	runApplication<FeignclientApplication>(*args)
}
