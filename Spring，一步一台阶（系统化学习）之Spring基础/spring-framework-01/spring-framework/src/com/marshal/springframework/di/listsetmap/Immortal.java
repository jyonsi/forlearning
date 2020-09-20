package com.marshal.springframework.di.listsetmap;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Immortal {

    private String name;
    private String sex;
    private Pet pet;
    private List clothes;
    private Set weapon;
    private Map tasks;
    private Properties residence;

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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public List getClothes() {
        return clothes;
    }

    public void setClothes(List clothes) {
        this.clothes = clothes;
    }

    public Set getWeapon() {
        return weapon;
    }

    public void setWeapon(Set weapon) {
        this.weapon = weapon;
    }

    public Map getTasks() {
        return tasks;
    }

    public void setTasks(Map tasks) {
        this.tasks = tasks;
    }

    public Properties getResidence() {
        return residence;
    }

    public void setResidence(Properties residence) {
        this.residence = residence;
    }

    @Override
    public String toString() {
        return "Immortal{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", pet=" + pet +
                ", clothes=" + clothes +
                ", weapon=" + weapon +
                ", tasks=" + tasks +
                ", residence=" + residence +
                '}';
    }
}
