package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.model.Department;
import com.example.demo.model.vo.DepartmentVo;

import java.util.List;

public interface DepartmentService extends IService<Department> {

    List<DepartmentVo> getDepartments();
}
