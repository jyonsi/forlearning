package com.marshal.springmvc.dao;

import com.marshal.springmvc.dao.entity.MybatisClassTbl;
import java.util.List;

public interface MybatisClassTblMapper {

    int deleteByPrimaryKey(Long classId);

    int insert(MybatisClassTbl record);

    MybatisClassTbl selectByPrimaryKey(Long classId);

    List<MybatisClassTbl> selectAll();

    int updateByPrimaryKey(MybatisClassTbl record);
}