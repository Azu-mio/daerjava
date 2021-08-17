package 字符串和正则表达式;

public class TestString {

	public static void main(String[] args) {
		String s = "hello";
		s = "abcd";  //s不可变 此操作会新建一个s
		
		String s1 = "hello";//*字符串常量值，放在常量池
		String s2 = "hello";//*字符串常量值，放在常量池
		System.out.println(s1==s2);//结果为ture s1，s2都指向hello 这种定义方式定义的两个对象都指向一个"hello"
		System.out.println(s1.equals(s2));//*通常用来判断字符串是否相等。
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s3==s4);//结果为flase s1和s2赋值的是常量值 ；  new 出的对象为堆内存中，两者地址不一样不相等。
		System.out.println(s3.equals(s4));//结果为ture ，此句比较其内容
		
		
		System.out.println("hello");
		
		
//		String sql = "select * from user where name=";
//		sql = sql +"jack";
		StringBuilder sb = new  StringBuilder("");
		sb.append("wang");
		sb.append(" eight");
		sb.append(" egg");
		System.out.println(sb.toString());
		//StringBuffer 是线程安全的类，但是效率低
		//StringBuilder 效率高，线程不安全
		StringBuffer sb1 = new StringBuffer("");
		sb1.append("wang5");
		sb1.append(" eight");
		sb1.append(" egg");
		System.out.println(sb1.toString());
		
		String ss = "hello";
		String ss2 = ss.replace("l", "w");
		System.out.println(ss2);
		
		//java 8  java.lang string 查阅资料
		
		
	}

}
