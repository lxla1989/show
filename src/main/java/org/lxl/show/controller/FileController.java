package org.lxl.show.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.lxl.show.utils.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/file")
public class FileController {
	/** 接收文件的存放目录 */
	public static String uploadFilePath = FileUtils.getUploadPath();
	
	/**
	 * 接收文件上传, 支持多文件上传
	 * @param files 要存放的文件
	 * @return
	 */
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String upload(@RequestParam("file") MultipartFile[] files) {
		if (files.length == 0) return "file is null!";
		for (MultipartFile file : files) {
			if (file.getSize()  < 1) continue;
			// 获取上传的文件名
	        String fileName = file.getOriginalFilename();

	        // 文件后缀
	        String suffixName = fileName.substring(fileName.lastIndexOf("."));

	        // 重新生成唯一文件名，用于存储数据库
	        String newFileName = UUID.randomUUID().toString() + suffixName;

	        try {
	        	// 创建文件
				file.transferTo(new File(uploadFilePath + newFileName));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        return "success!";
	}
}
