package cn.edu.ahtcm.util;
/*3.定义一个TestFileByte类，要求如下：
(1)利用path类创建文件夹D:\java\myjava2;
(2)利用path类创建文件D:\java\myjava2\\hello.txt;
(3)使用字节流FileOutputStream将“我爱你中国China”写入hello.txt 文件；
(4)使用字节流FileInputStream 将hello.txt 文件里字符逐个打印输出；
(5)对可能的异常进行捕获，打印异常堆栈信息；
(6)关闭写入和读取字节流。
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFileByte {
	public static void main(String[] args) throws IOException {
	Path mydirectory = Paths.get("D:\\java\\myjava2");
	if(!Files.exists(mydirectory)){
		try {
			Files.createDirectories(mydirectory);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	Path file = Paths.get("D:\\java\\myjava2\\hello.txt");
	if(!Files.exists(file)){
		try {
			Files.createDirectories(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	FileOutputStream fs = null;
	try {
		 fs = new FileOutputStream("D:\\java\\myjava2\\hello.txt");
		 fs.write("我爱你中国China".getBytes());
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		fs.close();
	}
	
	FileInputStream input = new FileInputStream("D:\\java\\myjava2\\hello.txt");
	int n;
	while((n=input.read())!=-1){
		System.out.println((char)n);
	}
	}

}
