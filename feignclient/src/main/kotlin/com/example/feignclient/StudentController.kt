package com.example.feignclient

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController(val studentServiceClient: StudentServiceClient) {

    @GetMapping("/feign/students/{id}")
    fun getStudentById(@PathVariable id: String): Student {
        return studentServiceClient.getStudentById(id)
    }
}
