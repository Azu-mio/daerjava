package cn.edu.ahtcm.bean;
/*
 * 1.新建一个java类TestString，要求如下
（1）接收用户从键盘输入的字符串s1和s2，字符串内容为“hello，world！”；
（2）分别使用==和equals方法判断字符串是否相等，并打印输出结果；
（3）判断字符串s1是否以’h’开头，并打印输出结果；
（4）截取字符串，获取”world”单词，并打印输出结果；
（5）打印输出逗号,在字符串中的位置；
（6）对字符串中所有字母o替换为a；并打印输出结果.

 */
import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if (s1==s2){
			System.out.println("s1==s2");
		}else{
			System.out.println("s1 is not == s2");
		}
		if (s1.equals(s2)){
			System.out.println("s1 equals s2");
		}else{
			System.out.println("s1 is not equals s2");
		}
		
		/*substring(int beginIndex, int endIndex)
		 * 返回从起始位置（beginIndex）到目标位置（endIndex）之间的字符串，
		 * 但不包含目标位置（endIndex）的字符*/
//		if (s1.substring(0,1)=="h"){
//			System.out.println("s1 首字母为 h");
//		}else{
//			System.out.println("s1 首字母不为h");
//		}这个方法达不到效果省略不用！！！
		

		/*java.lang.String类中的一个方法
		 * public char charAt(int index)返回指定索引处的 char 值。
		 * 索引范围为从 0 到 length() - 1。序列的第一个 char 值在索引 0 处，
		 * 第二个在索引 1 处，依此类推，这类似于数组索引。*/
		if (s1.charAt(0)=='h'){
			System.out.println("s1 首字母为 h");
		}else{
			System.out.println("s1 首字母不为h");
		}
	
		System.out.println(s1.substring(6,11));
		/* indexOf(String str): 返回指定字符在字符串中第一次出现处的索引，
		 * 如果此字符串中没有这样的字符，则返回 -1。*/
		System.out.println(s1.indexOf(","));
		
		String s3=s1.replace("o","a");
		System.out.println(s3);
	}

}
