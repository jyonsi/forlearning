package com.marshal.springboot.springbootdemo.dao.entity;

/**
 * @Author 王毅
 * @Date 2020/4/22 16:36
 */
public class Pet {

    private String petName;
    private String color;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petName='" + petName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
