package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.model.Employee;
import com.example.demo.model.vo.BookVo;
import com.example.demo.model.vo.EmployeeVo;
import com.example.demo.service.EmployeeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeVo> getEmployees() {
        QueryWrapper<EmployeeVo> queryWrapper = new QueryWrapper<>();
        // queryWrapper.
        List<EmployeeVo> res = baseMapper.selectListByQuery(queryWrapper);
        return res;
    }

    @Override
    public IPage<EmployeeVo> getEmployeesPage(Integer pageNum, Integer pageSize) {
        QueryWrapper<EmployeeVo> queryWrapper = new QueryWrapper<>();
        // queryWrapper.

        Page<EmployeeVo> page = new Page<>(pageNum, pageSize);
        // page.setOptimizeCountSql(false);

        IPage<EmployeeVo> res = employeeMapper.selectEmployeePage(page, queryWrapper);
        return res;
    }

//    @Override
//    public EmployeeVo getEmployee(Integer empId) {
//
//    }

    @Override
    public List<BookVo> selectEmployeeBooks(Long empId) {
        return employeeMapper.selectEmployeeBooks(empId);
    }
}
