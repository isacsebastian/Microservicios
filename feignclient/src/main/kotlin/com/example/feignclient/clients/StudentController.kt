package com.example.feignclient.clients

import com.example.feignclient.clients.StudentService
import com.example.feignclient.clients.Student
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController(private val studentService: StudentService) {

    @GetMapping("/students")
    fun fetchStudents(): List<Student> {
        return studentService.getAllStudents()
    }
}
