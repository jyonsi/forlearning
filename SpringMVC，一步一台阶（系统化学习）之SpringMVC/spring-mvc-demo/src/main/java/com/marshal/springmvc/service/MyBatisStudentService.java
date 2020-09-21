package com.marshal.springmvc.service;

import com.marshal.springmvc.dao.MybatisStudentTblMapper;
import com.marshal.springmvc.dao.entity.MybatisStudentTbl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 王毅
 * @Date 2020/3/29 21:52
 */
@Service
public class MyBatisStudentService {

    @Autowired
    private MybatisStudentTblMapper mybatisStudentTblMapper;

    public List<MybatisStudentTbl> getStudents(){

        List<MybatisStudentTbl> mybatisStudentTblList = mybatisStudentTblMapper.selectAll();

        return mybatisStudentTblList;
    }
}
