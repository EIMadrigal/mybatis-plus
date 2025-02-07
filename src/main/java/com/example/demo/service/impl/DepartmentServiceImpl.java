package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.model.vo.DepartmentVo;
import com.example.demo.model.vo.EmployeeVo;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

    @Override
    public List<DepartmentVo> getDepartments() {
        QueryWrapper<DepartmentVo> queryWrapper = new QueryWrapper<>();
        // queryWrapper.
        List<DepartmentVo> res = baseMapper.selectEmployees(queryWrapper);
        return res;
    }
//    @Autowired
//    private DepartmentMapper departmentMapper;
//
//    public void getAllDepartments() {
//        List<Department> depts = departmentMapper.selectList(null);
//
//    }
//
//    public void addDepartment(Department department) {
//        departmentMapper.insert(department);
//    }
//
//    public Department getDepartmentById(Long deptId) {
//        return departmentMapper.selectById(deptId);
//    }
//
//    public void updateDepartment(Department department) {
//        departmentMapper.updateById(department);
//    }
//
//    public void deleteDepartment(Long deptId) {
//        departmentMapper.deleteById(deptId);
//    }

}
