package com.example.students.repository

import com.example.students.model.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository: JpaRepository<Student, Long> {
    fun findById (id: Long?): Student?
}