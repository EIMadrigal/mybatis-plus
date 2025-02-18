package com.example.demo.controller;

import com.example.demo.mapper.CourseMapper;
import com.example.demo.mapper.StudentCourseMapper;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.model.StudentCourse;
import com.example.demo.repositories.CourseRepository;
import com.example.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private StudentCourseMapper studentCourseMapper;

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

    @GetMapping("/update")
    public void update(Student student, Long[] courseIds) {
        // updateById
        Optional<Student> optionalStu = studentRepository.findById(student.getId());
        if (optionalStu.isPresent()) {
            Student stu = optionalStu.get();
            stu.setName(student.getName());
            studentRepository.save(stu);
        } else {
            studentRepository.save(student);
        }


    }

    @GetMapping("/updateStudent")
    public void updateStudent(Student student, Long[] courseIds) {
        studentMapper.updateById(student);

        Map<String, Object> map = new HashMap<>();
        map.put("stu_id", student.getId());
        int i = studentCourseMapper.deleteByMap(map);
        System.out.println("To be deleted in stu_course table: " + i);

        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setStuId(student.getId());
        for (Long courseId : courseIds) {
            studentCourse.setCourseId(courseId);
            studentCourseMapper.insert(studentCourse);
        }
    }

    @GetMapping("/deleteStudent")
    public void deleteStudent(Long studentId) {
        Map<String, Object> map = new HashMap<>();
        map.put("stu_id", studentId);

        int i = studentCourseMapper.deleteByMap(map);
        System.out.println("To be deleted in stu_course table: " + i);

        studentMapper.deleteById(studentId);
    }

}
