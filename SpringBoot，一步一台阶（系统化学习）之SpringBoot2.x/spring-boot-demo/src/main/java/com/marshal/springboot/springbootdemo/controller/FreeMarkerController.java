package com.marshal.springboot.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 王毅
 * @Date 2020/4/21 21:45
 */
@Controller
@RequestMapping("freemarker")
public class FreeMarkerController {

    @RequestMapping("toMethod1")
    public String toMethod1(Model model){

        model.addAttribute("title","Freemarker Demo");

        return "freemarker/method1commit";
    }

    @RequestMapping("method1")
    public String method1(Model model){

        model.addAttribute("title","Freemarker Demo");
        model.addAttribute("result","I am a freemarker page.");

        return "freemarker/method1result";
    }
}
