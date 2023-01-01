package com.joyful.java.mongodb.controller;

import com.joyful.java.mongodb.entity.Student;
import com.joyful.java.mongodb.repository.StudentRepository;
import com.joyful.java.mongodb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("{id}")
    public Optional<Student> getStudent(@PathVariable("id") String id){

        return studentService.getStudentById(id);

    }

    @PostMapping()
    public Optional<Student> createStudent(@RequestBody Student student){
        Optional<Student> optionalStudent = Optional.of(studentService.createStudent(student));
        return optionalStudent;
    }

}
