package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.model.vo.DepartmentVo;
import com.example.demo.model.vo.EmployeeVo;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department")
@CrossOrigin(origins = "http://localhost:4200")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/getDepartments")
    public List<DepartmentVo> getDepartments() {
        List<DepartmentVo> res = departmentService.getDepartments();
        return res;
    }



//    @PostMapping()
//    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
//        return new ResponseEntity<Employee>(employeeService.createEmployee(employee), HttpStatus.CREATED);
//    }
}
