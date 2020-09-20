package com.marshal.mybatis.dao;

import com.marshal.mybatis.dao.entity.MybatisTeacherTbl;
import java.util.List;

public interface MybatisTeacherTblMapper {
    int deleteByPrimaryKey(Long teacherId);

    int insert(MybatisTeacherTbl record);

    MybatisTeacherTbl selectByPrimaryKey(Long teacherId);

    List<MybatisTeacherTbl> selectAll();

    int updateByPrimaryKey(MybatisTeacherTbl record);
}