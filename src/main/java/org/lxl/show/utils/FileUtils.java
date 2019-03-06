package org.lxl.show.utils;

import java.io.File;
import java.io.FileNotFoundException;

import org.springframework.util.ResourceUtils;

public class FileUtils {
	/** 当前操作系统文件分隔符 */
	private static String sepa = java.io.File.separator;
	
	public static String getUploadPath() {
		File path = null;
		try {
			path = new File(ResourceUtils.getURL("classpath:").getPath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if(!path.exists()) path = new File("");
		File upload = new File(path.getAbsolutePath(),"static/images/upload/");
		if(!upload.exists()) upload.mkdirs();
		return upload.getAbsolutePath() + sepa;
	}
}
