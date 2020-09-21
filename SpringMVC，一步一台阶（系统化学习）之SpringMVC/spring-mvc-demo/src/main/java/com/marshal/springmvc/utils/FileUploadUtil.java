package com.marshal.springmvc.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author 王毅
 * @Date 2020/3/23 21:13
 */
public class FileUploadUtil {

    public static List<String> filesUpload(MultipartFile[] files,
                                           String filesUploadPath) throws IOException {

        List<String> filePathList = new ArrayList<String>();
        for(int i=0; i < files.length; i++){

            MultipartFile file = files[i];

            // 上传文件的原始名称
            String originalFilename = file.getOriginalFilename();

            StringBuffer fileName = new StringBuffer();
            fileName.append(UUID.randomUUID().toString())
                    .append(originalFilename.substring(originalFilename.lastIndexOf(".")));

            filePathList.add(fileName.toString());

            // 将上传文件拷贝到相应的目录下
            file.transferTo(new File(filesUploadPath + "/" +fileName.toString()));
        }

        return filePathList;
    }
}
