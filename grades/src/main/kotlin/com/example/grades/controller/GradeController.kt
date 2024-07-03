package com.example.grades.controller

import com.example.grades.model.Grade
import com.example.grades.service.GradeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/grade")
class GradeController {
    @Autowired
    lateinit var gradeService: GradeService

    @GetMapping
    fun list ():List<Grade> {
        return gradeService.list()
    }

    @PostMapping
    fun save (@RequestBody grade: Grade): ResponseEntity<Grade> {
        return ResponseEntity(gradeService.save(grade), HttpStatus.OK)
    }

    @PutMapping
    fun update (@RequestBody grade: Grade): ResponseEntity<Grade> {
        return ResponseEntity(gradeService.update(grade), HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id : Long ): Boolean? {
        return gradeService.delete(id)
    }
}