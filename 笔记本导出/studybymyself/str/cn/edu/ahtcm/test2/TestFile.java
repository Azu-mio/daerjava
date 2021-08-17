package cn.edu.ahtcm.test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/* 1.定义一个TestFile类要求如下：
（1）利用java.nio.file.Files类在E:\myfile（Linux系统在/home/用户名/ myfile）路径下创建文件test.txt；
（2）向该文件写入字符串“我喜欢Java”；
（3）从test.txt文件中读取字符串，并打印输出；
（4）按照步骤1再创建一个文件test2.txt，并向该文件写入字符串“I hate java”；
（5）删除文件test2.txt
 */
public class TestFile {

	public static void main(String[] args) throws IOException {
		
		Path file = Paths.get("D:\\myfile\\test.txt");
		if(!Files.exists(file)){
			Files.createFile(file);
			} 
		
		FileWriter writer = new FileWriter("D:\\myfile\\test.txt");
		writer.write("我喜欢Java");
		writer.flush();
		writer.close();
	
		
		FileReader reader = new FileReader("D:\\myfile\\test.txt");
		int n;
		while((n=reader.read())!=-1){
			System.out.println((char)n);
		}
		
		Path file2 = Paths.get("D:\\myfile\\test2.txt");
		if(!Files.exists(file2)){
			Files.createFile(file2);
		}
		
		FileWriter writer2 = new FileWriter("D:\\myfile\\test2.txt");
		writer2.write("I hate java");
		writer2.flush();
		writer2.close();
		
		String path1 = "D:\\myfile\\test2.txt";
		Path delfile = Paths.get(path1);
		if(Files.exists(delfile)){
			Files.delete(delfile);
			System.out.println(path1+"删除成功！");
		}else{
			System.out.println(path1+"文件不存在！");
		}
	
	}
	
}



