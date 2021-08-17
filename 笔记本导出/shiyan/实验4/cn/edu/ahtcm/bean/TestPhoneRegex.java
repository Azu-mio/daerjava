package cn.edu.ahtcm.bean;
/*4．新建一个java类TestPhoneRegex，要求如下
（1）接收用户从键盘输入的手机号；
（2）使用正则表达式判断用户输入的手机号是否正确，手机号码要求，见下图；
（3）打印输出判断结果。*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//String phoneRegex = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[6-8])|(18[0-9]))\\d{8}$";
public class TestPhoneRegex {
	
	private static final Pattern CHINA_PATTERN = Pattern
			.compile("^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[6-8])|(18[0-9]))\\d{8}$");
	
	public static boolean isChinaPhone(String str){
		Matcher m = CHINA_PATTERN.matcher(str);
		return m.matches();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phonenum = sc.nextLine();
		if(isChinaPhone(phonenum)){
			System.out.println("手机号码正确");
		}else{
			System.out.println("手机号码错误");
		}
	}

}
