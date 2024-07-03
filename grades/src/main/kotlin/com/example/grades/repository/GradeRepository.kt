package com.example.grades.repository

import com.example.grades.model.Grade
import org.springframework.data.jpa.repository.JpaRepository


interface GradeRepository : JpaRepository<Grade, Long?> {
    fun findById (id:Long?):Grade?
}