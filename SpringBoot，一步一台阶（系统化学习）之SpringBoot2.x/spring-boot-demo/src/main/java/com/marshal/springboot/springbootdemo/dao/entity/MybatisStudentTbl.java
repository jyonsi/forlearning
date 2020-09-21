package com.marshal.springboot.springbootdemo.dao.entity;

public class MybatisStudentTbl {

    private Long studentId;

    private String studentName;

    private Byte studentSex;

    private String birthday;

    private Double height;

    private Double weight;

    private Long classId;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Byte getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Byte studentSex) {
        this.studentSex = studentSex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public MybatisStudentTbl() {
    }

    public MybatisStudentTbl(String studentName,
                             Byte studentSex,
                             String birthday,
                             Double height,
                             Double weight,
                             Long classId) {

        this.studentName = studentName;
        this.studentSex = studentSex;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
        this.classId = classId;
    }
}