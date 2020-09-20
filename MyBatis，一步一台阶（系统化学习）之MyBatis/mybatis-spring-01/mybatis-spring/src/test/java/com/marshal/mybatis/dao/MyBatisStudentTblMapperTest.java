package com.marshal.mybatis.dao;

import com.marshal.mybatis.dao.entity.MybatisStudentTbl;
import com.marshal.mybatis.service.MyBatisStudentTblService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 王毅
 * @Date 2020/2/27 11:45
 */
public class MyBatisStudentTblMapperTest {

    private MyBatisStudentTblService myBatisStudentTblService;

    @Before
    public void init(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        myBatisStudentTblService = (MyBatisStudentTblService) applicationContext.getBean("myBatisStudentTblService");
    }

    @Test
    public void testSelectByPrimaryKey(){

        Long studentIdParam = 1L;
        MybatisStudentTbl mybatisStudentTbl = myBatisStudentTblService.getByPrimaryKey(studentIdParam);

        System.out.println(mybatisStudentTbl);
    }
}
