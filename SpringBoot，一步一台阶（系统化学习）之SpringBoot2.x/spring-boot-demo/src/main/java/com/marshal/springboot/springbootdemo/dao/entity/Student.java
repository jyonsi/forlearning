package com.marshal.springboot.springbootdemo.dao.entity;

/**
 * @Author 王毅
 * @Date 2020/4/22 15:14
 */
public class Student {

    private Long studentId;
    private String studentName;
    private Integer studentSex;
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
        this.studentName = studentName;
    }

    public Integer getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Integer studentSex) {
        this.studentSex = studentSex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentSex=" + studentSex +
                ", birthday='" + birthday + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", classId=" + classId +
                '}';
    }
}
