package com.marshal.springboot.springbootdemo.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 王毅
 * @Date 2020/4/24 17:59
 */
public class ValidatorUtil {

    public static List<String> validator(BindingResult bindingResult){

        List<String> filedErrorMessages = null;

        if(bindingResult.hasErrors()){

            filedErrorMessages = new ArrayList<String>();

            List<FieldError> fieldErrorList = bindingResult.getFieldErrors();
            for(FieldError fieldError:fieldErrorList){
                String filedErrorName = fieldError.getField();
                String filedErrorMessage = fieldError.getDefaultMessage();

                filedErrorMessages.add(filedErrorName + " : " + filedErrorMessage);
            }

        }

        return filedErrorMessages;
    }
}
