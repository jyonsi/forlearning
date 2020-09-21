package com.marshal.springmvc.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 王毅
 * @Date 2020/3/27 10:51
 */
public class SpringMvcValidatorUtil {

    public static List<String> validate(BindingResult bindingResult){

        List<String> fieldErrorMessages = null;

        if(bindingResult.hasErrors()){

            fieldErrorMessages = new ArrayList<String>();

            List<FieldError> fieldErrorList = bindingResult.getFieldErrors();
            for(FieldError fieldError:fieldErrorList){
                String fieldErrorName = fieldError.getField();
                String fieldErrorMessage = fieldError.getDefaultMessage();
                fieldErrorMessages.add(fieldErrorName + " —— " + fieldErrorMessage);
            }
        }

        return fieldErrorMessages;
    }
}
