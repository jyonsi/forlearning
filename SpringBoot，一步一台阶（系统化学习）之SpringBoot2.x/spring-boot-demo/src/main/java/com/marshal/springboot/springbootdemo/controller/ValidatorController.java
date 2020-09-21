package com.marshal.springboot.springbootdemo.controller;

import com.marshal.springboot.springbootdemo.dao.entity.Customer;
import com.marshal.springboot.springbootdemo.utils.ValidatorUtil;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 王毅
 * @Date 2020/4/23 20:48
 */
@Controller
@RequestMapping("validator")
public class ValidatorController {

    @RequestMapping("toMethod1")
    public String toMethod1(Model model){

        model.addAttribute("title","页面校验测试提交页");

        return "validator/method1commit";
    }

    @RequestMapping("method1")
    public ModelAndView method1(Customer customer){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title","页面校验测试结果页");
        modelAndView.addObject("customer",customer);
        modelAndView.setViewName("validator/method1result");

        return modelAndView;
    }

    @RequestMapping("toMethod2")
    public String toMethod2(Model model){

        model.addAttribute("title","页面校验测试提交页");

        return "validator/method2commit";
    }

    @RequestMapping("method2")
    public ModelAndView method2(Customer customer){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title","页面校验测试结果页");

        boolean isNick = customer.getNick().matches("[\\u4e00-\\u9fa5]{4,10}");
        boolean isPassword = customer.getPassword().matches("\\w{3,10}");
        boolean isName = customer.getName().matches("[\\u4e00-\\u9fa5]{2,4}");
        boolean isTelephone = customer.getTelephone().matches("0?(13|14|15|17|18)[0-9]{9}");
        boolean isEmail = customer.getEmail().matches("\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}");

        if(isNick && isPassword && isName && isTelephone && isEmail){

            modelAndView.addObject("customer",customer);
            modelAndView.setViewName("validator/method2result");
        }else {

            modelAndView.setViewName("validator/method2failer");
        }

        return modelAndView;
    }

    @RequestMapping("toMethod3")
    public String toMethod3(Model model){

        model.addAttribute("title","页面校验测试提交页");

        return "validator/method3commit";
    }

    @RequestMapping("method3")
    public ModelAndView method3(@Valid Customer customer,
                                BindingResult bindingResult){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title","页面校验测试结果页");

        List<String> filedErrorMessages = null;

        if(bindingResult.hasErrors()){

            filedErrorMessages = new ArrayList<String>();

            List<FieldError> fieldErrorList = bindingResult.getFieldErrors();
            for(FieldError fieldError:fieldErrorList){
                String filedErrorName = fieldError.getField();
                String filedErrorMessage = fieldError.getDefaultMessage();

                filedErrorMessages.add(filedErrorName + " : " + filedErrorMessage);
            }

            modelAndView.addObject("filedErrorMessages",filedErrorMessages);
            modelAndView.setViewName("validator/method3failer");

        }else {

            modelAndView.addObject("customer",customer);
            modelAndView.setViewName("validator/method3result");
        }

        return modelAndView;
    }

    @RequestMapping("toMethod4")
    public String toMethod4(Model model){

        model.addAttribute("title","页面校验测试提交页");

        return "validator/method4commit";
    }

    @RequestMapping("method4")
    public ModelAndView method4(@Valid Customer customer,
                                BindingResult bindingResult){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title","页面校验测试结果页");

        List<String> filedErrorMessages = ValidatorUtil.validator(bindingResult);

        if(filedErrorMessages != null){

            modelAndView.addObject("filedErrorMessages",filedErrorMessages);
            modelAndView.setViewName("validator/method4failer");

        }else {

            modelAndView.addObject("customer",customer);
            modelAndView.setViewName("validator/method4result");
        }

        return modelAndView;
    }

}
