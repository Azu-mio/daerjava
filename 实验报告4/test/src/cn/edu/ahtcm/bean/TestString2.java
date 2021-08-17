package cn.edu.ahtcm.bean;
/* 2. 新建一个java类TestString2
从键盘输入一行字符串“Dog loves”，利用String类的contains函数测试是否包含“Dog”字符串，
如果包含在字符串结尾添加“ bones”，并打印输出 （使用StringBuilder拼接），
否则输出“字符串不包含指定字符Dog”。
 */
import java.util.Scanner;

public class TestString2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		if(s1.contains("Dog")){
			StringBuilder sb = new  StringBuilder(s1);
			sb.append(" bones");
			System.out.println(sb);
		}else{
			System.out.println("字符串不包含指定字符Dog");
		}

	}

}
