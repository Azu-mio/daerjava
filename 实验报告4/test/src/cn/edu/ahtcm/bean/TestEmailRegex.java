package cn.edu.ahtcm.bean;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*5．新建一个java类TestEmailRegex，要求如下
（1）接收用户从键盘输入的邮箱；
（2）使用正则表达式判断用户输入的邮箱是否正确；
（3）打印输出判断结果。*/
// String EmailRegex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+){1,3}";
public class TestEmailRegex {
	private static final Pattern EMIAL_PATTERN = Pattern
			.compile("[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+){1,3}");
	
	public static boolean isEmail(String str){
		Matcher m = EMIAL_PATTERN.matcher(str);
		return m.matches();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		if(isEmail(email)){
			System.out.println("email格式正确");
		}else{
			System.out.println("email格式错误");
		}
		

	}

}
