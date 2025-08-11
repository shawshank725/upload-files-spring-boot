package com.Uploadfiles.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOError;
import java.io.IOException;

public interface FileUpload {

    String uploadFile(MultipartFile multipartFile) throws IOException;
}
