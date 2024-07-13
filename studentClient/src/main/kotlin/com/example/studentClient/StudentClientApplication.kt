package com.example.studentClient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StudentClientApplication

fun main(args: Array<String>) {
	runApplication<StudentClientApplication>(*args)
}
