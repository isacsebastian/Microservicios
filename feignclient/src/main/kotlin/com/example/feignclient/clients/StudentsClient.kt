package com.example.feignclient.clients

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "students-ms")
interface StudentsClient {
    @GetMapping("/students")
    fun getStudents(): List<Student>
}
