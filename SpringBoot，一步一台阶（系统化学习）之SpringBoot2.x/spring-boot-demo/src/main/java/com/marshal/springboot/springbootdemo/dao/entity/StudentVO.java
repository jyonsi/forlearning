package com.marshal.springboot.springbootdemo.dao.entity;

/**
 * @Author 王毅
 * @Date 2020/4/22 16:36
 */
public class StudentVO {

    private Student studentA;
    private Pet pet;

    public Student getStudent() {
        return studentA;
    }

    public void setStudent(Student student) {
        this.studentA = student;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "StudentVO{" +
                "student=" + studentA +
                ", pet=" + pet +
                '}';
    }
}
