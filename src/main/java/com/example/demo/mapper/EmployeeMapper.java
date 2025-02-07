package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.example.demo.model.Employee;
import com.example.demo.model.vo.EmployeeVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface EmployeeMapper extends BaseMapper<Employee> {

    List<EmployeeVo> selectListByQuery(@Param(Constants.WRAPPER) QueryWrapper<EmployeeVo> queryWrapper);

    IPage<EmployeeVo> selectEmployeePage(IPage<EmployeeVo> page, @Param(Constants.WRAPPER) QueryWrapper<EmployeeVo> queryWrapper);
}
