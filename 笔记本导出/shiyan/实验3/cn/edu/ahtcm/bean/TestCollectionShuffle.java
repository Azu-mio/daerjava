package cn.edu.ahtcm.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 6. 定义一个类TestCollectionsShuffle，要求如下
（1）查阅api文档(https://www.matools.com/api/java8 )和互联网资料，利用Collections的shuffle()对list进行洗牌(洗牌算法，即传入一个有序的List，可以随机打乱List内部元素的顺序，效果相当于让计算机洗牌)；
(2)定义一个ArrayList，循环添加1到20自然数；
(3)打印输出此list；
(4)使用Collections的shuffle()对list进行洗牌,打印输出洗牌后的list
 */

public class TestCollectionShuffle {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);l.add(2);l.add(3);l.add(4);l.add(5);
		l.add(6);l.add(7);l.add(8);l.add(9);l.add(10);
		l.add(11);l.add(12);l.add(13);l.add(14);l.add(15);
		l.add(16);l.add(17);l.add(18);l.add(19);l.add(20);
		System.out.println("处理前："+l);
		Collections.shuffle(l);
		System.out.println("处理后："+l);
		
	}

}
