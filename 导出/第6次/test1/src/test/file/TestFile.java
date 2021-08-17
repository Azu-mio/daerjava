package test.file;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		File f1 = new File("D:\\javafiletest\\文本1.txt");
		System.out.println(f1.getName());
		System.out.println(f1.length());
		
		if(f1.exists()){
			File f2 = new File("D:\\javafiletest\\文本100.txt");
//			f1.renameTo(f2); 加if 的话 if里面会运行 此步不要
			if(f1.renameTo(f2)){
				System.out.println("重命名成功！");
			}
		}
	}

}
