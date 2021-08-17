package cn.edu.ahtcm.test;
/* 、6  2. 定义一个类TestParseException.java,要求如下
（1）利用Scanner类的next（）接受用户从键盘输入的5个数，放入一整型数组a[5];
（2) 对用户输入的数据进行parseInt转换，以确保存入数组a的是整型数据，如果输入数据不为整数，要捕获Integer.parseInt()产生的异常,显示“请输入整数”;
（3）循环打印输出每个元素，对于下标越界进行异常捕获,显示“只能打印a[4]整数”；
（4）最后不管是否有错误都打印输出“执行完毕”；
 */
import java.util.Scanner;

public class TestParseException {

	public static void main(String[] args) {
		int[] a = new int[5];
		String[] b = new String[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
			b[i]=sc.next();
		}
		
		try{
			for(int i=0;i<5;i++){
				a[i]=Integer.parseInt(b[i]);
			}
			
		}catch(Exception e){
			System.out.println(e);
			System.out.println("请输入整数");	
		}
		
		try{
			for(int i=0;i<=5;i++){
				System.out.println(a[i]);
			}		
		}catch(Exception e){
			System.out.println(e);
			System.out.println("只能打印a[4]整数");
		}finally{
			System.out.println("执行完毕");
		}

	}

}
