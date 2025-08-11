package com.Uploadfiles.controller;

import com.Uploadfiles.service.FileUpload;
import com.Uploadfiles.service.FileUploadImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class FileUploadController {

    private final FileUpload fileUpload;

    @Autowired
    public FileUploadController(FileUpload fileUpload){
        this.fileUpload = fileUpload;
    }

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("image")MultipartFile multipartFile,
                             Model model) throws IOException {
        String imageURL = fileUpload.uploadFile(multipartFile);
        model.addAttribute("image",imageURL);
        return "gallery";

    }
}
