package cn.springcloud.book.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;  
  
@Controller  
public class ZuulUploadController {  
  
    @PostMapping("/upload")  
    @ResponseBody  
    public String uploadFile(@RequestParam(value = "file", required = true)MultipartFile file) throws IOException{  
        byte[] bytes = file.getBytes();  
        File fileToSave = new File(file.getOriginalFilename());  
        FileCopyUtils.copy(bytes, fileToSave);  
        return fileToSave.getAbsolutePath();  
    }  
}  