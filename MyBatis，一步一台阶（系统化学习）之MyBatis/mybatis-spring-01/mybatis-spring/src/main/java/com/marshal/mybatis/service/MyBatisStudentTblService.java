package com.marshal.mybatis.service;

import com.marshal.mybatis.dao.MybatisStudentTblMapper;
import com.marshal.mybatis.dao.entity.MybatisStudentTbl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 王毅
 * @Date 2020/2/27 17:14
 */
@Service("myBatisStudentTblService")
public class MyBatisStudentTblService {

    @Autowired
    private MybatisStudentTblMapper mybatisStudentTblMapper;

    public MybatisStudentTbl getByPrimaryKey(Long studentId){

        MybatisStudentTbl mybatisStudentTbl = mybatisStudentTblMapper.selectByPrimaryKey(studentId);

        return mybatisStudentTbl;
    }
}
