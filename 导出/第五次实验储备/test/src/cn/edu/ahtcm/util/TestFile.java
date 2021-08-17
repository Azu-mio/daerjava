package cn.edu.ahtcm.util;
/*
 1.定义一个类TestFile类要求如下：
（1）手动在D盘新建文件夹myjava，并将实验报告5_学号_班级_姓名.docx拷贝至D:\myjava；
（2）利用java.io.File创建文件文件对象f1，并打印文件信息；
（3）对文件进行重命名,将学号、班级、姓名替换自己的真实信息，需要先判断文件是否存在，如果存在则进行重命名，并打印输出“已重命名成功”信息，否则打印“文件不存在，无法重命名“。
 */
import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		File f1 = new File("D:\\myjava\\实验报告5_学号_班级_姓名.docx");
		System.out.println(f1.getName());
		
		if(f1.exists()){
			File f2 = new File("D:\\myjava\\实验报告5_2019207320123_19计算机3班_耿立博.docx");
			System.out.println("已重命名成功");		
		}else{
			System.out.println("文件不存在，无法重命名");
		}
	}

}
