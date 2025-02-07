package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.model.Employee;
import com.example.demo.model.vo.EmployeeVo;

import java.util.List;

public interface EmployeeService extends IService<Employee> {

    List<EmployeeVo> getEmployees();

    IPage<EmployeeVo> getEmployeesPage(Integer pageNum, Integer pageSize);

}
