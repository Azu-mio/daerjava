package cn.edu.ahtcm.test;

import java.util.Scanner;

/*
 * date:2021.4.3
 * author:耿立博
 * Student Number:2019207320123
 * 检测用户从键盘输入的字符串，如果为“January”，输出“一月”，如果为“February”，
 	输出“二月”，…如果为“December”，输出为“十二月”。（利用switch语句，jdk1.7之后switch支持字符串比较）
 */
public class TestSwich {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month = sc.nextLine();
		switch(month){
		case "January":
			System.out.println("一月");break;
		case "February":
			System.out.println("二月");break;
		case "March":
			System.out.println("三月");break;
		case "April":
			System.out.println("四月");break;
		case "May":
			System.out.println("五月");break;
		case "June":
			System.out.println("六月");break;
		case "July":
			System.out.println("七月");break;
		case "August":
			System.out.println("九月");break;
		case "September":
			System.out.println("九月");break;
		case "October":
			System.out.println("十月");break;
		case "November":
			System.out.println("十一月");break;
		case "December":
			System.out.println("十二月");break;
		}
		
		
		
	}

}
