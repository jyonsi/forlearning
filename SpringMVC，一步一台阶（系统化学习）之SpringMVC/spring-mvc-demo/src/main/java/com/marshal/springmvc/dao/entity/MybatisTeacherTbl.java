package com.marshal.springmvc.dao.entity;

public class MybatisTeacherTbl {
    private Long teacherId;

    private String teacherName;

    private Byte teacherSex;

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Byte getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(Byte teacherSex) {
        this.teacherSex = teacherSex;
    }
}