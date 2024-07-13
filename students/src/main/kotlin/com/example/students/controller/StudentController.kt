package com.example.students.controller

import com.example.students.model.Student
import com.example.students.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/students")
class StudentController {
    @Autowired
    lateinit var studentService: StudentService

    @GetMapping
    fun list ():List <Student> {
        return studentService.list()
    }

    @PostMapping
    fun save(@RequestBody student: Student) : ResponseEntity<Student> {
        return ResponseEntity(studentService.save(student), HttpStatus.OK)
    }
/*
    @PutMapping
    fun update(@RequestBody student: Student): ResponseEntity<Student> {
        return ResponseEntity(studentService.update(student), HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long): Boolean? {
        return studentService.delete(id)
    }*/
}
