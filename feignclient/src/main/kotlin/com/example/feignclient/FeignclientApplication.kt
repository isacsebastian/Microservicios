package com.example.feignclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableFeignClients
class FeignClientApplication

fun main(args: Array<String>) {
	runApplication<FeignClientApplication>(*args)
}