package cn.edu.lahtcm.util;

import java.io.File;

public class File遍历 {

	public static void main(String[] args) {
		File f1 = new File("D:\\javafiletest\\");
		File[] files = f1.listFiles();
		for(File f:files){
			System.out.println(f);
			
		}

	}

}
