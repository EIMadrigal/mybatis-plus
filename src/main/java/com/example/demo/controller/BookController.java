package com.example.demo.controller;

import com.example.demo.model.vo.EmployeeVo;
import com.example.demo.service.BookService;
import com.example.demo.util.Result;
import com.example.demo.util.ResultUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getBookWriters/{bookId}")
    public Result getBookWriters(@PathVariable Long bookId) {
        return ResultUtil.success(bookService.selectBookWriters(bookId));
    }
}
