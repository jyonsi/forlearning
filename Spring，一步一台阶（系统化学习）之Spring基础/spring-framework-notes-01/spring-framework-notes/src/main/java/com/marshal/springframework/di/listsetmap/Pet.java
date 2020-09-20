package com.marshal.springframework.di.listsetmap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pet")
public class Pet {

    @Value("啸天犬")
    private String name;

    @Value("黑色")
    private String color;

    @Value("100000000")
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
