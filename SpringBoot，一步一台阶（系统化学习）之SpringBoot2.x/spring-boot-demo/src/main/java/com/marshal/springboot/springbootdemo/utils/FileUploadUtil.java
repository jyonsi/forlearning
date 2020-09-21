package com.marshal.springboot.springbootdemo.utils;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author 王毅
 * @Date 2020/4/25 15:23
 */
public class FileUploadUtil {

    public static List<String> fileUpload(MultipartFile[] files,String filePath) throws IOException {

        List<String> uploadFileNameList = null;

        if(files !=null && files.length != 0){

            uploadFileNameList = new ArrayList<String>();

            for(int i = 0 ; i < files.length ; i++){

                String originalFileName = files[i].getOriginalFilename();

                if (originalFileName.equals("")){
                    continue;
                }

                String fileParamName = files[i].getName();

                String suffix = originalFileName.substring(originalFileName.lastIndexOf("."));
                String uploadFileName = UUID.randomUUID() + suffix;

                FileCopyUtils.copy(files[i].getInputStream(), new FileOutputStream(filePath + uploadFileName));

                uploadFileNameList.add(uploadFileName);
            }
        }

        return uploadFileNameList;
    }
}
