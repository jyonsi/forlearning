package com.marshal.springmvc.dao;

import com.marshal.springmvc.dao.entity.MybatisTeacherTbl;
import java.util.List;

public interface MybatisTeacherTblMapper {

    int deleteByPrimaryKey(Long teacherId);

    int insert(MybatisTeacherTbl record);

    MybatisTeacherTbl selectByPrimaryKey(Long teacherId);

    List<MybatisTeacherTbl> selectAll();

    int updateByPrimaryKey(MybatisTeacherTbl record);
}