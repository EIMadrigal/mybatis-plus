package com.example.demo.service.impl;

import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public void addDepartment(Department department) {
        departmentMapper.insert(department);
    }

    public Department getDepartmentById(Long deptId) {
        return departmentMapper.selectById(deptId);
    }

    public void updateDepartment(Department department) {
        departmentMapper.updateById(department);
    }

    public void deleteDepartment(Long deptId) {
        departmentMapper.deleteById(deptId);
    }

}
