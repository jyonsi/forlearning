package com.marshal.springmvc.controller;

import com.marshal.springmvc.dao.entity.Marshal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author 王毅
 * @Date 2020/3/18 21:15
 */
@Controller
@RequestMapping("/parameter")
public class ParameterController {

    @RequestMapping(value = "method1", method = RequestMethod.POST)
    public String method1(HttpServletRequest request,
                          HttpServletResponse response,
                          HttpSession session){

        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String age = request.getParameter("age");
        String phone = request.getParameter("phone");
        String nativePlace = request.getParameter("nativePlace");

        System.out.println("name is : "+name);
        System.out.println("sex is : "+sex);
        System.out.println("age is : "+age);
        System.out.println("phone is : "+phone);
        System.out.println("nativePlace is : "+nativePlace);

        String result = name + " : " + sex + " : " + age + " : " + phone + " : " + nativePlace;

        request.setAttribute("result",result);

        return "parameter/method1result";

    }

    @RequestMapping(value = "/method2/{mname}/{msex}/{mage}/{mphone}/{mnativePlace}", method = RequestMethod.POST)
    public String method2(@PathVariable("mname") String name,
                          @PathVariable("msex") String sex,
                          @PathVariable("mage") String age,
                          @PathVariable("mphone") String phone,
                          @PathVariable("mnativePlace") String nativePlace, Model model){

        System.out.println("name is : "+name);
        System.out.println("sex is : "+sex);
        System.out.println("age is : "+age);
        System.out.println("phone is : "+phone);
        System.out.println("nativePlace is : "+nativePlace);

        String result = name + " : " + sex + " : " + age + " : " + phone + " : " + nativePlace;

        model.addAttribute("result", result);

        return "parameter/method2result";

    }

    @RequestMapping(value = "/method3", method = RequestMethod.POST)
    public String method3(@RequestParam(value="mname", required = true, defaultValue = "Marshal") String name,
                          @RequestParam(value="msex", required = true, defaultValue = "1") String sex,
                          @RequestParam(value="mage", required = true, defaultValue = "99") String age,
                          @RequestParam(value="mphone", required = true, defaultValue = "185111111111") String phone,
                          @RequestParam(value="mnativePlace", required = true, defaultValue = "北京") String nativePlace, Map<String, Object> map){

        System.out.println("name is : "+name);
        System.out.println("sex is : "+sex);
        System.out.println("age is : "+age);
        System.out.println("phone is : "+phone);
        System.out.println("nativePlace is : "+nativePlace);

        String result = name + " : " + sex + " : " + age + " : " + phone + " : " + nativePlace;

        map.put("result", result);

        return "parameter/method3result";

    }

    @RequestMapping(value = "/method4", method = RequestMethod.POST)
    public String method4(Marshal marshal, Model model){

        System.out.println("name is : "+marshal.getName());
        System.out.println("sex is : "+marshal.getSex());
        System.out.println("age is : "+marshal.getAge());
        System.out.println("height is : "+marshal.getHeight());
        System.out.println("weight is : "+marshal.getWeight());

        System.out.println(marshal);

        model.addAttribute("result", marshal);

        return "parameter/method4result";

    }

    @RequestMapping(value = "/method5", method = RequestMethod.POST)
    public String method5(Marshal marshal, Model model){

        System.out.println("name is : "+marshal.getName());
        System.out.println("sex is : "+marshal.getSex());
        System.out.println("age is : "+marshal.getAge());
        System.out.println("height is : "+marshal.getHeight());
        System.out.println("weight is : "+marshal.getWeight());
        System.out.println("pet name is : "+marshal.getPet().getName());
        System.out.println("weight is : "+marshal.getPet().getColor());
        System.out.println("weight is : "+marshal.getWeapon().getName());
        System.out.println("weight is : "+marshal.getWeapon().getMaterial());

        System.out.println(marshal);

        model.addAttribute("result", marshal);

        return "parameter/method5result";

    }

    @RequestMapping(value = "/method6", method = RequestMethod.POST)
    public String method6(@RequestParam(value = "hobby") String[] hobbys){

        for(int i=0; i < hobbys.length; i++){
            System.out.println("爱好"+ (i+1) + " : " +hobbys[i]);
        }

        return "parameter/method6result";

    }

}
