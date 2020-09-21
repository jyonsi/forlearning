package com.marshal.springboot.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author 王毅
 * @Date 2020/4/22 10:17
 */
@Controller
@RequestMapping("pagejump")
public class PageJumpController {

    @RequestMapping("toMethod1")
    public String toMethod1(Model model){

        model.addAttribute("title","Page Jump Demo");

        return "pagejumg/method1commit";
    }

    @RequestMapping("method1")
    public String method1(Model model){

        model.addAttribute("title","Page Jump Demo");
        model.addAttribute("result1","Page Jump Demo method1 is ok!!");

        return "pagejumg/method1result";
    }

    @RequestMapping("method2")
    public void method2(HttpServletRequest request,
                        HttpServletResponse response,
                        HttpSession session) throws ServletException, IOException {

        request.setAttribute("result2","Page Jump Demo method2 is ok!!");

        request.getRequestDispatcher("method1").forward(request,response);
    }

    @RequestMapping("method3")
    public void method3(HttpServletRequest request,
                        HttpServletResponse response,
                        HttpSession session) throws ServletException, IOException {

        request.setAttribute("result3","Page Jump Demo method3 is ok!!");

        response.sendRedirect("method2");
    }

}
