package edu.scau.common.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @description:
 * @auther:cyf
 * @create:2020/6/26 14:20
 **/
public class FileUtil {
//    public static String dev = "D:/";//开发
    public static String pro = "/usr/local/";//上线

    public static String saveFile(MultipartFile file,String path) throws IOException {
        String fileName = file.getOriginalFilename();
        if (file.getOriginalFilename()==null)
        {
            return "null";
        }
        String filePath = pro + path +"/";
        File dest = new File(filePath + fileName);
        System.out.println(filePath+fileName);
        dest.createNewFile();
        file.transferTo(dest);
        return ApiResponse.URL+path+"/"+fileName;
    }
    public static Boolean deleteFile(String url){
        String oldPath = url;
        oldPath = oldPath.substring(26);//26
        System.out.println("old:"+oldPath);
        File oldFile = new File(pro+oldPath);///usr/local
        System.out.println("delete:" + pro+oldPath);
        Boolean result = oldFile.delete();
        return result;
    }
}
