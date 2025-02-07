package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.example.demo.model.Department;
import com.example.demo.model.vo.DepartmentVo;
import com.example.demo.model.vo.EmployeeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {

    List<DepartmentVo> selectEmployees(@Param(Constants.WRAPPER) QueryWrapper<DepartmentVo> queryWrapper);
}
