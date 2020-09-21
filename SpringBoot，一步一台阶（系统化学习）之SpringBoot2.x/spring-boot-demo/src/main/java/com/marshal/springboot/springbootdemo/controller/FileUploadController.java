package com.marshal.springboot.springbootdemo.controller;

import com.marshal.springboot.springbootdemo.dao.entity.Weapon;
import com.marshal.springboot.springbootdemo.utils.FileUploadUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author 王毅
 * @Date 2020/4/25 10:20
 */
@Controller
@RequestMapping("fileupload")
public class FileUploadController {

    private final Logger logger = LoggerFactory.getLogger(FileUploadController.class);

    @Value("${file.upload.path}")
    private String filePath = null;

    private final ResourceLoader resourceLoader;

    public FileUploadController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @RequestMapping(value = "showPicture",
                    method = RequestMethod.GET)
    public ResponseEntity showPicture(String fileName){
        return ResponseEntity.ok(resourceLoader.getResource("file:"+filePath+fileName));
    }

    @RequestMapping("toMethod1")
    public String toMethod1(){
        return "fileupload/method1commit";
    }

    @RequestMapping("method1")
    public ModelAndView method1(@RequestParam("image") MultipartFile file,
                                Weapon weapon) throws IOException {

        String originalFileName = file.getOriginalFilename();
        String fileParamName = file.getName();

        String suffix = originalFileName.substring(originalFileName.lastIndexOf("."));
        String uploadFileName = UUID.randomUUID() + suffix;

        file.transferTo(new File(filePath + uploadFileName));

        weapon.setImageName(uploadFileName);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("weapon",weapon);
        modelAndView.setViewName("fileupload/method1result");

        return modelAndView;

    }

    @RequestMapping("toMethod2")
    public String toMethod2(){
        return "fileupload/method2commit";
    }

    @RequestMapping("method2")
    public ModelAndView method2(@RequestParam("image") MultipartFile[] files,
                                Weapon weapon) throws IOException {

        List<String> uploadFileNameList = null;

        if(files.length != 0){

            uploadFileNameList = new ArrayList<String>();

            for(int i = 0 ; i < files.length ; i++){

                String originalFileName = files[i].getOriginalFilename();
                String fileParamName = files[i].getName();

                String suffix = originalFileName.substring(originalFileName.lastIndexOf("."));
                String uploadFileName = UUID.randomUUID() + suffix;

                FileCopyUtils.copy(files[i].getInputStream(), new FileOutputStream(filePath + uploadFileName));

                uploadFileNameList.add(uploadFileName);
            }
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("weapon",weapon);
        modelAndView.addObject("uploadFileNameList",uploadFileNameList);
        modelAndView.setViewName("fileupload/method2result");

        return modelAndView;

    }

    @RequestMapping("toMethod3")
    public String toMethod3(){
        return "fileupload/method3commit";
    }

    @RequestMapping("method3")
    public ModelAndView method3(@RequestParam("image") MultipartFile[] files,
                                Weapon weapon) throws IOException {

        logger.info("多文件上传！！");

        List<String> uploadFileNameList = FileUploadUtil.fileUpload(files,filePath);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("weapon",weapon);
        modelAndView.addObject("uploadFileNameList",uploadFileNameList);
        modelAndView.setViewName("fileupload/method3result");

        return modelAndView;

    }


}
