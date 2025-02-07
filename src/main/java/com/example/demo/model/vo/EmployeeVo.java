package com.example.demo.model.vo;

import lombok.Data;

@Data
public class EmployeeVo {

    private Long empId;

    private Integer deptId;

    private String empEmail;

    private String deptName;

    private String deptDesc;
}
