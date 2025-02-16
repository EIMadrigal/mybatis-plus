package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repositories.CourseRepository;
import com.example.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/getStudent")
    public void getStudent() {
        Student student = new Student("John Doe");
        studentRepository.save(student);

        Course course1 = new Course("Machine Learning");
        Course course2 = new Course("Database Systems");
        Course course3 = new Course("Web Basics");
        courseRepository.saveAll(Arrays.asList(course1, course2, course3));
    }

    @GetMapping("/getCourse")
    public void getCourse() {
        Student student = studentRepository.findById(1L).orElseThrow();
        Course course1 = courseRepository.findById(1L).orElseThrow();
        Course course2 = courseRepository.findById(2L).orElseThrow();

        student.getCourses().addAll(Arrays.asList(course1, course2));
        studentRepository.save(student);
    }

}
