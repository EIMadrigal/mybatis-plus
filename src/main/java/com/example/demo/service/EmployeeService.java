package com.example.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.model.Employee;
import com.example.demo.model.vo.BookVo;
import com.example.demo.model.vo.EmployeeVo;
import com.example.demo.util.Result;
import com.example.demo.util.ResultUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeService extends IService<Employee> {

    List<EmployeeVo> getEmployees();

    IPage<EmployeeVo> getEmployeesPage(Integer pageNum, Integer pageSize);

    // EmployeeVo getEmployee(Integer empId);

    List<BookVo> selectEmployeeBooks(Long empId);
}
