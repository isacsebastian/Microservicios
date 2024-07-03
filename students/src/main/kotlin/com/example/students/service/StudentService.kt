package com.example.students.service

import com.example.students.model.Student
import com.example.students.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException


@Service
class StudentService {

    @Autowired
    lateinit var studentRepository: StudentRepository

    fun list(): List<Student> {
        return studentRepository.findAll()
    }

    fun save (student: Student): Student {
        try {
            student.full_Name?.takeIf { it.trim().isNotEmpty() }
                ?: throw Exception("Student name is null")
            student.career?.takeIf { it.trim().isNotEmpty() }
                ?: throw Exception("this career no valid")
            return studentRepository.save(student)
        } catch (ex: Exception) {
            throw  ResponseStatusException(HttpStatus.BAD_REQUEST, ex.message)
        }
    }

    fun update(student: Student): Student {
        try {
            studentRepository.findById(student.id)
                ?: throw  Exception("Student not found")
            return studentRepository.save(student)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun delete (id: Long?): Boolean? {
        try {
            val response = studentRepository.findById(id)
                ?: throw  Exception("Student id not found")
            studentRepository.deleteById(id!!)
            return true
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}