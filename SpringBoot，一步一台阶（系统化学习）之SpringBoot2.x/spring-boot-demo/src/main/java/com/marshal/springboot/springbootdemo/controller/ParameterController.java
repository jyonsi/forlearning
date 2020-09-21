package com.marshal.springboot.springbootdemo.controller;

import com.marshal.springboot.springbootdemo.dao.entity.Student;
import com.marshal.springboot.springbootdemo.dao.entity.StudentVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author 王毅
 * @Date 2020/4/22 15:17
 */
@Controller
@RequestMapping("parameter")
public class ParameterController {

    @RequestMapping("toMethod1")
    public String toMethod1(Model model){

        model.addAttribute("title","Parameter Demo");

        return "parameter/method1commit";
    }

    @RequestMapping("method1")
    public String method1(HttpServletRequest request,
                          HttpServletResponse response,
                          HttpSession session){

        Student student = new Student();

        String studentName = request.getParameter("studentName");
        student.setStudentName(studentName);

        String studentSex = request.getParameter("studentSex");
        student.setStudentSex(new Integer(studentSex));

        String birthday = request.getParameter("birthday");
        student.setBirthday(birthday);

        String height = request.getParameter("height");
        student.setHeight(new Double(height));

        String weight = request.getParameter("weight");
        student.setWeight(new Double(weight));

        String classId = request.getParameter("classId");
        student.setClassId(new Long(classId));

        request.setAttribute("title","Parameter Demo");
        request.setAttribute("student",student);

        return "parameter/method1result";
    }

    @RequestMapping("toMethod2")
    public String toMethod2(Model model){

        model.addAttribute("title","Parameter Demo");

        return "parameter/method2commit";
    }

    @RequestMapping(value = "method2/{studentName}/{studentSex}/{birthday}/{height}/{weight}/{classId}",
                    method = RequestMethod.POST)
    public String method2(@PathVariable("studentName") String studentName,
                          @PathVariable("studentSex") String studentSex,
                          @PathVariable("birthday") String birthday,
                          @PathVariable("height") String height,
                          @PathVariable("weight") String weight,
                          @PathVariable("classId") String classId,
                          Model model){

        Student student = new Student();

        student.setStudentName(studentName);
        student.setStudentSex(new Integer(studentSex));
        student.setBirthday(birthday);
        student.setHeight(new Double(height));
        student.setWeight(new Double(weight));
        student.setClassId(new Long(classId));

        model.addAttribute("title","Parameter Demo");
        model.addAttribute("student",student);

        return "parameter/method2result";
    }

    @RequestMapping("toMethod3")
    public String toMethod3(Model model){

        model.addAttribute("title","Parameter Demo");

        return "parameter/method3commit";
    }

    @RequestMapping(value = "method3",
                    method = RequestMethod.POST)
    public String method3(@RequestParam(value = "studentName", required = true, defaultValue = "二郎神") String name,
                          @RequestParam(value = "studentSex", required = true, defaultValue = "1") String sex,
                          @RequestParam(value = "birthday", required = true, defaultValue = "1999-09-09") String birthday,
                          @RequestParam(value = "height", required = true, defaultValue = "190") String height,
                          @RequestParam(value = "weight", required = true, defaultValue = "78") String weight,
                          @RequestParam(value = "classId", required = true, defaultValue = "2") String classId,
                          Model model){

        Student student = new Student();

        student.setStudentName(name);
        student.setStudentSex(new Integer(sex));
        student.setBirthday(birthday);
        student.setHeight(new Double(height));
        student.setWeight(new Double(weight));
        student.setClassId(new Long(classId));

        model.addAttribute("title","Parameter Demo");
        model.addAttribute("student",student);

        return "parameter/method3result";
    }

    @RequestMapping("toMethod4")
    public String toMethod4(Model model){

        model.addAttribute("title","Parameter Demo");

        return "parameter/method4commit";
    }

    @RequestMapping(value = "method4",
                    method = RequestMethod.POST)
    public String method4(Student student,
                          Model model){

        model.addAttribute("title","Parameter Demo");
        model.addAttribute("student",student);

        return "parameter/method4result";
    }

    @RequestMapping("toMethod5")
    public String toMethod5(Model model){

        model.addAttribute("title","Parameter Demo");

        return "parameter/method5commit";
    }

    @RequestMapping(value = "method5",
                    method = RequestMethod.POST)
    public String method5(StudentVO studentVO,
                          Model model){

        model.addAttribute("title","Parameter Demo");
        model.addAttribute("studentVO",studentVO);

        return "parameter/method5result";
    }

    @RequestMapping("toMethod6")
    public String toMethod6(Model model){

        model.addAttribute("title","Parameter Demo");

        return "parameter/method6commit";
    }

    @RequestMapping(value = "method6",
                    method = RequestMethod.POST)
    public String method5(@RequestParam("hobby") String[] hobbys,
                          Model model){

        model.addAttribute("title","Parameter Demo");
        model.addAttribute("hobbys",hobbys);

        return "parameter/method6result";
    }
}
