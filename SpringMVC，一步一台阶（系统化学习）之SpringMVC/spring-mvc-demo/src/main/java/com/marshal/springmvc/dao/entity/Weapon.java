package com.marshal.springmvc.dao.entity;

/**
 * @Author 王毅
 * @Date 2020/3/19 15:56
 */
public class Weapon {

    private String name;
    private String material;
    private String imagePath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
