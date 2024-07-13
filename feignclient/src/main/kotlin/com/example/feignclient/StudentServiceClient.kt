package com.example.feignclient

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "students-ms")
interface StudentServiceClient {
    @GetMapping("/students/{id}")
    fun getStudentById(@PathVariable id: String): Student
}

data class Student(val id: String, val name: String, val age: Int)
