package com.marshal.springmvc.dao.entity;

/**
 * @Author 王毅
 * @Date 2020/3/19 15:55
 */
public class Pet {

    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
