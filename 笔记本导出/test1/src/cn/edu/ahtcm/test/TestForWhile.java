package cn.edu.ahtcm.test;
/*
 * date:2021.4.3
 * author:耿立博
 * Student Number:2019207320123
 *分别利用for循环和while循环，计算1-100奇数和，打印输出结果
 */
public class TestForWhile {

	public static void main(String[] args) {
//		int s = 0;
//		for (int i=1; i<=100; i+=2 ){
//			s+=i;
//		}
//		System.out.println(s);
		int s = 0;
		int i=1;
		while(i<=100){
			s+=i;
			i+=2;
		}
		System.out.println(s);
	}
}
