package com.example.demo.model.vo;

import com.example.demo.model.Book;
import com.example.demo.model.Employee;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
public class BookVo {

    // private Long id;

    // private Long empId;

    private Long bookId;

    private String bookTitle;

//    @ManyToMany(mappedBy = "books")
//    private List<Employee> writers;

    // private Book book;

}
