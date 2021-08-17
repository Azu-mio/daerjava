package cn.edu.ahtcm.test;

/*
 * date:2021.4.3
 * author:耿立博
 * Student Number:2019207320123
 * 定义一个数组b={1，2，3，4}，利用两种for循环格式
（提示：第二种格式for(int n:b)）打印数组元素，并计算数组元素之和，打印输出结果
 */
public class TestArray {

	public static void main(String[] args) {
		int b[] = { 1, 2, 3, 4 };
//		for (int i = 0; i < 4; i++) {
//			System.out.println(b[i]);
//		}
		
		for(int n:b){
			System.out.println(n);
		}

	}

}
