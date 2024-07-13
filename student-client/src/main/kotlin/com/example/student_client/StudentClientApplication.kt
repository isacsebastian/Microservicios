package com.example.student_client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
class StudentClientApplication

fun main(args: Array<String>) {
	runApplication<StudentClientApplication>(*args)
}
