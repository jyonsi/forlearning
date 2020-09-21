package com.marshal.springboot.springbootdemo.service;

import com.marshal.springboot.springbootdemo.dao.MybatisStudentTblMapper;
import com.marshal.springboot.springbootdemo.dao.entity.MybatisStudentTbl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 王毅
 * @Date 2020/4/29 10:19
 */
@Service
public class StudentService {

    @Autowired
    private MybatisStudentTblMapper mybatisStudentTblMapper;

    public List<MybatisStudentTbl> getAllStudents(){

        List<MybatisStudentTbl> mybatisStudentTblList = mybatisStudentTblMapper.selectAll();

        return mybatisStudentTblList;
    }

    public int addStudent(MybatisStudentTbl mybatisStudentTbl){

        int rowCount = mybatisStudentTblMapper.insert(mybatisStudentTbl);

        return rowCount;
    }

}
