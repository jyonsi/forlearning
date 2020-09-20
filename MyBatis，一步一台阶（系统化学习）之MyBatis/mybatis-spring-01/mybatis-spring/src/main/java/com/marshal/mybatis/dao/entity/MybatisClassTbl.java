package com.marshal.mybatis.dao.entity;

public class MybatisClassTbl {

    private Long classId;

    private String className;

    private Long teacherId;

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "MybatisClassTbl{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}