package cn.edu.lahtcm.util;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		File f1 = new File("D:\\javafiletest\\");//注意不要漏掉文件后缀名
		System.out.println(f1.getName());//***可以用来去除盘符
		System.out.println(f1.length()); //返回由此抽象路径名表示的文件的长度 例如可以返回文本的字数

		
//java对文件重命名
		
		//************注意一定要这样写 然后里面的if会执行 然后执行后就输出了
		if(f1.exists()){
			File f2 = new File("");
			if(f1.renameTo(f2)){
				System.out.println("重命名成功！");
			}
		}
	}

}
