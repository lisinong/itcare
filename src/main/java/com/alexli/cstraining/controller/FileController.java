package com.alexli.cstraining.controller;

import com.alexli.cstraining.pojo.JsonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.util.Objects;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/file")
public class FileController {
    @Value("${prop.upload-folder}")
    private String UPLOAD_FOLDER;

    @PostMapping("/upload")
    public JsonResult upload(@RequestParam(name = "file", required = false) MultipartFile file) {
        if (file == null) {
            return new JsonResult("failed", "请选择要上传的图片");
        }
        if (file.getSize() > 1024 * 1024 * 10) {
            return new JsonResult("failed", "文件大小不能大于10M");
        }
        //获取文件后缀
        String suffix = Objects.requireNonNull(file.getOriginalFilename()).substring(file.getOriginalFilename().lastIndexOf(".") + 1, file.getOriginalFilename().length());
        if (!"jpg,jpeg,gif,png".toUpperCase().contains(suffix.toUpperCase())) {
            return new JsonResult("failed", "请选择jpg,jpeg,gif,png格式的图片");
        }
        String savePath = UPLOAD_FOLDER;
        File savePathFile = new File(savePath);
        if (!savePathFile.exists()) {
            //若不存在该目录，则创建目录
            savePathFile.mkdir();
        }
        //通过UUID生成唯一文件名
        String filename = UUID.randomUUID().toString().replaceAll("-","") + "." + suffix;
        try {
            //将文件保存指定目录
            file.transferTo(new File(savePath + filename));
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult("failed", "保存文件异常");
        }
        //返回文件名称
        return new JsonResult("success", "上传成功",filename);
    }
}
