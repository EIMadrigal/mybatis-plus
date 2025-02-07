package com.example.demo;

import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.model.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void insertDepartment() {
        Department department = new Department();
        department.setDeptName("Tech");
        department.setDeptDesc("Technology");
        department.setCreateBy("Bob");
        department.setUpdateBy("Bob");
        departmentMapper.insert(department);
    }

}
