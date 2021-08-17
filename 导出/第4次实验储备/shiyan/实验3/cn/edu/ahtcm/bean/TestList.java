package cn.edu.ahtcm.bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
//（1）利用List接口和泛型新建一个ArrayList对象list，要求为String类型；
		List<String> list = new ArrayList<String>();
//（2）list添加“China”，“Usa”，“India”，“Japan”四个字符串；
		list.add("China");
		list.add("Usa");
		list.add("India");
		list.add("Japan");
//（3）打印输出list
		System.out.println(list);
//（4）用3种方式遍历list元素		
		System.out.println("==============1===================");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}	
		System.out.println("==============2===================");
		for(String s:list){
			System.out.println(s);
		}		
		System.out.println("==============3===================");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}		
//（5）删除索引为2的元素，然后打印输出list；
		list.remove(2);
		System.out.println(list);
	}

}
