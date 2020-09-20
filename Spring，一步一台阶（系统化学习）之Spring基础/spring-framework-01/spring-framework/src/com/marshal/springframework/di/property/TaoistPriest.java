package com.marshal.springframework.di.property;

public class TaoistPriest {

    private String name;
    private String sex;
    private Integer age;
    private Float height;
    private Float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("调用了setName方法设置姓名："+name);
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        System.out.println("调用了setSex方法设置性别："+sex);
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println("调用了setAge方法设置年龄："+age);
        this.age = age;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        System.out.println("调用了setHeight方法设置身高："+height);
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        System.out.println("调用了setWeight方法设置体重："+weight);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "TaoistPriest{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
