package cn.edu.ahtcm.util;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/* 4.定义一个TestFileChar类，要求如下：
(1)利用path类创建文件D:\java\myjava2\\hello2.txt;
(2)使用字符流FileWriter将“我爱你中国China”（使用UTF-8编码）写入hello2.txt 文件，清空缓冲区并关闭写入流；
(4)使用字符流FileReader将hello2.txt 文件里字符逐个打印输出；
(5)对可能的异常进行捕获，打印异常堆栈信息；
(6)使用BufferedReader一次读取一行字符，并打印输出读取信息；
(7)关闭写入和读取字符流。
 */
public class TestFileChar {

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
				Files.createFile(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileWriter writer = null;
		try {
			writer = new FileWriter("D:\\java\\myjava2\\hello2.txt");
			writer.write("我爱你中国China");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			writer.close();
		}
		
		FileReader reader = new FileReader("D:\\java\\myjava2\\hello2.txt");
		int n;
		while((n=reader.read())!=-1){
			System.out.println((char)n);
		}
		
		BufferedReader br = Files.newBufferedReader(file);
		String str = null;
		while((str = br.readLine())!= null){
			System.out.println(str);
		}

	}

}
