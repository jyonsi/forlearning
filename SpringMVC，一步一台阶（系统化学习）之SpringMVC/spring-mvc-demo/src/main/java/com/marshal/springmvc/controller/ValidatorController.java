package com.marshal.springmvc.controller;

import com.marshal.springmvc.dao.entity.Customer;
import com.marshal.springmvc.utils.SpringMvcValidatorUtil;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 王毅
 * @Date 2020/3/27 9:09
 */
@Controller
@RequestMapping("validator")
public class ValidatorController {

    @RequestMapping("method1")
    public ModelAndView method1(Customer customer){

        System.out.println("ValidatorController method1 ... ");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result",customer);
        modelAndView.setViewName("validator/method1result");

        return modelAndView;
    }

    @RequestMapping("method2")
    public ModelAndView method2(Customer customer){

        System.out.println("ValidatorController method2 ... ");

        ModelAndView modelAndView = new ModelAndView();

        boolean isNick = customer.getNick().matches("[\\u4e00-\\u9fa5]{4,10}");
        boolean isPassword = customer.getPassword().matches("\\w{3,10}");
        boolean isName = customer.getName().matches("[\\u4e00-\\u9fa5]{2,4}");
        boolean isTelephone = customer.getTelephone().matches("0?(13|14|15|17|18)[0-9]{9}");
        boolean isEmail = customer.getEmail().matches("\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}");

        if(isNick && isPassword && isName && isTelephone && isEmail){
            modelAndView.addObject("result",customer);
        }else{
            modelAndView.addObject("result","提交的参数是有问题的");
        }

        modelAndView.setViewName("validator/method2result");

        return modelAndView;
    }

    @RequestMapping("method3")
    public ModelAndView method3(@Valid Customer customer,
                                BindingResult bindingResult){

        System.out.println("ValidatorController method3 ... ");
        ModelAndView modelAndView = new ModelAndView();

        if(bindingResult.hasErrors()){

            List<String> fieldErrorMessages = new ArrayList<String>();

            List<FieldError> fieldErrorList = bindingResult.getFieldErrors();
            for(FieldError fieldError:fieldErrorList){
                String fieldErrorName = fieldError.getField();
                String fieldErrorMessage = fieldError.getDefaultMessage();
                fieldErrorMessages.add(fieldErrorName + " —— " + fieldErrorMessage);
            }

            modelAndView.addObject("result", fieldErrorMessages.toString());
        }else {
            modelAndView.addObject("result",customer);
        }

        modelAndView.setViewName("validator/method3result");

        return modelAndView;
    }

    @RequestMapping("method4")
    public ModelAndView method4(@Valid Customer customer,
                                BindingResult bindingResult){

        System.out.println("ValidatorController method4 ... ");

        ModelAndView modelAndView = new ModelAndView();

        List<String> fieldErrorMessages = SpringMvcValidatorUtil.validate(bindingResult);

        if(fieldErrorMessages != null){
            modelAndView.addObject("result", fieldErrorMessages.toString());
        }else {
            modelAndView.addObject("result", customer);
        }

        modelAndView.setViewName("validator/method4result");

        return modelAndView;
    }
}
