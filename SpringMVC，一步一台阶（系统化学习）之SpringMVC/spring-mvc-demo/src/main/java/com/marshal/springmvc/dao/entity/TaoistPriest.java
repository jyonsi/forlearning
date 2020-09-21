package com.marshal.springmvc.dao.entity;

/**
 * @Author 王毅
 * @Date 2020/3/21 16:16
 */
public class TaoistPriest {

    private String name;
    private String sex;
    private Integer age;
    private Double height;
    private Double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

//    @Override
//    public String toString() {
//        return "TaoistPriest{" +
//                "name='" + name + '\'' +
//                ", sex='" + sex + '\'' +
//                ", age=" + age +
//                ", height=" + height +
//                ", weight=" + weight +
//                '}';
//    }
}
