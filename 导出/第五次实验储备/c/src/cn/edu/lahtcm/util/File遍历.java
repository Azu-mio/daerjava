package cn.edu.lahtcm.util;

import java.io.File;

public class File遍历 {

	public static void main(String[] args) {
		File f1 = new File("C:\\Windows");
		File[] files = f1.listFiles();
		if(files != null){
			for(File f : files){
				System.out.println(f);
			}

	}

}
