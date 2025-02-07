package com.example.demo.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.demo.model.vo.EmployeeVo;
import com.example.demo.service.EmployeeService;
import com.example.demo.util.Result;
import com.example.demo.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmployees")
    public Result getEmployees() {
        List<EmployeeVo> res = employeeService.getEmployees();
        return ResultUtil.success(res);
    }

    @GetMapping("/getEmployeesPage")
    public Result getEmployeesPage(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                   @RequestParam(required = false, defaultValue = "2") Integer pageSize) {
        IPage<EmployeeVo> res = employeeService.getEmployeesPage(pageNum, pageSize);
        System.out.println("Total records: " + res.getTotal());
        System.out.println("Total pages: " + res.getPages());
        System.out.println("Current page: " + res.getCurrent());
        List<EmployeeVo> records = res.getRecords();
        records.forEach(System.out::println);
        return ResultUtil.success(res);
    }
}
