package com.example.demo.model.vo;

import com.example.demo.model.Book;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeVo {

    private Long empId;

    private String empEmail;

    private Integer deptId;

    private String deptName;

    private String deptDesc;

    @ManyToMany
    @JoinTable(
        name = "emp_book",
        joinColumns = @JoinColumn(name = "emp_id"),
        inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private List<Book> books;
}
