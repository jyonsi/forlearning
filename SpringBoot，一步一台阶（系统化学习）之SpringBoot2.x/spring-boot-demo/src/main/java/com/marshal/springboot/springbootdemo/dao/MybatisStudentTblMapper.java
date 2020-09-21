package com.marshal.springboot.springbootdemo.dao;

import com.marshal.springboot.springbootdemo.dao.entity.MybatisStudentTbl;
import java.util.List;

public interface MybatisStudentTblMapper {

    int deleteByPrimaryKey(Long studentId);

    int insert(MybatisStudentTbl record);

    MybatisStudentTbl selectByPrimaryKey(Long studentId);

    List<MybatisStudentTbl> selectAll();

    int updateByPrimaryKey(MybatisStudentTbl record);
}