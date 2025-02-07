package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceImplTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void getEmployee() {
        LambdaQueryWrapper<Employee> wrapper = Wrappers.lambdaQuery();
        wrapper.gt(Employee::getId, 5);
        Employee employee = employeeService.getOne(wrapper, false);
        System.out.println(employee);
    }

    @Test
    public void insertEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Pony");
        employee.setLastName("Ma");
        employee.setEmail("Pony.Ma@tencent.com");
        employee.setDeptId(2L);
        employeeService.save(employee);
    }

    @Test
    public void insertEmployee2() {
        Employee employee = new Employee();
        employee.setFirstName("Jack");
        employee.setLastName("Ma");
        employee.setEmail("Jack.Ma@alibaba.com");
        employee.setDeptId(2L);
        employeeService.save(employee);
    }

    @Test
    public void insertEmployee3() {
        Employee employee = new Employee();
        employee.setFirstName("Richard");
        employee.setLastName("Yu");
        employee.setEmail("Richard.Yu@huawei.com");
        employee.setDeptId(3L);
        employeeService.save(employee);
    }
}
