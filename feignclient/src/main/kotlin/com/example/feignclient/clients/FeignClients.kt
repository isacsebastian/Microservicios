/*package com.example.feignclient.clients

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "students-ms", url = "http://localhost:8080") // Nombre del microservicio registrado en Eureka
interface StudentsClient {

    @GetMapping("/students")
    fun getStudents(): List<StudentsClient> // Define la estructura de tu respuesta, por ejemplo, Student data class
}

@FeignClient(name = "grades-ms", url = "http://localhost:8080") // Nombre del microservicio registrado en Eureka
interface GradesClient {

    @GetMapping("/grades")
    fun getGrades(): List<GradesClient> // Define la estructura de tu respuesta, por ejemplo, Grade data class
}*/