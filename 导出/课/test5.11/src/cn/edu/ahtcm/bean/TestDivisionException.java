package cn.edu.ahtcm.bean;
/*
2019207320123 
  耿立博 
21.5.11
 */
import java.util.Scanner;

public class TestDivisionException {
//（1）定义静态方法divisionNum，接收输入的两个整数数，返回整除结果，使用throws抛出ArithmeticException异常；
	public static double divisionNum(int a,int b) throws ArithmeticException {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//（2）main方法里接收键盘输入两个整数a,b;调用divisionNum方法，结果存入变量c，
//（3）如果除数为0，对异常进行捕获；
		Scanner in = new Scanner(System.in);
		double c = 0;
		int a = in.nextInt();
		int b = in.nextInt();
		
		try{
			 c = divisionNum(a,b);
		}catch(Exception e){
//（4）打印输出错误信息和错误堆栈信息；
			e.printStackTrace();
//			System.out.println(e);
		}finally{			
//（5）最后不管是否有错误都打印输出c的结果，并打印“计算完毕”。
			System.out.println(c);
			System.out.println("计算完毕");
		}
	}
}
