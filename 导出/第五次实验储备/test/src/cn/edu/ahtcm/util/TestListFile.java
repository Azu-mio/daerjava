package cn.edu.ahtcm.util;

/*
 * 列出C:\\Windows 文件下的所有文件和文件夹，打印输出信息。
 */
import java.io.File;

public class TestListFile {

	public static void main(String[] args) {
		File f1 = new File("C:\\Windows");
		File[] files = f1.listFiles();
		if(files != null){
			for(File f : files){
				System.out.println(f);
			}
		}
	}

}
