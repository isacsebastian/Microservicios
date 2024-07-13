package com.example.feignclient.clients

import org.springframework.stereotype.Service

@Service
class StudentService(private val studentsClient: StudentsClient) {

    fun getAllStudents(): List<Student> {
        return studentsClient.getStudents()
    }
}
