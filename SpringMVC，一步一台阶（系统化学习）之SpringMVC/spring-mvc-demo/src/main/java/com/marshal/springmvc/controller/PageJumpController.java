package com.marshal.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author 王毅
 * @Date 2020/3/18 19:55
 */
@Controller
@RequestMapping("/pagejump")
public class PageJumpController {

    @RequestMapping("method1")
    public void method1(HttpServletRequest request,
                                HttpServletResponse response,
                                HttpSession session) throws ServletException, IOException {

        System.out.println("pagejump method1 ok !!");

        String result = "pagejump method1 ok !! ";
        request.setAttribute("result",result);

        request.getRequestDispatcher("/page/pagejump/method1result.jsp").forward(request,response);

    }

    @RequestMapping("method2")
    public void method2(HttpServletRequest request,
                        HttpServletResponse response,
                        HttpSession session) throws ServletException, IOException {

        System.out.println("pagejump method2 ok !!");

        response.sendRedirect(request.getContextPath()+"/page/pagejump/method2result.jsp");
    }

    @RequestMapping("method3")
    public ModelAndView method3() {

        System.out.println("pagejump method3 ok !!");

        String result = "pagejump method3 ok !!";

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result",result);
        modelAndView.setViewName("pagejump/method3result");

        return modelAndView;
    }

    @RequestMapping("method4")
    public String method4(Model model) {

        System.out.println("pagejump method4 ok !!");

        String result = "pagejump method4 ok !!";

        model.addAttribute("result",result);

        return "pagejump/method4result";
    }

    @RequestMapping("method5")
    public String method5() {

        System.out.println("pagejump method5 ok !!");

        return "redirect:/page/pagejump/method5result.jsp";
    }


}
