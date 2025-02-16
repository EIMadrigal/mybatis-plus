package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.model.Book;
import com.example.demo.model.vo.EmployeeVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService extends IService<Book> {

    List<EmployeeVo> selectBookWriters(@Param("bookId") Long bookId);
}
