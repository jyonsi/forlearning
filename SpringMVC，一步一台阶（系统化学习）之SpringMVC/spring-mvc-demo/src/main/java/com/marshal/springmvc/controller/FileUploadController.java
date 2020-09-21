package com.marshal.springmvc.controller;

import com.marshal.springmvc.dao.entity.Weapon;
import com.marshal.springmvc.utils.FileUploadUtil;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author 王毅
 * @Date 2020/3/22 16:00
 */
@Controller
@RequestMapping("fileupload")
public class FileUploadController {

    @RequestMapping("method1")
    public ModelAndView method1(@RequestParam(value = "image") MultipartFile file,
                                Weapon weapon,
                                HttpServletRequest request) throws IOException {

        String uploadpath = request.getServletContext().getRealPath("/uploadfiles");
        System.out.println("文件的上传路径："+uploadpath);

        // 上传文件的原始名称
        String originalFilename = file.getOriginalFilename();
        // 表单中的参数属性名称
        String name = file.getName();

        weapon.setImagePath(originalFilename);

        // 将上传文件拷贝到相应的目录下
        file.transferTo(new File(uploadpath + "/" +originalFilename));

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("weapon",weapon);
        modelAndView.setViewName("fileupload/method1result");

        return modelAndView;
    }

    @RequestMapping("method2")
    public ModelAndView method2(@RequestParam(value = "image") MultipartFile[] files,
                                Weapon weapon,
                                HttpServletRequest request) throws IOException {

        // 文件上传路径
        String uploadpath = request.getServletContext().getRealPath("/uploadfiles");

        List<String> filePathList = new ArrayList<String>();
        for(int i=0; i < files.length; i++){

            MultipartFile file = files[i];

            // 上传文件的原始名称
            String originalFilename = file.getOriginalFilename();

            String uuidName = UUID.randomUUID().toString();
            String extraName = originalFilename.substring(originalFilename.lastIndexOf("."));

            StringBuffer fileName = new StringBuffer();
            fileName.append(uuidName).append(extraName);
            filePathList.add(fileName.toString());

            // 将上传文件拷贝到相应的目录下
            file.transferTo(new File(uploadpath + "/" +fileName.toString()));
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("weapon",weapon);
        modelAndView.addObject("filePathList",filePathList);
        modelAndView.setViewName("fileupload/method2result");

        return modelAndView;
    }

    @RequestMapping("toMethod3")
    public ModelAndView toMethod3(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("fileupload/method3commit");

        return modelAndView;
    }

    @RequestMapping("method3")
    public ModelAndView method3(@RequestParam(value = "image") MultipartFile[] files,
                                Weapon weapon,
                                HttpServletRequest request) throws IOException {

        // 文件上传路径
        String uploadpath = request.getServletContext().getRealPath("/uploadfiles");

        List<String> filePathList = new ArrayList<String>();
        for(int i=0; i < files.length; i++){

            MultipartFile file = files[i];

            // 上传文件的原始名称
            String originalFilename = file.getOriginalFilename();

            String uuidName = UUID.randomUUID().toString();
            String extraName = originalFilename.substring(originalFilename.lastIndexOf("."));

            StringBuffer fileName = new StringBuffer();
            fileName.append(uuidName).append(extraName);
            filePathList.add(fileName.toString());

            // 将上传文件拷贝到相应的目录下
            file.transferTo(new File(uploadpath + "/" +fileName.toString()));
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("weapon",weapon);
        modelAndView.addObject("filePathList",filePathList);
        modelAndView.setViewName("fileupload/method3result");

        return modelAndView;
    }

    @RequestMapping("method4")
    public ModelAndView method4(@RequestParam(value = "image") MultipartFile[] files,
                                Weapon weapon,
                                HttpServletRequest request) throws IOException {

        // 文件上传路径
        String uploadpath = request.getServletContext().getRealPath("/uploadfiles");

        // 调用工具类
        List<String> filePathList = FileUploadUtil.filesUpload(files, uploadpath);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("weapon",weapon);
        modelAndView.addObject("filePathList",filePathList);
        modelAndView.setViewName("fileupload/method3result");

        return modelAndView;
    }

    @ResponseBody
    @RequestMapping("method5")
    public List<String> method5(@RequestParam(value = "image") MultipartFile[] files,
                                Weapon weapon,
                                HttpServletRequest request) throws IOException {

        System.out.println(weapon);

        // 文件上传路径
//        String uploadpath = request.getServletContext().getRealPath("/uploadfiles");
        String uploadpath = "D:\\Develop\\Tomcat\\Server\\webapps\\uploadfiles";


        // 调用工具类
        List<String> filePathList = FileUploadUtil.filesUpload(files, uploadpath);

        return filePathList;
    }




}
