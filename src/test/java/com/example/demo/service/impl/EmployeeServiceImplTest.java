package com.example.demo.service.impl;

import com.example.demo.mapper.EmployeeRepository;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@SpringBootTest
class EmployeeServiceImplTest {

    @Autowired
    private EmployeeService employeeService;

    @MockBean
    private EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
        assertNotNull(employeeService);
    }

    @Test
    void getAllEmployees() {

    }

    @Test
    void getEmployeeById() {
        Employee employee = new Employee();
        employee.setId(999L);
        employee.setFirstName("William");
        employee.setLastName("Wang");
        employee.setEmail("William.Wang@google.com");

        when(employeeRepository.findById(999L)).thenReturn(Optional.of(employee));
        Employee result = employeeService.getEmployeeById(999L);

        assertThat(result).isEqualTo(employee);

        verify(employeeRepository, times(1)).findById(999L);
    }
}