package cn.edu.lahtcm.util;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class TestFileByte {

	public static void main(String[] args) {
		Path mydirectory = Paths.get("");
//		Collection Colletion
		if(!Files.exists(mydirectory)){
//				Files.createDirectory(arg0, arg1);//创建文件夹就一个不包含子文件夹。如D：\\myjava
//				Files.createDirectories(arg0, arg1);
			Files.createDirectory(mydirectory);
			
		}
	}
	//新建文件
	path file = Paths.

}
