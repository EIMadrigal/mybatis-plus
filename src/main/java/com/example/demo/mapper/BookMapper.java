package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.Book;
import com.example.demo.model.vo.BookVo;
import com.example.demo.model.vo.EmployeeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper extends BaseMapper<Book> {

    @Select("SELECT employees.email " +
            "FROM book " +
            "INNER JOIN emp_book ON book.id = emp_book.book_id " +
            "INNER JOIN employees ON emp_book.emp_id = employees.id " +
            "WHERE book.id = #{bookId}")
    @Results(
        id = "selectBookWriters", value = {
        @Result(property = "empEmail", column = "email")
    })
    List<EmployeeVo> selectBookWriters(@Param("bookId") Long bookId);
}
