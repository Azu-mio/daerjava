package 字符串和正则表达式;

import java.util.Scanner;
//	String phoneRegEx = "^(13[0-9])|(15[5-9])|(17[0-9])\\d{8}$";
public class TestPhone {
	static boolean isPhoneNumber(String phone){
		return phone.matches("\\d{11}");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入手机号码");
		String phone = sc.nextLine();
		if(isPhoneNumber(phone)){
			System.out.println("手机号码格式正确");
		}else{
			System.out.println("手机号码格式错误");
		}
	}

}
