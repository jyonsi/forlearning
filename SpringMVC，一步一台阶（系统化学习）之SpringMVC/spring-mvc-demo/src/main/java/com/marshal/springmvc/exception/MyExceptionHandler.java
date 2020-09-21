package com.marshal.springmvc.exception;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @Author 王毅
 * @Date 2020/3/26 10:46
 */
public class MyExceptionHandler implements HandlerExceptionResolver {

    private static Logger logger = Logger.getLogger(MyExceptionHandler.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,
                                         Object o,
                                         Exception e) {

        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        e.printStackTrace(printWriter);

        logger.info(stringWriter.toString());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result",stringWriter.toString());
        modelAndView.setViewName("exception/exceptionhandler");

        return modelAndView;

    }
}
