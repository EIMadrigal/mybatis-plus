package com.example.demo.controller;

import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.model.Department;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    void getAllDepartments() {
    }

    @Test
    public void insertDepartment() {
        Department department = new Department();
        department.setDeptName("HR");
        department.setDeptDesc("Human Resource");
        department.setCreateBy("Bob");
        department.setUpdateBy("Bob");
        departmentMapper.insert(department);
    }

}
