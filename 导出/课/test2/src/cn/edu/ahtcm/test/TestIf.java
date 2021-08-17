package cn.edu.ahtcm.test;

import java.util.Scanner;

/*
 * date:2021.4.3
 * author:耿立博
 * Student Number:2019207320123
 * 从键盘输入一行字符串，利用String类的contains函数测试是否包含“dog”字符串，
  	如果包含则打印输入“you are forbidden！”，否则输出“pass”（利用if—else结构）
 */
public class TestIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (s.contains("dog")) {
			System.out.println("you are forbidden！");
		} else {
			System.out.println("pass");
		}
	}

}
