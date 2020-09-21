package com.marshal.springboot.springbootdemo.dao.entity;

/**
 * @Author 王毅
 * @Date 2020/4/25 10:28
 */
public class Weapon {

    private String weaponName;
    private String material;
    private String imageName;

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponName='" + weaponName + '\'' +
                ", material='" + material + '\'' +
                ", imageName='" + imageName + '\'' +
                '}';
    }
}
