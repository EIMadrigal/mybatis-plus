package com.example.demo.model.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DepartmentVo {

    private Integer deptId;

    private String deptName;

    private LocalDateTime createTime;

    private Long empId;

    private String email;
}
