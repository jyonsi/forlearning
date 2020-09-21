package com.marshal.springboot.springbootdemo.dao;

import com.marshal.springboot.springbootdemo.dao.entity.MybatisTeacherTbl;
import java.util.List;

public interface MybatisTeacherTblMapper {

    int deleteByPrimaryKey(Long teacherId);

    int insert(MybatisTeacherTbl record);

    MybatisTeacherTbl selectByPrimaryKey(Long teacherId);

    List<MybatisTeacherTbl> selectAll();

    int updateByPrimaryKey(MybatisTeacherTbl record);
}