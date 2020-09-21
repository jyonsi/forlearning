package com.marshal.springmvc.controller;

import com.marshal.springmvc.dao.entity.Marshal;
import com.marshal.springmvc.dao.entity.Pet;
import com.marshal.springmvc.dao.entity.TaoistPriest;
import com.marshal.springmvc.dao.entity.Weapon;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 王毅
 * @Date 2020/3/21 14:58
 */
@Controller
@RequestMapping("json")
public class JsonController {

    @ResponseBody
    @RequestMapping("method1")
    public String method1(){

        System.out.println("json method1 ok !!");
        String result = "json method1 ok !!";

        return result;
    }

    @ResponseBody
    @RequestMapping("method2")
    public Marshal method2(){

        System.out.println("json method2 ok !!");

        Pet pet = new Pet();
        pet.setName("啸天犬");
        pet.setColor("黑色");

        Weapon weapon = new Weapon();
        weapon.setName("三刃枪");
        weapon.setMaterial("精钢");

        Marshal marshal = new Marshal();
        marshal.setName("二郎神");
        marshal.setSex(1);
        marshal.setAge(10000);
        marshal.setHeight(200D);
        marshal.setWeight(100D);

        marshal.setWeapon(weapon);
        marshal.setPet(pet);

        return marshal;
    }

    @ResponseBody
    @RequestMapping("method3")
    public Boolean method3(){

        System.out.println("json method3 ok !!");

        return true;
    }

    @ResponseBody
    @RequestMapping("method4")
    public TaoistPriest method4(@RequestBody TaoistPriest taoistPriest){

        System.out.println("json method4 ok !!");

        System.out.println("name is : "+taoistPriest.getName());
        System.out.println("sex is : "+taoistPriest.getSex());
        System.out.println("age is : "+taoistPriest.getAge());
        System.out.println("height is : "+taoistPriest.getHeight());
        System.out.println("weight is : "+taoistPriest.getWeight());

        return taoistPriest;
    }

    @ResponseBody
    @RequestMapping("method5")
    public TaoistPriest method5(@RequestBody TaoistPriest taoistPriest){

        System.out.println("json method5 ok !!");

        System.out.println("name is : "+taoistPriest.getName());
        System.out.println("sex is : "+taoistPriest.getSex());
        System.out.println("age is : "+taoistPriest.getAge());
        System.out.println("height is : "+taoistPriest.getHeight());
        System.out.println("weight is : "+taoistPriest.getWeight());

        return taoistPriest;
    }

    @ResponseBody
    @RequestMapping("method6")
    public TaoistPriest method6(@RequestBody TaoistPriest taoistPriest){

        System.out.println("json method6 ok !!");

        System.out.println("name is : "+taoistPriest.getName());
        System.out.println("sex is : "+taoistPriest.getSex());
        System.out.println("age is : "+taoistPriest.getAge());
        System.out.println("height is : "+taoistPriest.getHeight());
        System.out.println("weight is : "+taoistPriest.getWeight());

        return taoistPriest;
    }

}
