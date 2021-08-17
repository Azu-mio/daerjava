package cn.edu.ahtcm.bean;
/*
 5. 定义一个类TestCollectionsSort，要求如下
（1）查阅api文档(https://www.matools.com/api/java8 )和互联网资料，利用Collections的sort()方法对list[“China”,”Usa”,”India”,”Japan”]进行字典排序，然后输出排序前和排序后的结果
（2）定义一个ArrayList，添加[“China”,”Usa”,”india”,”Japan”]元素；
（3）利用Collections的sort()方法对list[“China”,”Usa”,”india”,”Japan”]进行字典排序，然后输出排序前和排序后的结果
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TectCollectionSort {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("China");
		l.add("Usa");
		l.add("India");
		l.add("Japan");
		System.out.println("排序前："+l);
		Collections.sort(l);
		System.out.println("排序后："+l);
		
	}

}
