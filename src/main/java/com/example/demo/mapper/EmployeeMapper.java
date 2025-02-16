package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.example.demo.model.Book;
import com.example.demo.model.Employee;
import com.example.demo.model.vo.BookVo;
import com.example.demo.model.vo.EmployeeVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

    List<EmployeeVo> selectListByQuery(@Param(Constants.WRAPPER) QueryWrapper<EmployeeVo> queryWrapper);

    IPage<EmployeeVo> selectEmployeePage(IPage<EmployeeVo> page, @Param(Constants.WRAPPER) QueryWrapper<EmployeeVo> queryWrapper);

    @Select("SELECT book.id, book.title " +
            "FROM employees " +
            "INNER JOIN emp_book ON employees.id = emp_book.emp_id " +
            "INNER JOIN book ON emp_book.book_id = book.id " +
            "WHERE employees.id = #{empId}")
    @Results(
        id = "selectEmployeeBooks", value = {
        @Result(property = "bookId", column = "id"),
        @Result(property = "bookTitle", column = "title")
    })
    List<BookVo> selectEmployeeBooks(@Param("empId") Long empId);
}
